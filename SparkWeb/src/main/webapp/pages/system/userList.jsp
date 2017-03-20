<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML>
<html>
	<head>
		<title>交换中心</title>
		<jsp:include page="../commonJsp/head.jsp" />
	</head>
<body>
	<div class="container">
		 <div class="row wjy_xian" style="padding-bottom: 0px;">
   		 	<div class="col-md-3  col-xs-2" style="box-shadow:inset 1px -1px 1px white, inset -1px 1px 1px white;padding:1 8 8 1">
				<div class="input-group">
            		<span class="input-group-addon">用户名称</span>
            		<input type="text" class="form-control" id="user_name" >
       		 	</div>
			</div>
		<div class="col-md-3  col-xs-2" style="box-shadow:inset 5px -1px 1px white, inset -1px 1px 1px white;padding:1 8 8 1">
			<div class="form-group has-feedback">
				<div class="input-group">
					<span class="input-group-addon">用户角色</span>
						<select class="form-control selectpicker" id="userRoleId" required>
							<option value="">请选择</option>
						</select>
				</div>
			</div>
		</div>
		<div class="col-md-3  col-xs-2" style="box-shadow:inset 5px -1px 1px white, inset -1px 1px 1px white;padding:1 8 8 1">
			<div class="form-group has-feedback">
				<div class="input-group">
					<span class="input-group-addon">业务组</span>
					<select class="form-control selectpicker" id="busGroupId" required>
							<option value="">请选择</option>
					</select>
				</div>
			</div>
		</div>
			<div class="col-md-2  col-xs-12" style="box-shadow:inset 5px -1px 1px white, inset -1px 1px 1px white;padding:1 8 8 1">
				<div class="input-group">
					<button class="btn btn-info" onclick="$('#tableMain').bootstrapTable('refreshOptions', {pageNumber: 1});">查询</button>
	        	</div>
	        </div>
		</div>
		<div id="toolbar">
			<a href="userAdd.jsp" data-target="#userAdd" data-toggle="modal">
					<button class="btn btn-info" >
						<i class="glyphicon glyphicon-plus"></i> 新增
					</button>
			</a>
				<button id="userRemove" class="btn btn-danger" disabled>
					<i class="glyphicon glyphicon-remove"></i> 删除
				</button>
		</div>
		<div class="modal fade" id="userAdd" tabindex="-1" role="dialog" >
			<div class="modal-dialog " role="document">
		    	<div class="modal-content">
			        
			   	</div>
		   	</div>
		</div>
		<div class="modal fade" id="userUpdate" tabindex="-1" role="dialog" >
			<div class="modal-dialog " role="document">
		    	<div class="modal-content">
			        
			   	</div>
		   	</div>
		</div>
		<table id="tableMain">
		</table>
	</div>
	<script>
	$(document).ready(function(){
		var $table = $('#tableMain'),//表格
	    $remove = $('#userRemove');
		//删除选中的用户
		$remove.click(function () {
			Ewin.confirm({message : "确认删除用户？" }).on(function(e) {
			   if (!e) { return; }
			   var json = getIdSelections();
		       $.ajax({
		            url: '/SparkWeb/api/username/deleteUsers.do', 
		            dataType: 'text',
		            type: 'POST',
		            data: {json:json},
		            contenType : 'application/x-www-form-urlencoded; charset=utf-8',
		            success: function(data){
		            	$table.bootstrapTable('refreshOptions', {pageNumber: 1});
		     	        $remove.prop('disabled', true);
		            },
		            error: function(jqXHR , textStatus , errorThrown){
		            	
		            }
	          });
			});
	    });
		$table.bootstrapTable({
			classes:"table table-bordered table-hover",
			url:"/SparkWeb/api/username/pages.do",
			contentType:"application/x-www-form-urlencoded; charset=UTF-8",
			dataType: "json",
			method : "post",
			toolbar:"#toolbar",
			pagination :true, 
			sidePagination : "server", 
			singleSelect: false,
			showColumns :true,
			showRefresh : true,
			showToggle :true,
			showHeader :true, 
			cache: false,
			cardView : false,
			smartDisplay :false,
			striped : true,
			sortOrder : 'desc',
			showFooter : false,
			/*search : true, */
			pageList : "[10, 20, 50, 100]",
			strictSearch : false,
			/*searchTimeOut : 500,*/
			trimOnSearch : true, 
			minimumCountColumns : 1,
			pageSize : 10,
			pageNumber : 1,
			queryParamsType : "",
			queryParams : 'pageParams',
			columns: [{
				field: 'state',
				width: "30px",
				align: "center",
				checkbox : true,
			}, {
				field: 'userId',
				title: '用户ID',
				visible : true
			},{
				field: 'userName',
				title: '用户名称',
				width:"70px"
			}, {
				field: 'userPassword',
				title: '密码'
			}, 
			{
				title: '操作',
				width: "35px",
				align: "center",
				formatter: function (value, row, index) {
					return [
					        '<a  href="userUpdate.jsp?userId=' + row.userId + '&qaz='+(Math.random()*100000).toString().split(".")[0]+'" data-target="#userUpdate" data-toggle="modal" >修改</a>'
					        ].join('   ');
				},
			}
			],
		});
		//有选中项时才启用删除按钮
		$table.on('check.bs.table uncheck.bs.table ' +
	            'check-all.bs.table uncheck-all.bs.table', function () {
			$remove.prop('disabled', !$table.bootstrapTable('getSelections').length);
	    });
		$('#userAdd').on('hidden.bs.modal', function() {
			$(this).removeData("bs.modal");
			$("#addUserForm").data('bootstrapValidator').destroy();
		});
		$('#userUpdate').on('hidden.bs.modal', function() {
			$(this).removeData("bs.modal");
			$("#updateUserForm").data('bootstrapValidator').destroy();
		});
		//获取选中的id
		function getIdSelections(){
			return mapToJson($.map($table.bootstrapTable('getSelections'),function(row){
				return row.userId;
			}))
		}
		
	})
	//分页参数
	function pageParams(params) {
	     var data = new Object();
	     data["pageSize"]=params.pageSize;
	     data["currentPage"]=params.pageNumber;
	     data["userName"]=$("#user_name").val();
		 return {
			 json : mapToJson(data)
		 }
	}
	</script>
</body>
</html>