package com.huiy.springboot2.web.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	@RequestMapping("/hello")
	@ResponseBody 
	public Map<String, Object>  hello(){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("resCode", "0000");
		map.put("resMsg", "响应成功");
		return map;
	}
	
	@RequestMapping("/thhello")
	public String thhello(ModelMap model){
		model.addAttribute("today",new Date());
		return "index";
	}

}
