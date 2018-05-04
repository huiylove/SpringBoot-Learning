package com.huiy.springboothelloworld.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import springfox.documentation.annotations.ApiIgnore;

import com.huiy.frame.core.exception.MyException;

/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2018年4月26日
 * @version 1.0
 */
//@RestController
@Controller
public class HelloWorldController {
	
    @ApiIgnore
	@RequestMapping("/hello")
    @ResponseBody
	public String hello(@RequestParam(required=false) String name) throws Exception{
    	return "hello"+name;
	}
	   

//  @ApiIgnore
//	@RequestMapping("/hello")
//	public String hello() throws Exception{
////		return "Hello World";
//    	throw new Exception("统一异常处理");
//	}
    

    @ApiIgnore
	@RequestMapping("/exceptioninJSON")
	public String json() throws MyException{
    	throw new MyException("返回json格式异常");
	}
}
