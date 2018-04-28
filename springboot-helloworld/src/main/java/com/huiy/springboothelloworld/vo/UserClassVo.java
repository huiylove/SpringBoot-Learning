package com.huiy.springboothelloworld.vo;

import java.io.Serializable;

/** 
 * 
 * @author : yuanhui 
 * @date   : 2018年4月28日
 */
public class UserClassVo implements Serializable{
	
	private String userName;
	private String className;
	
	
	public String getUserName() {
		return userName;
	}
	public String getClassName() {
		return className;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	
	

}
