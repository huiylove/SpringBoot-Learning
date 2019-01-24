package com.huiy.springboot2.web.service.impl;

import java.util.List;

import lombok.extern.log4j.Log4j2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huiy.springboot2.web.mapper.UserMapper;
import com.huiy.springboot2.web.model.User;
import com.huiy.springboot2.web.service.UserService;

@Log4j2
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
    private UserMapper userMapper;

	@Override
	public List<User> findAll() {
		return userMapper.getAllUser();
	}

	@Override
	public int updateUser(User user) {
		return userMapper.updateUserInfo(user);
	}

	@Override
	public int delUserById(int id) {
		return userMapper.delUserInfo(id);
	}

	@Override
	public User getUserById(int id) {
		return userMapper.getUser(id);
	}
	@Override
	public void addUser(User user) {
		userMapper.addUserInfo(user);
	}

}
