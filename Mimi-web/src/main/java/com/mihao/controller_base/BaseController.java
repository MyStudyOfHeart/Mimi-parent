package com.mihao.controller_base;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.mihao.domain.Cat;
import com.mihao.domain.Result;

@Controller
@ResponseBody
@RequestMapping("/vue")
public class BaseController {

	@RequestMapping("/get")
	public Result get(@RequestBody String cat){
		System.out.println(cat);
		JSONObject jsonObject=JSON.parseObject(cat);
		JSONObject catObject=(JSONObject) jsonObject.get("cat");
		Cat getCat=JSON.parseObject(catObject.toJSONString(), Cat.class);
		Result result=new Result();
		result.setResultCode("0");
		result.setResultText("成功");
		result.setResult(getCat);
		return result;
	}
	@RequestMapping("/get2")
	public Result get2(@RequestBody Cat cat){
		Result result=new Result();
		result.setResultCode("0");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		result.setResultText("成功");
		result.setResult(cat);
		return result;
	}
}
