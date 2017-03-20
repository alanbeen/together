package com.huaxia.test.route;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import spark.Request;
import spark.servlet.SparkApplication;

public class SparkBase implements SparkApplication {
	@Override
	public void init() {
		
	}
	/**
	 * 前台jsonObject注入对象的方法
	 * @param request
	 * @param T
	 * @return
	 */
	public static <T> T paramsToBean(Request request,Class<T> bean){
		String json = request.queryParams("json");
		if (json!=null&&!json.equals("")&&!json.equals("null")) {
			JSONObject jsonObject = JSONObject.fromObject(json);
			T beT = (T) JSONObject.toBean(jsonObject,bean);  
			return beT;
		}else{
			return null;
		}
		
	}
	/**
	 * 前台jsonObject转Map的方法
	 * @param request
	 * @return
	 */
	public static HashMap<String, String> paramsToHashMap(Request request){
		HashMap<String, String> data = new HashMap<String, String>();  
		String json = request.queryParams("json");
		if (json!=null&&!json.equals("")&&!json.equals("null")) {
			JSONObject jsonObject = JSONObject.fromObject(json);
			Iterator it = jsonObject.keys();  
		       // 遍历jsonObject数据，添加到Map对象  
		       while (it.hasNext())  
		       {  
		           String key = String.valueOf(it.next());  
		           String value = String.valueOf(jsonObject.get(key));  
		           data.put(key, value);  
		       }  
		    return data; 
		}else {
			return null;
		}
		
	}
	/**
	 * 前台jsonArray转成list
	 * @param request
	 * @return
	 */
	public static List<Object> paramsToList(Request request){
		HashMap<String, String> data = new HashMap<String, String>();  
		String json = request.queryParams("json");
		JSONArray jsonArray = JSONArray.fromObject(json);
		List<Object> idsArray = jsonArray.toList(jsonArray);
		return idsArray;
	}
}
