/**
 * 
 */
package com.huiy.springboot2.web.service;

import java.util.List;

import com.huiy.springboot2.web.model.User;

/**
 * @author huiylove
 * @date 2019年1月23日
 */
public interface UserService {
	
	 public void addUser(User user);  
	 public List<User> findAll();  
	 public int updateUser(User user);  
	 public int delUserById(int id);
	 public User getUserById(int id);  

}
