package com.huiy.springboothelloworld;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cache.CacheManager;
import org.springframework.test.context.junit4.SpringRunner;

import com.huiy.springboothelloworld.jpa.UserRepository;
import com.huiy.springboothelloworld.mysql.model.User;

/** 
 * 
 * @author : yuanhui 
 * @date   : 2018年4月28日
 */


@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootCacheTest {
	
	@Autowired
	private UserRepository userRepository;
//	
	@Autowired
	private CacheManager cacheManager;


	@Before
	public void before() {
//		userRepository.save(new User("HHH", 10));
	}

	@Test
	public void test() throws Exception {
		User u1 = userRepository.findByName("HHH");
		
		System.out.println("第一次查询：" + u1.getAge());

		User u2 = userRepository.findByName("HHH");
		System.out.println("第二次查询：" + u2.getAge());
	}

}
