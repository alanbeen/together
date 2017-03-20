﻿<%@page import="java.io.Console"%>
<%@ page language="java" pageEncoding="UTF-8"
	contentType="text/html; charset=UTF-8"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<!-- 新 Bootstrap 核心 CSS 文件 -->
<link href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
<!-- 可选的Bootstrap主题文件（一般不使用） -->
<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap-theme.min.css"></script>
<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<jsp:include page="pages/commonJsp/head.jsp" />
<style type="text/css">
</style>
</head>
<body style="background-color: blanchedalmond">
<div style="position: absolute;left: 40%;top: 45%;">
	<form id="loginForm" action="api/username/login.do" method="post">
		<table>
	         <tr>
	            <td> 用户名：</td>
	            <td><input type="text" name="userName"/></td>
	         </tr>
	         <tr>
	            <td> 密码：</td>
	            <td><input type="password" name="userPassword"/></td>
	         </tr>
	         <tr>
	            <td colspan="2" align="center">
	                <input type="button" id="save" value=" 登录 "/>
	                <input type="reset" value=" 重置 "/>
	            </td>
	         </tr>
	         <!-- <tr>
	         	<td colspan="2" align="center">登入成功!</td>
	         <tr> -->
	      </table>
	</form>
</div>
<script type="text/javascript">
 $(document).ready(function(){
	$("#save").click(function(){
		var json = arrayToJson("loginForm");
		$.ajax({
		    url: '/SparkWeb/api/username/login.do', 
		    dataType: 'text',
		    type: 'POST',
		    data: {json:json},
		    contenType : 'application/x-www-form-urlencoded; charset=utf-8',
		    success: function(data){
		    	console.info(data);
		    },
		    error: function(jqXHR , textStatus , errorThrown){
		    	
		    }
		});
	})
})
	
</script>
</body>
</html>

