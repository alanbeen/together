$(function(){
		$("#addUserForm").bootstrapValidator({
			feedbackIcons: {
				valid: 'glyphicon glyphicon-ok',
				invalid: 'glyphicon glyphicon-remove',
				validating: 'glyphicon glyphicon-refresh'
			},
			fields: {
				userName: {
					validators: {
						notEmpty: {
							message: '用户名不能为空，只能包含字母,数字,下划线！'
						},
						stringLength: {
							min: 4,
							max: 8,
							message: '用户名长度不能小于4个字符或者大于8个字符！'
						},
						regexp: {
							regexp: /^[a-z]{1}[a-zA-Z0-9_]+$/,
							message: '用户名只能有字母,数字,下划线组成（首字符为字母）!'
						},
						remote: {
							type:"POST",
							url: '/SparkWeb/api/username/userNameValidate.do',
							delay :  1000,
							data: function(validator) {
								 var data = new Object();
							     data["userName"]=$('[name="userName"]').val();
								 return {
									 json : JSON.stringify(data)
								 }
							},
							message: '用户名已经存在，请重新输入！',
						}
					}
				},
				userRealName: {
					validators: {
						notEmpty: {
							message: '请填写用户昵称！'
						},
						stringLength: {
							max: 16,
							message: '用户昵称大于16个字符！'
						},
					}
				},
				userTel: {
					validators: {
						notEmpty: {
							message: '联系电话不能为空！'
						},
						regexp: {
							regexp:/^(0-?|\(0\)-?|\+?86-?|\+?\(86\)-?)?(13[0-9]|15[012356789]|17[678]|18[0-9]|14[57])[0-9]{8}$/,
							message: '手机格式不正确！'
						},
					}
				}, 
				userPassword: {
	                 validators: {
	                     notEmpty: {
	                         message: '密码不能为空！'
	                     },
	                     stringLength: {
	                    	 min: 6,
	                         message: '密码长度必须6位以上！'
	                     },
	                     different: {
	                         field: 'userName',
	                         message: '密码不能和用户名相同，请设置新密码！'
	                     },
	                     identical: {
	                         field: 'comfirmPsWord',
	                         message: '两次密码不一致！'
	                     },
	                     regexp: {
	                         regexp: /^[a-zA-Z0-9_\.]+$/,
	                         message: '密码只能有字母,数字,下划线组成!'
	                     }
	                 }
	             },
	             comfirmPsWord: {
	                 validators: {
	                     notEmpty: {
	                         message: '密码不能为空！'
	                     },
	                     stringLength: {
	                         min: 6,
	                         message: '密码长度必须6位以上！'
	                     },
	                     identical: {
	                         field: 'userPassword',
	                         message: '两次密码不一致！'
	                     },
	                     different: {
	                         field: 'userName',
	                         message: '密码不能和用户名相同，请设置新密码！'
	                     },
	                     regexp: {
	                         regexp: /^[a-zA-Z0-9_\.]+$/,
	                         message: '密码只能有字母,数字,下划线组成!'
	                     }
	                 }
	             },
	             departmentId: {
            	   	validators: {
	                     notEmpty: {
	                         message: '请选择所在部门！'
	                     }
	                    
	                 }
	             },
	             gender: {
            	   	validators: {
	                     notEmpty: {
	                         message: '请选择用户性别！'
	                     }
	                    
	                 }
	             },
	             userEmail: {
            	   	validators: {
            	   		 notEmpty: {
	                         message: '请填写邮箱！'
	                     },
	            	   	 emailAddress: {
	                         message: '请输入正确的邮箱地址！'
	                     }
	                 }
	             },
	             remark: {
	             },
	             busIds: {
	            	 validators: {
	                     notEmpty: {
	                         message: '请选择业务组！'
	                     }
	                    
	                 }
	             },
	             roleIds: {
	            	 validators: {
	                     notEmpty: {
	                         message: '请选择用户角色!'
	                     }
	                    
	                 }
	             },
	             
			}
		}).on('form.success.bv',function(e){
			console.info("dd");
			$('#save').attr("disabled","none");
		});
	})