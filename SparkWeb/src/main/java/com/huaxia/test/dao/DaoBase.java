package com.huaxia.test.dao;
import static com.huaxia.generated.Tables.USERS;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jooq.Condition;
import org.jooq.DSLContext;
import org.jooq.Field;
import org.jooq.Record;
import org.jooq.SelectJoinStep;
import org.jooq.SelectOnConditionStep;
import org.jooq.SelectSelectStep;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableRecordImpl;
import org.jooq.tools.JooqLogger;

import com.huaxia.generated.tables.records.UsersRecord;
import com.huaxia.test.bean.UserHost;
import com.huaxia.test.bean.Users;
import com.huaxia.test.bean.vo.UsersVo;
import com.huaxia.test.utils.page.Page;
import com.huaxia.test.utils.poll.DruidPool;
public class DaoBase {
	private static final JooqLogger log = JooqLogger.getLogger(DaoBase.class);
	static DSLContext ctx = DruidPool.getDSLContext();//数据库连接入口
	/**
	 * 获取一个表的所有内容
	 * @param table 表
	 * @param bean 实体类
	 * get(USERS, UsersVo.class);
	 */
	public <T> List<T> get(Table<?> table,Class<T> bean) {
		List<T> list = ctx.selectFrom(table).fetch().map(record->{
			T users = record.into(bean); 
			return users;
		});
		return list;
	}
	/**
	 * 根据参数删除
	 * @param table 表名
	 * @param map 删除参数
	 * 示例 :deleteByParam(USERS,map);
	 */
	public <R extends Record> void deleteByParam(Table<R> table, Map<Object, Object> map) {
		Condition condition = DSL.trueCondition();
		for(Object key:map.keySet()){
			condition = condition.and(((Field<String>) key).eq(String.valueOf(map.get(key))));
		}
		ctx.deleteFrom(table).where(condition).execute();
		log.debug(ctx.deleteFrom(USERS).where(condition).getSQL());
	}
	/**
	 * 根据参数查询
	 * @param table 表名
	 * @param map 查询参数
	 * @param bean 对应实体类
	 * @return
	 * 示例 :queryByParams(USERS,map,Users.class)
	 */
	public <T> List<T> queryByParams(Table<?> table, Map<Object, Object> map,Class<T> t) {
		Condition condition = DSL.trueCondition();
		for(Object key:map.keySet()){
			condition = condition.and(((Field<String>) key).eq(String.valueOf(map.get(key))));
		}
		List<T> list =  ctx.selectFrom(table).where(condition).fetch().map(record->{
			T users = record.into(t); 
			return users;
		});
		return list;
	}
	/**
	 * 批量删除
	 * @param table 表名
	 * @param td 表字段（一般是表id）
	 * @param idsArray 删除参数(Collection)
	 * 示例:batchDelete(USERS, USERS.USER_ID, idsArray);
	 */
	public void batchDelete(Table<?> table,TableField<?, ?> td,Collection<?> idsArray) {
		Condition condition = DSL.trueCondition();
		ctx.deleteFrom(table).where(td.in(idsArray)).execute();
	}
	/**
	 *  分页查询
	 * @param table 表名
	 * @param map 查询参数
	 * @param bean 对应实体类
	 * @param begin 开始位置
	 * @param end 结束位置
	 * @param TableField 排序行
	 * @return Map<String, Object>
	 * 示例 :queryPageByParams(USERS, map, UsersVo.class, usersVo.getBegin(), usersVo.getEnd(),USERS.USER_ID);
	 */
	public <T> Map<String, Object> queryPageByParams(Table<?> table, Map<Object, Object> map,Class<T> bean,int begin,int end,TableField<?, ?> td) {
		Map<String, Object> result = new HashMap<String, Object>();
		Condition condition = DSL.trueCondition();
		for(Object key:map.keySet()){
			condition = condition.and(((Field<String>) key).like((String) map.get(key)+"%"));
		}
		List<T> list = ctx.selectFrom(table).where(condition).orderBy(td.desc()).limit(begin, end).fetch()
				.map(record ->{
					T t = record.into(bean);
					return t;
				});
		log.debug(ctx.selectFrom(table).where(condition).orderBy(td.asc()).limit(begin, end).getSQL());
		int total = ctx.selectFrom(table).where(condition).fetchCount();
		result.put("rows", list);
		result.put("total", total);
		return result;
	}
/**
 * 
 * @param tables 查询表对象
 * @param queryField 查询表的字段，数组
 * @param bean	查询的bean
 * @param onCondition 关联条件数组
 * @param ifPage 是否分页
 * @return
 */
@SuppressWarnings({ "rawtypes", "unchecked" })
	public  <T extends Page>  Map<String,Object> queryMultiTables(Table[] tables,TableField[] queryField, T bean,Condition onCondition[],boolean ifPage){
		SelectSelectStep<Record> sss =  ctx.select();
		Condition condition = DSL.trueCondition();
		if(queryField!=null && queryField.length>0){
			for(int i =0;i<queryField.length;i++){
				sss = sss.select(queryField[i]);
			}
		}
		int begin = 0,end=0,total = 0;
		try {
			Method getBegin = bean.getClass().getSuperclass().getDeclaredMethod("getBegin",null);
			Method getEnd = bean.getClass().getSuperclass().getDeclaredMethod("getEnd",null);
			getBegin.setAccessible(true);
			getEnd.setAccessible(true);
			begin = ((Integer)getBegin.invoke(bean, null)).intValue();
			end = ((Integer)getEnd.invoke(bean, null)).intValue();
			java.lang.reflect.Field[]  a = bean.getClass().getDeclaredFields();
			Method getQueryMap = bean.getClass().getDeclaredMethod("getQueryMap", null);
			getQueryMap.setAccessible(true);
			HashMap<String, TableField> queryMap = (HashMap<String, TableField>)getQueryMap.invoke(bean, null);
			for(int i = 0;i<a.length;i++){
					String name = a[i].getName();
					String getName =  "get" + name.substring(0, 1).toUpperCase() + name.substring(1);
					if(name.equals("queryMap")){
						continue;
					}else{
						Object c = bean.getClass().getMethod(getName, null).invoke(bean, null);
						if(c!=null){
							if(getName.contains("Id")){
								condition = condition.and(queryMap.get(name).eq((Integer)c));
							}else{
								condition = condition.and(queryMap.get(name).like(c.toString()+"%"));
							}
						}
					}
			}
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
		List<T> list = null;
		if(tables!=null && tables.length>0){
			SelectJoinStep<Record> sjs = sss.from(tables[0]);
			if(tables.length == 1){
				list = (List<T>) sjs.where(condition).limit(begin,end).fetchInto(bean.getClass());
				total = sjs.where(condition).fetchCount();
			}else{
				SelectOnConditionStep<Record> soc = null;
				for(int i =1;i<tables.length;i++){
					soc = sjs.join(tables[i]).on(onCondition[i-1]);
				}
				if(ifPage){
					total = soc.where(condition).fetchCount();
					list = (List<T>) soc.limit(begin,end).fetchInto(bean.getClass());
				}else{
					list = (List<T>) soc.fetchInto(bean.getClass());
				}
 			}
		}
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("rows", list);
		map.put("total", total);
		
		return map;
	}
	public static void main(String args[]){
		  UserHost a = new UserHost();
		  a.setAge("11");
		  a.setPageSize(20);
		  a.setCurrentPage(3);
		  try {
			Method c = a.getClass().getSuperclass().getDeclaredMethod("getBegin",null);
			c.setAccessible(true);
				Object x = c.invoke(a, null);
				System.out.println(x);
			} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
				e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
		  
//		  int x = ctx.select().from(USERS).fetchCount();
		  System.out.println(a);
	}
}
