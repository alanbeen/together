package com.huaxia.test.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import javax.security.auth.login.Configuration;
import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

import org.jooq.Condition;
import org.jooq.Field;
import org.jooq.Record;
import org.jooq.Record2;
import org.jooq.ResultQuery;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;

import static com.huaxia.generated.Tables.*;

import com.alibaba.druid.sql.visitor.functions.Insert;
import com.huaxia.generated.tables.*;
import com.huaxia.generated.tables.records.UsersRecord;
import com.huaxia.test.bean.vo.UsersVo;
import com.huaxia.test.bean.UserAndRole;
import com.huaxia.test.bean.UserHost;
import com.huaxia.test.bean.Users;
/**
 * 数据库操作语句
 * @author lnb
 *
 */
public class JooqDao extends DaoBase{
	public List<UsersRecord> test(){
//		ctx.transaction(configuration -> {
//			ctx.update(ROLES)
//		        .set(ROLES.ROLE_NAME, "test885")
//		        .where(ROLES.ROLE_ID.eq(Integer.valueOf(2)))
//		        .execute();
//			ctx.update(ROLES)
//		        .set(ROLES.ROLE_NAME, "test8555")
//		        .where(ROLES.ROLE_ID.eq(Integer.valueOf(1)))
//		        .execute();
////		      int i = 1/0;
//		      System.out.println("end");
//		    });
//		List<UsersVo> list = ctx.selectFrom(USERS).fetch().map(record -> { 
//			UsersVo users = record.into(UsersVo.class); 
//			return users;
//		});
		List<UsersRecord> list = ctx.selectFrom(USERS).fetch().map(record -> { 
			UsersRecord users = record.into(UsersRecord.class); 
			return users;
		});
		return list;
	}
	/**
	 * 获取数据测试
	 */
	public void getTest(){
		List<UsersVo> usersVos = get(USERS, UsersVo.class);
		for(int i=0;i<usersVos.size();i++){
			System.out.println(usersVos.get(i).getUserName());
		}
	}
	
	/**
	 * 单条数据入                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   库
	 */
	public void insertTest(UsersRecord uRecord){
		List<UsersRecord> list = new ArrayList<>();
		list.add(uRecord);
		ctx.batchInsert(list).execute();
	}
	/**
	 * 多条数据入库
	 */
//	public void batchInsertTest(){
//		List<UsersVo> list = new ArrayList<>();
//		for(int i=0;i<2;i++){
//			UsersVo usersVo= new UsersVo();
//			usersVo.setUserName("test insert2");
//			usersVo.setUserPassword("000000");
//			list.add(usersVo);
//		}
//		batchInsert(USERS, list);
//	}
	/**
	 *条件删除,
	 */
	public void deleteTest(){
		Map<Object,Object> map = new HashMap();
		map.put(USERS.USER_NAME, "admin2");
		map.put(USERS.USER_PASSWORD, "111");
		deleteByParam(USERS,map);
	}
	/**
	 * 按条件查找,
	 */
//	@Test
	public void queryTest(){
		Map<Object,Object> map = new HashMap();
		map.put(USERS.USER_NAME, "admins");
		map.put(USERS.USER_PASSWORD, "1");
		List<Users> lsit = (List<Users>) queryByParams(USERS,map,Users.class);
		System.out.println(lsit);
	}
//	public void test2(){
//		List<UsersRecord> list = new ArrayList<>();
//		for(int i=0;i<2;i++){
//			UsersRecord myUsers2= new UsersRecord();
//			myUsers2.setUserName("test insert3");
//			myUsers2.setUserPassword("000000");
//			list.add(myUsers2);
//		}
//		batchInsert(USERS, list);
//	}
	// Higher order, SQL query producing function:
	public boolean login(String userName, String pwd) {
		HashMap<Object,Object> map = new HashMap();
		map.put(USERS.USER_NAME, userName);
		map.put(USERS.USER_PASSWORD, pwd);
		List<UsersVo> list = (List<UsersVo>)queryByParams(USERS,map,UsersVo.class);
//		return list;
//				ctx.selectFrom(USERS)
//		.where(USERS.USER_NAME.eq(userName)).and(USERS.USER_PASSWORD.eq(pwd)).fetch().map(record -> { 
//			UsersVo users = record.into(UsersVo.class); 
//			return users;
//			});
		if (!list.isEmpty()) {
			return true;
		}else{
			return false;
		}
	}
	
	
	//分页查询
	public Map<String, Object> findUsersByPage(UsersVo usersVo) {
		Map<Object, Object> map = new HashMap<>();
		if (usersVo!=null) {
			if (usersVo.getUserName()!=null&&!usersVo.getUserName().equals("")) {
				map.put(USERS.USER_NAME, usersVo.getUserName());
			}
			if (usersVo.getUserPassword()!=null&&!usersVo.getUserPassword().equals("")) {
				map.put(USERS.USER_PASSWORD, usersVo.getUserPassword());
			}
		}
		return queryPageByParams(USERS, map, UsersVo.class, usersVo.getBegin(), usersVo.getEnd(),USERS.USER_ID);
	}
	//新增用户入库
	public void usersSave(UsersRecord users) {
		ctx.transaction(configuration -> {
			ctx.batchInsert(users).execute();
		});
	}
	//根据id获取用户
	public List<UsersVo> getUserById(UsersVo users) {
		Map<Object,Object> map = new HashMap();
		map.put(USERS.USER_ID,users.getUserId());
		List<UsersVo> usersVo = (List<UsersVo>) queryByParams(USERS, map, UsersVo.class);
		return usersVo;
	}
	//用户编辑保存
	public void userEditSave(UsersRecord users) {
		int userid = users.getUserId();
		ctx.transaction(Configuration ->{
			ctx.update(USERS).set(users).where(USERS.USER_ID.eq(userid)).execute();
		});
	}
	//批量删除
	public void deleteUsers(Collection<?> idsArray) {
		batchDelete(USERS, USERS.USER_ID, idsArray);
	}
	//根据用户名获取用户
	public List<UsersVo> getUserByName(UsersVo users) {
		Map<Object,Object> map = new HashMap();
		map.put(USERS.USER_NAME,users.getUserName());
		List<UsersVo> usersVo = (List<UsersVo>) queryByParams(USERS, map, UsersVo.class);
		return usersVo;
	}
	
