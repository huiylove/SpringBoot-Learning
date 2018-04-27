package com.huiy.springboothelloworld.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import springfox.documentation.annotations.ApiIgnore;

import com.huiy.springboothelloworld.model.User;
import com.huiy.springboothelloworld.model.UserRepository;
import com.huiy.springboothelloworld.web.service.UserService;

/** 
 * 
 * @author : yuanhui 
 * @date   : 2018年4月27日
 */
@RestController
@RequestMapping(value="/user")     
public class UserWithSpringDataController {
	
	
		@Autowired
	    private UserService UserService;
		
		@Autowired
		private UserRepository userRepository;
		
		@ApiIgnore
	    @RequestMapping(value="/save", method=RequestMethod.POST) 
	    public String saveUser(@ModelAttribute User user) { 
			userRepository.save(user);
	        return "success";
	    } 
		
		@ApiIgnore
	    @RequestMapping(value="/all", method=RequestMethod.GET) 
	    public List<User> getUserList() { 
	        // 处理"/users/"的GET请求，用来获取用户列表 
	        // 还可以通过@RequestParam从页面中传递参数来进行查询条件或者翻页信息的传递 
	        return userRepository.findAll();
	    } 
		

}
