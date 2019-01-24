package com.huiy.springboot2;

import lombok.extern.log4j.Log4j2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;                
import org.springframework.test.context.junit4.SpringRunner;

//@Slf4j //springboot2.0默认采用slf4j+logback日志框架
@Log4j2
@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot2RedisTests {
	
	@Autowired
	StringRedisTemplate stringRedisTemplate;
	@Autowired
	RedisTemplate redisTemplate;

	@Test
	public void contextLoads() {
	    stringRedisTemplate.opsForValue().append("append","asss");
	    String append = stringRedisTemplate.opsForValue().get("append");
	    log.info(append);
	}

	@Test
	public void test01(){
	    ValueOperations<String,Object> vo = redisTemplate.opsForValue();
	    vo.set("redis","redisTemplate");
	    Object name = vo.get("redis");
	    log.info(name);
	}


}

