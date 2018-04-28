package com.huiy.springboothelloworld;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import com.huiy.springboothelloworld.mysql.mapper.UserClassMapper;
import com.huiy.springboothelloworld.vo.UserClassVo;

/** 
 * 
 * @author : yuanhui 
 * @date   : 2018年4月28日
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootMybatisTest {
	
//	@Autowired
//	private UserMapper userMapper;
//	
//	@Autowired
//	private ClassMapper classMapper;
//	
	
	@Autowired
	private UserClassMapper userClassMapper;
	
	@Test
	@Rollback
	public void findByName() throws Exception {
//		userMapper.insert("FFF", 20);
//		User u = userMapper.findByName("FFF");
//		Assert.assertEquals(20, u.getAge().intValue());
		Map<String,Object> map = new HashMap<String,Object>();
//		map.put("name","AAA");
//		List<UserClassVo> ucList = classMapper.findUserClassByName(map);
//		Assert.assertEquals(3, ucList.size());
		
		List<UserClassVo> ucList = userClassMapper.findUserClass(map);
        for(UserClassVo vo:ucList){
        	System.out.println(vo.getUserName()+"_"+vo.getClassName());
        }        
		

	}

}
