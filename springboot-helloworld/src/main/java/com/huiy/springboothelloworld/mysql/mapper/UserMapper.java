package com.huiy.springboothelloworld.mysql.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.huiy.springboothelloworld.mysql.model.User;

/** 
 * 
 * @author : yuanhui 
 * @date   : 2018年4月28日
 */
@Mapper
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
    
	 public List<User> findUserInfo();  
	 public int addUserInfo(User user);  
	 public int delUserInfo(int id);      
    
}
