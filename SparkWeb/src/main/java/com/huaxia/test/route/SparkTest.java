package com.huaxia.test.route;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.huaxia.generated.tables.records.UsersRecord;
import com.huaxia.test.bean.Users;
import com.huaxia.test.bean.vo.UsersVo;
import com.huaxia.test.service.SparkService;
import com.huaxia.test.utils.JsonTransformer;

import static spark.Spark.*;

public class SparkTest extends SparkBase {
	 HttpServletRequest servletRequest;
	 HttpSession httpSession;
	 private static Logger logger = LoggerFactory.getLogger(SparkTest.class);
	 private SparkService sparkService = new SparkService();
    @Override
    public void init()
     {
    	path("/api", () -> {
    	    path("/email", () -> {
    	    	 get("/hi.do", (request, response) -> {
//    	         	List<UsersRecord> list = sparkService.listUsers();
    	             return "Hello World!";
    	         });
    	    });
    	    path("/username", () -> {
    	    	 post("/login.do", (request, response) -> {
    	    		UsersVo users = paramsToBean(request,UsersVo.class);//注入相应实体类
     	         	Map<String, String> map = new HashMap<>();
    	         	boolean bo = sparkService.login(users.getUserName(),users.getUserPassword());
    	         	if(bo){
    	         		map.put("loginMsg", "1");
    	         	}else{
    	         		map.put("loginMsg", "0");
    	         	}
    	         	return map;
    	         }, new JsonTransformer());
    	    	 post("/hello.do", (request, response) -> {
        	         	List<UsersRecord> list = sparkService.listUsers();
        	         	return list;
    	    		}, new JsonTransformer());
    	    	 get("/hello.do", (request, response) -> {
    	    		 List<UsersRecord> list = sparkService.listUsers();
//    	    		 String jsonArray = JSONArray.toJSONString(list);
//    	    		 System.out.println(jsonArray);
    	    		 return list;
    	    	 }, new JsonTransformer());
    	    	 
    	    	 
    	    	 //分页查询
    	    	post("/pages.do", (request, response) -> {
    	    		logger.debug("test");
    	    		UsersVo users = paramsToBean(request,UsersVo.class);//注入相应实体类
    	    		return sparkService.listUsersByPages(users);
     	         }, new JsonTransformer());
    	    	//新增
    	    	post("/userAddSave.do", (request, response) -> {
    	    		UsersRecord users = paramsToBean(request,UsersRecord.class);//注入相应实体类
    	    		sparkService.usersSave(users);
    	    		return null;
    	    	}, new JsonTransformer());
    	    	//编辑数据获取
    	    	post("/userEdit.do", (request, response) -> {
    	    		UsersVo usersVo = paramsToBean(request,UsersVo.class);//注入相应实体类
    	    		List<UsersVo> user = sparkService.getUserById(usersVo);
    	    		return user;
    	    	}, new JsonTransformer());
    	    	//编辑保存
    	    	post("/userEditSave.do", (request, response) -> {
    	    		UsersRecord users = paramsToBean(request,UsersRecord.class);//注入相应实体类
    	    		sparkService.userEditSave(users);
    	    		return null;
    	    	}, new JsonTransformer());
    	    	//批量删除
    	    	post("/deleteUsers.do", (request, response) -> {
    	    		List<Object> idsArray = paramsToList(request);//array参数转list
    	    		sparkService.deleteUsers(idsArray);
    	    		return null;
    	    	}, new JsonTransformer());
    	    	//用户名字验证
    	    	post("/userNameValidate.do", (request, response) -> {
    	    		UsersVo users = paramsToBean(request,UsersVo.class);//注入相应实体类
    	    		Map<String, Boolean> map = sparkService.getUserByName(users);
    	    		return map;
    	    	}, new JsonTransformer());
    	    	//编辑数据获取
    	    	post("/toIndex.do", (request, response) -> {
//    	    		Users user = (Users) request.session().attribute("USER_SESSION_KEY");
    	    		response.redirect("/index.jsp");
    	    		return null;
    	    	}, new JsonTransformer());
    	    	//获取用户对应的主机信息
    	    	get("/getUserHost.do", (request, response) -> {
    	    		Map<String,Object> map = sparkService.getUserHost();
    	    		return map;
    	    	}, new JsonTransformer());
    	    	//获取用户对应的角色信息
    	    	get("/getUserRole.do", (request, response) -> {
    	    		Map<String,Object> map = sparkService.getUserRole();
    	    		return map;
    	    	}, new JsonTransformer());
    	    });
    	});
//    	@RequestMapping(value = "/toIndex.do" )
//    	public ModelAndView toIndex(HttpServletRequest request, HttpServletResponse response)
//    			throws ServletException, IOException {
//    		User user = (User) request.getSession().getAttribute("USER_SESSION_KEY");
//    		ModelAndView modelAndView = new ModelAndView();
//    		List<MonitorHostState> monitorHostStates = sysViewService.fetchAllMonitState(user.getUserId());
//    		request.setAttribute("monitorHostStates", monitorHostStates);
//    		modelAndView.setViewName("jsp/login/sysView");
//    		return modelAndView ;
//    	}
    }
    
}
