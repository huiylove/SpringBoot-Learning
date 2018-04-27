package com.huiy.springboothelloworld;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import springfox.documentation.spring.web.json.Json;

import com.huiy.springboothelloworld.model.UserRepository;
import com.huiy.springboothelloworld.web.controller.UserWithSpringDataController;

/** 
 * 
 * @author : yuanhui 
 * @date   : 2018年4月27日
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringDataJpaTest {
	
	Logger logger = LoggerFactory.getLogger(SpringDataJpaTest.class);
			
	@Autowired
	private UserRepository userRepository;
	
	private MockMvc mvc;

	@Before
	public void setUp() throws Exception {
		mvc = MockMvcBuilders.standaloneSetup(new UserWithSpringDataController()).build();
	}
	
	@Test
	public void jpatest() throws Exception{
		
//		RequestBuilder request = null; 
//		 
//		// 1、get查一下user列表，应该为空 
//		request = get("/user/all"); 
//		mvc.perform(request) 
//				.andExpect(status().isOk()) 
//				.andExpect(content().string(equalTo("[]")));
//		
//		// 2、post提交一个user 
//		request = post("/user/save")
//				.param("name", "freya") 
//				.param("age", "27"); ; 
//		mvc.perform(request)
//				.andExpect(status().isOk()) 
//				.andExpect(content().string(equalTo("success")));
				
		// 创建5条记录
//		userRepository.save(new User("AAA", 10));
//		userRepository.save(new User("BBB", 20));
//		userRepository.save(new User("CCC", 30));
//		userRepository.save(new User("DDD", 40));
//		userRepository.save(new User("EEE", 50));
//	
//		// 测试findAll, 查询所有记录
		Assert.assertEquals(5, userRepository.findAll().size());
//	
//		// 测试findByName, 查询姓名为FFF的User
//		Assert.assertEquals(60, userRepository.findByName("FFF").getAge().longValue());
//	
//		// 测试findUser, 查询姓名为FFF的User
		Assert.assertEquals(50	, userRepository.findUser("EEE").getAge().longValue());
//	
		
//		// 测试findByNameAndAge, 查询姓名为FFF并且年龄为60的User
//		Assert.assertEquals("FFF", userRepository.findByNameAndAge("FFF", 60).getName());
//	
//		// 测试删除姓名为AAA的User
//		userRepository.delete(userRepository.findByName("AAA"));
//	
//		// 测试findAll, 查询所有记录, 验证上面的删除是否成功
//		Assert.assertEquals(9, userRepository.findAll().size());
	}

}
