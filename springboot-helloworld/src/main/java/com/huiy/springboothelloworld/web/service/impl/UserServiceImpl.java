package com.huiy.springboothelloworld.web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.huiy.springboothelloworld.mysql.mapper.UserMapper;
import com.huiy.springboothelloworld.mysql.model.User;
import com.huiy.springboothelloworld.web.service.UserService;

/** 
 * 
 * @author : yuanhui 
 * @date   : 2018年4月27日
 */
@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
    private JdbcTemplate jdbcTemplate;
	

	@Autowired
    private UserMapper userMapper;

	@Override
	public void create(String name, Integer age) {
        jdbcTemplate.update("insert into USER(NAME, AGE) values(?, ?)", name, age);
	}

	@Override
	public void deleteByName(String name) {
        jdbcTemplate.update("delete from USER where NAME = ?", name);
	}

	@Override
	public List<User> getAllUsers() {
//		RowMapper<User> rowMapper = new BeanPropertyRowMapper<User>(User.class);//查询结果映射到对象
//		return jdbcTemplate.query("select id,name,age from USER", rowMapper);
//      return jdbcTemplate.queryForObject("select count(1) from USER", Integer.class);
		return userMapper.findUserInfo();
	}

	@Override
	public void deleteAllUsers() {
        jdbcTemplate.update("delete from USER");
	}

}
