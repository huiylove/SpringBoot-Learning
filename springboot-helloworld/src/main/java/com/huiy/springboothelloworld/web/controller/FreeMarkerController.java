package com.huiy.springboothelloworld.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import springfox.documentation.annotations.ApiIgnore;

/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2018年4月26日
 * @version 1.0
 */
@Controller
public class FreeMarkerController {
	
    @ApiIgnore
	@RequestMapping("/freemarker")
	public String index(Model model){
		model.addAttribute("sign","做你想做的！！！！");
        // return模板文件的名称，对应src/main/resources/templates/indexF.ftl
		return "indexF";
	}
	

}
