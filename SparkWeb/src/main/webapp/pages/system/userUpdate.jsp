<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML>
<html>
<head>
<script src="/SparkWeb/js/userUpdateValidate.js"></script>
	<style type="text/css">
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
<form action="" id="updateUserForm" method="post">
	<div class="modal-header">
		<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">×</span></button>
		<h4 class="modal-title">修改用户</h4>
	</div>
	<input name="userId" id="userId" type="hidden">
	<div class="modal-body">
		<div class="form-group has-feedback">
			<div class="input-group">
				<span class="input-group-addon">用户名称</span> 
				<input class="form-control" name="userName" id="userName"
					placeholder="用户名只能包含字母,数字,下划线" required readonly >
			</div>
			<span class="glyphicon form-control-feedback" aria-hidden="true"></span>
			<div class="help-block with-errors"></div>
		</div>
		<div class="form-group has-feedback">
			<div class="input-group">
				<span class="input-group-addon">用户密码</span>
				<input class="form-control" name="userPassword" id="userPassword"
					type="password" placeholder="密码名只能包含字母,数字,下划线" required>
			</div>
			<span class="glyphicon form-control-feedback" aria-hidden="true"></span>
			<div class="help-block with-errors"></div>
		</div>
		<div class="form-group has-feedback">
			<div class="input-group">
				<span class="input-group-addon">重复密码</span>
				<input class="form-control" name="comfirmPsWord" id="comfirmPsWord"
					type="password" placeholder="密码名只能包含字母,数字,下划线" >
			</div>
			<span class="glyphicon form-control-feedback" aria-hidden="true"></span>
			<div class="help-block with-errors"></div>
		</div>
	</div>
	<div class="modal-footer">
		<button type="button" class="btn btn-info"  id="save" >
			<i class="glyphicon glyphicon-floppy-saved" aria-hidden="true" ></i> 保存
		</button>
		<button id="remove" class="btn btn-danger" data-dismiss="modal" onclick="close()">
			<i class="glyphicon glyphicon-floppy-remove"></i> 取消
		</button>
	</div>
</form>
<script type="text/javascript">
	//判断页面是否加载完毕
	if(document.readyState=="complete"){  
		loadData(); 
    }
	function loadData(){
		var userId = <%=request.getParameter("userId")%>;
		var obj = new Object();
		obj["userId"]=userId;
		var json = mapToJson(obj);
		$.ajax({
			  url: '/SparkWeb/api/username/userEdit.do', 
	          dataType: 'json',
	          type: 'POST',
	          data: {json:json},
	          contenType : 'application/x-www-form-urlencoded; charset=utf-8',
	          success: function(data){
	        	  $("#userName").val(data[0].userName);
	        	  $("#userId").val(data[0].userId);
	        	  $("#userPassword").val(data[0].userPassword);
	        	  $("#comfirmPsWord").val(data[0].userPassword);
	          },
	          error: function(jqXHR , textStatus , errorThrown){
	            //console.log("error");
	          }
	    });
	}
	$(document).ready(function(){
			$("#save").click(function(){
				var json = arrayToJson("updateUserForm");
				 $.ajax({
			            url: '/SparkWeb/api/username/userEditSave.do', 
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
		})
	})
</script>
</body>
</html>