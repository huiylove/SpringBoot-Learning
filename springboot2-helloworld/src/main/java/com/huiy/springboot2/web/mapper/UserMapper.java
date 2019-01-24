package com.huiy.springboot2.web.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.huiy.springboot2.web.model.User;

/** 
 * 
 * @author : yuanhui 
 * @date   : 2019年1月21日
 */
//@Mapper
public interface UserMapper {

//    @Select("SELECT * FROM USER WHERE NAME = #{name}")
//    User findByName(@Param("name") String name);
//
//    @Insert("INSERT INTO USER(NAME, AGE) VALUES(#{name}, #{age})")
//    int insert(@Param("name") String name, @Param("age") Integer age);
//
//    @Delete("DELETE FROM user WHERE id =#{id}")
//    void delete(Long id);
//
//    @Insert("INSERT INTO user(name, age) VALUES(#{name}, #{age})")
//    int insertByUser(User user);
//    
//    @Results({
//        @Result(property = "name", column = "name"),
//        @Result(property = "age", column = "age")
//	  })
//	  @Select("SELECT name, age FROM user")
//	  List<User> findAll();
    
	 public List<User> getAllUser();  
	 public int addUserInfo(User user);  
	 public int updateUserInfo(User user);  
	 public int delUserInfo(int id);
	 public User getUser(int id);      
}
