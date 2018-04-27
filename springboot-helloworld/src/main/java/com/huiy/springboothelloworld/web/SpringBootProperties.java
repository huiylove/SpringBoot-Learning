package com.huiy.springboothelloworld.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2018年4月26日
 * @version 1.0
 */
@Component
public class SpringBootProperties {
	
	@Value("${com.huiy.springboot.name}")
	private String name;
	
	@Value("${com.huiy.springboot.title}")
	private String title;

	public String getName() {
		return name;
	}

	public String getTitle() {
		return title;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
}
