package com.huiy.springboothelloworld.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.huiy.springboothelloworld.mysql.model.User;

/** 
 * 
 * @author : yuanhui 
 * @date   : 2018年4月27日
 */
public interface UserRepository extends JpaRepository<User, Long> {

    /**
     * 通过解析方法名创建查询
     * @param name
     * @return
     */
    User findByName(String name);

    User findByNameAndAge(String name, Integer age);
    
    List<User> findAll();

    @Query("from User u where u.name=:name")
    User findUser(@Param("name") String name);


}
