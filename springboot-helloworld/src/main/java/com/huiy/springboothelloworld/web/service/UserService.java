package com.huiy.springboothelloworld.web.service;

import java.util.List;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.huiy.springboothelloworld.mysql.model.User;

/** 
 * 
 * @author : yuanhui 
 * @date   : 2018年4月27日
 */
public interface UserService {

    /**
     * 新增一个用户
     * @param name
     * @param age
     */
//	@Transactional(isolation = Isolation.DEFAULT,propagation = Propagation.REQUIRED)
    void create(String name, Integer age);

    /**
     * 根据name删除一个用户高
     * @param name
     */
    void deleteByName(String name);

    /**
     * 获取用户总量
     */
    List<User> getAllUsers();

    /**
     * 删除所有用户
     */
    void deleteAllUsers();


}
