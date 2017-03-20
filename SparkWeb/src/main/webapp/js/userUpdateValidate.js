$(function(){
		$("#updateUserForm").bootstrapValidator({
			feedbackIcons: {
				valid: 'glyphicon glyphicon-ok',
				invalid: 'glyphicon glyphicon-remove',
				validating: 'glyphicon glyphicon-refresh'
			},
			fields: {
				userRealName: {
					validators: {
						notEmpty: {
							message: '请填写真实姓名！'
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
							/*  /^(^0\d{2}-?\d{8}$)|(^0\d{3}-?\d{7}$)|(^\(0\d{2}\)-?\d{8}$)|(^\(0\d{3}\)-?\d{7}$)$/  */
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
	             /* receiveAlarmMsg: {
            	   	validators: {
	                     notEmpty: {
	                         message: '请选择是否接收告警通知！'
	                     }
	                    
	                 }
	             }, */
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
	             /* status: {
            	   	validators: {
	                     notEmpty: {
	                         message: '请选择用户状态！'
	                     }
	                    
	                 }
	             }, */
	             userEmail: {
	            	   	validators: {
	            	   		 notEmpty: {
		                         message: '请填写邮箱！'
		                     },
		            	   	 emailAddress: {
		                         message: '请输入正确的邮箱地址！'
		                     }
		                    /*   callback: {  
		                         message: '请填写邮箱！',  
		                         callback: function(value, validator) { 
		                        	 var val = $("#receiveAlarmMsg option:selected").val();
		                        	 if(val==1){
		                        		 return true;
		                        	 }else if(value!=""){
		                        		 return true;
		                        	 }else{
		                        		 return false;
		                        	 }
		                         }  
		                     }  */
				            
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
			$('#submit-btn').attr("disabled","none");
		});
		
	})