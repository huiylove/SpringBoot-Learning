package com.huiy.springboot2.web.model;

import java.util.Date;
import java.util.List;
import java.util.Map;

import lombok.Data;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


/**
 * @author Administrator
 * lombok包，相关注解
 */
@Data 
@Component
@ConfigurationProperties(prefix = "person")
@PropertySource("classpath:config/person.properties") //可以加载多个配置文件
public class Person {
	
	private String name;
    private int age;
    private Date birthDay;
    private boolean boy;
    private Animal animal;
    private Map<String,Object> map;
    private List<String> list;

}
