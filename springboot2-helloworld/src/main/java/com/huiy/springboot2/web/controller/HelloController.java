package com.huiy.springboot2.web.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/hello")
	@ResponseBody 
	public Map<String, Object>  hello(){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("resCode", "0000");
		map.put("resMsg", "响应成功");
		return map;
	}

}
