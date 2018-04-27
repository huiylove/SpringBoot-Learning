package com.huiy.springboothelloworld;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.huiy.springboothelloworld.web.controller.UserController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootRESTFulAPIApplicationTests {

	private MockMvc mvc;

	@Before
	public void setUp() throws Exception {
		mvc = MockMvcBuilders.standaloneSetup(new UserController()).build();
	}

	@Test
	public void contextLoads() throws Exception {
		// 测试UserController 
		RequestBuilder request = null; 
 
		// 1、get查一下user列表，应该为空 
		request = get("/users/"); 
		mvc.perform(request) 
				.andExpect(status().isOk()) 
				.andExpect(content().string(equalTo("[]")));
		
		// 2、post提交一个user 
		request = post("/users/")
				.param("id", "1") 
				.param("name", "程序媛MM") 
				.param("age", "27"); ; 
		mvc.perform(request)
				.andExpect(status().isOk()) 
				.andExpect(content().string(equalTo("success")));
		
		
		request = post("/users/")
				.param("id", "2") 
				.param("name", "成勋MM") 
				.param("age", "27"); ; 
		mvc.perform(request)
				.andExpect(status().isOk()) 
				.andExpect(content().string(equalTo("success")));
		
		// 3、get查询列表 
		request = get("/users/"); 
		mvc.perform(request).andDo(print());
				
		
		// 4、put修改id为1的user 
		request = put("/users/1") 
				.param("name", "测试MM") 
				.param("age", "28"); 
		mvc.perform(request) 
				.andExpect(status().isOk()) 
				.andDo(print()); 
		
		
		// 5、get修改id为1的user 
		request = get("/users/1");
		mvc.perform(request) 
				.andExpect(status().isOk()) 
				.andDo(print()); 
		
		// 6、del删除id为1的user 
		request = delete("/users/1"); 
		mvc.perform(request)
			.andExpect(status().isOk()) 
			.andDo(print());
	 
		// 7、get查一下user列表，应该为空 
		request = get("/users/"); 
		mvc.perform(request) 
				.andExpect(status().isOk()) 
				.andDo(print()); 
		
	}


}
