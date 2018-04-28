package com.huiy.springboothelloworld.mysql.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2018年4月26日
 * @version 1.0
 */

@Entity
public class Class implements Serializable{

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String className;

	public Long getId() {
		return id;
	}

	public String getClassName() {
		return className;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setClassName(String className) {
		this.className = className;
	}


}

