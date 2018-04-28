package com.huiy.springboothelloworld;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import com.huiy.springboothelloworld.model.User;

/** 
 * 
 * @author : yuanhui 
 * @date   : 2018年4月27日
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringDataRedisTest {
	
	Logger logger = LoggerFactory.getLogger(SpringDataRedisTest.class);
			
//	@Autowired
//	private StringRedisTemplate stringRedisTemplate;

	@Autowired
	private RedisTemplate<String, User> redisTemplate;
	

	@Test
	public void test() throws Exception {

		// 保存字符串
//		stringRedisTemplate.opsForValue().set("aaa", "111");
//		Assert.assertEquals("111", stringRedisTemplate.opsForValue().get("aaa"));
		redisTemplate.opsForValue().set("user1", new User("aaaa",27));
		redisTemplate.opsForValue().set("user2", new User("bbbb",28));
		Assert.assertEquals(27,redisTemplate.opsForValue().get("user1").getAge().intValue());
//		Assert.assertEquals("bbbb",redisTemplate.opsForValue().get("user2").getName());


    }

}