	//��ҳ��ѯ2
   public Map<String,Object> findUsersPage2(UsersVo usersVo){
	   Map<Object,Object> map = new HashMap<>();
	   if(usersVo!=null){
		   if(usersVo.getUserName()!=null&&!usersVo.getUserName().equals("")){
			   map.put(USERS.USER_NAME, usersVo.getUserName());
		   }
		   if(usersVo.getUserPassword()!=null&&!usersVo.getUserPassword().equals("")){
			   map.put(USERS.USER_PASSWORD,usersVo.getUserPassword());
		   }  
	   }
	   return queryPageByParams(USERS,map,UsersVo.class,usersVo.getBegin(),usersVo.getEnd(),USERS.USER_ID);
	   
   }
   //�����û�����ȡ�û�2
   public List<UsersVo> getUserByName2(UsersVo users) {
		Map<Object,Object> map = new HashMap();
		map.put(USERS.USER_NAME,users.getUserName());
		List<UsersVo> usersVo = (List<UsersVo>) queryByParams(USERS, map, UsersVo.class);
		return usersVo;
	}
 //�����û����
   public void usersSave2(UsersRecord users){
	   ctx.transaction(configuration -> {
		   ctx.batchInsert(users).execute();
	   });
   }
/**
 * 关联查询用户表，主机表
 * @param queryField
 * @param userHost
 * @return
 */
   public Map<String,Object> getUserHost(TableField[] queryField,UserHost userHost,boolean ifPage){
		Condition onCondition[] = {DSL.trueCondition().and(USERS.USER_ID.equal(HOST.USER_ID))};
		Table[] tables = {USERS,HOST};
		Map<String,Object> map = queryMultiTables(tables, queryField, userHost, onCondition,ifPage);
		return map;
	}
/**
 * 关联查询用户表，用户角色表，角色表
 * @param queryField
 * @param roleUser
 * @return
 */
	public Map<String,Object> getUserRole(TableField[] queryField,UserAndRole roleUser,boolean ifPage){
		Condition onCondition[] = {DSL.trueCondition().and(USERS.USER_ID.equal(ROLE_USER.USER_ID)),DSL.trueCondition().and(ROLE_USER.ROLE_ID.equal(ROLES.ROLE_ID))};
		Table[] tables = {USERS,ROLE_USER,ROLES};
		Map<String,Object> map = queryMultiTables(tables, queryField, roleUser, onCondition,ifPage);
		return map;
	}
}



/*
 *   	//�����û����
	public void usersSave(UsersRecord users) {
		ctx.transaction(configuration -> {
			ctx.batchInsert(users).execute();
		});
	}
 *   public List<UsersVo> getUserByName(UsersVo users) {
		Map<Object,Object> map = new HashMap();
		map.put(USERS.USER_NAME,users.getUserName());
		List<UsersVo> usersVo = (List<UsersVo>) queryByParams(USERS, map, UsersVo.class);
		return usersVo;
	}
 * public Map<String, Object> findUsersByPage(UsersVo usersVo) {
	Map<Object, Object> map = new HashMap<>();
	if (usersVo!=null) {
		if (usersVo.getUserName()!=null&&!usersVo.getUserName().equals("")) {
			map.put(USERS.USER_NAME, usersVo.getUserName());
		}
		if (usersVo.getUserPassword()!=null&&!usersVo.getUserPassword().equals("")) {
			map.put(USERS.USER_PASSWORD, usersVo.getUserPassword());
		}
	}
	return queryPageByParams(USERS, map, UsersVo.class, usersVo.getBegin(), usersVo.getEnd(),USERS.USER_ID);
}
*/


