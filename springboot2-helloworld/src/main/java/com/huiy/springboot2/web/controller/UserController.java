package com.huiy.springboot2.web.controller;

import java.util.List;

import lombok.extern.log4j.Log4j2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.huiy.springboot2.web.mapper.UserMapper;
import com.huiy.springboot2.web.model.User;

/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2019年1月21日
 * @version 1.0
 */
@RestController
@RequestMapping(value="/users")  
@Log4j2
public class UserController {

	@Autowired
    private UserMapper userMapper;
	
	@GetMapping("/")
    public List<User> getAllUser(){
        return userMapper.getAllUser();
    }
  
	@GetMapping("/user/{id}")
    public User getUser(@PathVariable("id") int id){
        return userMapper.getUser(id);
    }
	
	@PostMapping("/addUser")
    public String addUser(@RequestBody final User user){
	   log.info("*****add user start*****");
       userMapper.addUserInfo(user);
	   log.info("*****add user end*****");
       return "add user success";
       
    }
}