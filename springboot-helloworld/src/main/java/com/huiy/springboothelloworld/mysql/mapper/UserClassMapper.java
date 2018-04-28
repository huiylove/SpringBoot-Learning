package com.huiy.springboothelloworld.mysql.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.huiy.springboothelloworld.vo.UserClassVo;

/** 
 * 
 * @author : yuanhui 
 * @date   : 2018年4月28日
 */
@Mapper
public interface UserClassMapper {

	 public List<UserClassVo> findUserClass(Map<String,Object> map);  
	 
	 public List<UserClassVo> findUserClassByIds(Map<String,Object> map);  
}
