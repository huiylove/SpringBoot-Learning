package com.huiy.springboot2.web.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonView;

/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2019年1月21日
 * @version 1.0
 */
//@Data
public class User {
	
	public interface UserSimpleView {};
    public interface UserDetailView extends UserSimpleView {};

    private Long id;
  
    private String name;

    private Integer age;
    
    private Date birthday;

    @JsonView(UserSimpleView.class)
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	// JsonView根据视图控制字段的输出
    @JsonView(UserSimpleView.class)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

    @JsonView(UserDetailView.class)
	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

    @JsonView(UserSimpleView.class)
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

  
}

