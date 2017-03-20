<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML>
<html>
<head>
<script src="/SparkWeb/js/userAddValidate.js"></script>
	<style>
		.checkbox-arae {
			padding-left: 10px;
			border: 1px solid #ccc;
			border-radius: 0 4px 4px 0;
			padding-bottom: 5px;
		}
		.checkbox-inline {
			width: 110px;
			margin-left: 10px;
		}
		.modal-body {
			padding: 20px 50px;
		}
	</style>
</head>
<body>
<script type="text/javascript">
</script>
<form class="form-horizontal" id="addUserForm" action="" method="post" >
	<div class="modal-header">
		<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">×</span></button>
		<h4 class="modal-title">新增用户</h4>
	</div>
	<div class="modal-body">
		<div class="form-group has-feedback">
			<div class="input-group">
				<input type="hidden" name="userId" id="userId"  >
				<span class="input-group-addon">用户名称</span> 
				<input class="form-control" maxlength="50"
					data-toggle="tooltip" name="userName"
					placeholder="用户名只能包含字母,数字,下划线" >
			</div>
		</div>
		<div class="form-group has-feedback">
			<div class="input-group">
				<span class="input-group-addon">用户密码</span>
				<input class="form-control" name="userPassword"
					type="password" placeholder="密码名只能包含字母,数字,下划线" >
			</div>
		</div>
		<div class="form-group has-feedback">
			<div class="input-group">
				<span class="input-group-addon">重复密码</span>
				<input class="form-control" name="comfirmPsWord"
					type="password" placeholder="密码名只能包含字母,数字,下划线">
			</div>
		</div>
	</div>
	<div class="modal-footer">
		<button  type="button" class="btn btn-info"  id="save">
			<i class="glyphicon glyphicon-floppy-saved" aria-hidden="true"></i> 保存
		</button>
		<button id="remove" class="btn btn-danger"  data-dismiss="modal" onclick="close()" >
			<i class="glyphicon glyphicon-floppy-remove"></i> 关闭
		</button>
	</div>
</form>
<script type="text/javascript">
$(document).ready(function(){
	$("#save").click(function(){
		//判断验证是否通过
		if($("#addUserForm").data('bootstrapValidator').isValid()){
			var json = arrayToJson("addUserForm");
			 $.ajax({
	            url: '/SparkWeb/api/username/userAddSave.do', 
	            dataType: 'json',
	            type: 'POST',
	            data: {json:json},
	            contenType : 'application/x-www-form-urlencoded; charset=utf-8',
	            success: function(data){
	            	window.location.href = "userList.jsp";
	            },
	            error: function(jqXHR , textStatus , errorThrown){
	              //console.log("error");
	            }
	       });
		}else{
			$("#addUserForm").bootstrapValidator('validate'); 
		}
	})
})
</script>
</body>
</html>