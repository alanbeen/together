package com.huaxia.test.bean;

import java.util.HashMap;
import java.util.Map;

import org.jooq.TableField;

import com.huaxia.test.utils.page.Page;
import static com.huaxia.generated.Tables.*;

public class UserHost extends Page{
	private Integer userId;
	private String userName;
	private String age;
	private Integer hostId;
	private String hostName;
	private String ipAddress;
	private Map<String,TableField> queryMap = new HashMap<String,TableField>();
	
	
	private Map<String, TableField> getQueryMap() {
		queryMap.put("userId",USERS.USER_ID);
		queryMap.put("userName",USERS.USER_NAME);
		queryMap.put("age",USERS.USER_PASSWORD);
		queryMap.put("hostId",HOST.HOST_ID);
		queryMap.put("hostName",HOST.HOST_NAME);
		queryMap.put("ipAddress",HOST.IP_ADDRESS);
		return queryMap;
	}


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


	public String getAge() {
		return age;
	}


	public void setAge(String age) {
		this.age = age;
	}


	public Integer getHostId() {
		return hostId;
	}


	public void setHostId(Integer hostId) {
		this.hostId = hostId;
	}


	public String getHostName() {
		return hostName;
	}


	public void setHostName(String hostName) {
		this.hostName = hostName;
	}


	public String getIpAddress() {
		return ipAddress;
	}


	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}


	public void setQueryMap(Map<String, TableField> queryMap) {
		this.queryMap = queryMap;
	}
}
