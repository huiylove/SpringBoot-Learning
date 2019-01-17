package com.huiy.springboot2;

import lombok.extern.slf4j.Slf4j;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.huiy.springboot2.web.model.Person;

@Slf4j //springboot2.0默认采用slf4j+logback日志框架
@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot2HelloworldApplicationTests {
	
	@Autowired
    Person person;

	@Test
	public void contextLoads() {
//	    System.out.println(person.toString());
		log.info("junit-test-properties=========:"+person.toString());
	}

}

