package com.huiy.springboothelloworld.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import springfox.documentation.annotations.ApiIgnore;

/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2018年4月26日
 * @version 1.0
 */
@Controller
public class ThymeleafController {
	
	
	
    @ApiIgnore
	@RequestMapping("/")
	public String index(ModelMap model){
    	//model.addAttribute("host","https://github.com/huiylove/");
        //return模板文件的名称     对应src/main/resources/templates/index.html
		return "index";
	}
    

    @ApiIgnore
	@RequestMapping("/loginSuccess")
	public String login(){
		return "loginSuccess";
	}
	

}
