package com.huaxia.test.bean;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.collections.set.UnmodifiableSortedSet;
import org.jooq.TableField;

import com.huaxia.test.utils.page.Page;
import static com.huaxia.generated.Tables.*;

public class UserAndRole extends Page{
	private Integer userId;
	private String userName;
	private String roleName;
	private Map<String,TableField> queryMap = new HashMap<String,TableField>();
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public Map<String, TableField> getQueryMap() {
		queryMap.put("userId",USERS.USER_ID);
		queryMap.put("userName",USERS.USER_NAME);
		queryMap.put("age",USERS.USER_PASSWORD);
		queryMap.put("roleName",ROLES.ROLE_NAME);
		return queryMap;
	}
	public void setQueryMap(Map<String, TableField> queryMap) {
		this.queryMap = queryMap;
	}
	
}
