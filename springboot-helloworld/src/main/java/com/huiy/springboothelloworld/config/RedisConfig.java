package com.huiy.springboothelloworld.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import com.huiy.springboothelloworld.model.User;
import com.huiy.springboothelloworld.redis.RedisObjectSerializer;

/** 
 * 
 * @author : yuanhui 
 * @date   : 2018年4月28日
 */
@Configuration
public class RedisConfig {
	
	 @Bean
	 public RedisTemplate<String,User> redisTemplate(RedisConnectionFactory factory){
		 RedisTemplate<String, User> template = new RedisTemplate<String, User>();
	        template.setConnectionFactory(factory);
	        template.setKeySerializer(new StringRedisSerializer());
	        template.setValueSerializer(new RedisObjectSerializer());
	        return template;
	 }

}
