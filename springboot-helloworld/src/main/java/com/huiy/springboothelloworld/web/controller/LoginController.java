package com.huiy.springboothelloworld.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import springfox.documentation.annotations.ApiIgnore;

/** 
 * 
 * @author : yuanhui 
 * @date   : 2018年4月28日
 */
@Controller
public class LoginController {

	@ApiIgnore
	@RequestMapping("/login")
	public String login(){
		return "login";
	}
}
