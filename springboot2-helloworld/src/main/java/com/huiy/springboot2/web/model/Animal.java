package com.huiy.springboot2.web.model;

import lombok.Data;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data 
@Component
@ConfigurationProperties(prefix = "animal")
public class Animal {
	private String name;
	private int age;

}
