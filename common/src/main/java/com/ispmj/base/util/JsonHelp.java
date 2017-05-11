package com.ispmj.base.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonHelp {

	private JsonHelp(){
		
	}
	/**对象转json*/
	public static String Object2Str(Object obj){
		String result=null;
		ObjectMapper objectMapper=new ObjectMapper();
		try {
			result=objectMapper.writeValueAsString(obj);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	/**
	 * json转对象*/
	public static Object str2Object(String str,Class cls){
		Object retObj = null;
		ObjectMapper mapper = new ObjectMapper();
		
		try {
			 retObj = mapper.readValue(str, cls);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return retObj;
	}

}
