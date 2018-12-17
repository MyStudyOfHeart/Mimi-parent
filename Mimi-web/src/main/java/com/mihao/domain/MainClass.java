package com.mihao.domain;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat=new Cat();
		cat.setAge(1);
		cat.setName("三七");
		
		
		Result result=new Result();
		result.setResultCode("0");
		result.setResultText("成功");
		JSONObject jsonObject=new JSONObject();
		jsonObject.fluentPut("data", cat);
		jsonObject.fluentPut("pageCount", 10);
		result.setResult(jsonObject);
		
		
		System.out.println(JSON.toJSON(result));
	}

}
