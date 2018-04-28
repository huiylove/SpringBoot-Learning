package com.huiy.springboothelloworld.mysql.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.huiy.springboothelloworld.mysql.model.User;
import com.huiy.springboothelloworld.vo.UserClassVo;

/** 
 * 
 * @author : yuanhui 
 * @date   : 2018年4月28日
 */
@Mapper
public interface ClassMapper {

    
	@Results({
         @Result(property = "userName", column = "name"),
         @Result(property = "className", column = "class_name")
    })
	@Select("SELECT u.name,c.class_name FROM user_class uc "
			+ "left join user u on u.id = uc.user_id "
			+ "left join class c on c.id = uc.class_id "
			+ "where u.name = #{name,jdbcType=VARCHAR}")
	List<UserClassVo> findUserClassByName(Map<String, Object> map);
	
	

}
