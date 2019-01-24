package com.huiy.springboot2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = "com.huiy.springboot2.web.mapper")
@SpringBootApplication
public class Springboot2HelloworldApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springboot2HelloworldApplication.class, args);
	}

}

