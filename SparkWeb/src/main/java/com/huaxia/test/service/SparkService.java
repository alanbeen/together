package com.huaxia.test.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.jooq.TableField;
import org.junit.Test;

import com.huaxia.generated.tables.Users;
import com.huaxia.generated.tables.records.UsersRecord;
import com.huaxia.test.bean.UserAndRole;
import com.huaxia.test.bean.UserHost;
import com.huaxia.test.bean.vo.UsersVo;
import com.huaxia.test.dao.JooqDao;
import com.huaxia.test.utils.ConvertJson;
import com.huaxia.test.utils.RegexUtil;

import static com.huaxia.generated.Tables.*;
/**
 * 业务逻辑语句
 *
 */


public class SparkService {
	private JooqDao jooqDao = new JooqDao();
	public List<UsersRecord> listUsers() {
		return jooqDao.test();
	}
	public boolean login(String userName, String pwd) {
		return jooqDao.login(userName,pwd);
	}
	public Map<String, Object> listUsersByPages(UsersVo myUsers) {
		return jooqDao.findUsersByPage(myUsers);
	}
	public void usersSave(UsersRecord users) {
		jooqDao.usersSave(users);
	}
	public List<UsersVo> getUserById(UsersVo users) {
		return jooqDao.getUserById(users);
		
	}
	public void userEditSave(UsersRecord users) {
		jooqDao.userEditSave(users);
	}
	public void deleteUsers(List<Object> idsArray) {
		jooqDao.deleteUsers(idsArray);
	}
	public Map<String, Boolean> getUserByName(UsersVo users) {
		Map<String, Boolean> map=new HashMap<>();
		List<UsersVo> lUsersVos = jooqDao.getUserByName(users);
		if(lUsersVos !=null&&!lUsersVos.isEmpty()) { 
			map.put("valid", false);
		} else{
			map.put("valid", true);
		}
		return map;
	}
	/**
	 * 条件查询用户和对应的主机
	 * @return
	 */
	public Map<String,Object> getUserHost(){
		//查询的字段
		TableField[] queryField = {USERS.USER_ID,USERS.USER_NAME,HOST.HOST_ID,HOST.HOST_NAME,HOST.IP_ADDRESS};
		UserHost userHost = new UserHost();//模拟前台传来的参数
		userHost.setUserId(17);
		userHost.setCurrentPage(1);
		userHost.setPageSize(20);
		
		Map<String,Object> map = jooqDao.getUserHost(queryField, userHost,true);
		return map;
	}
	/**
	 * 条件查询用户和对应的角色
	 * @return
	 */
	public Map<String,Object> getUserRole(){
		//要查询的字段
		TableField[] queryField = {USERS.USER_ID,USERS.USER_NAME,ROLES.ROLE_ID,ROLES.ROLE_NAME};
		UserAndRole userAndRole = new UserAndRole();//模拟前台传来的参数
		userAndRole.setUserId(17);
		userAndRole.setCurrentPage(1);
		userAndRole.setPageSize(20);
		
		Map<String,Object> map = jooqDao.getUserRole(queryField, userAndRole,true);
		return map;
	}
}
