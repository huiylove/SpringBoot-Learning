package com.huiy.springboothelloworld;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.huiy.springboothelloworld.web.SpringBootProperties;

/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2018年4月26日
 * @version 1.0
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class PropertiesApplicationTest {
	
	@Autowired
	private SpringBootProperties springbootProperties;
	
	@Test
	public void contextLoads() throws Exception {
		Assert.assertEquals("huiylove",springbootProperties.getName());
		Assert.assertEquals( "SpringBoot",springbootProperties.getTitle());
		
	}


}
