/**
 * 
 */
package com.huiy.springboot2.web.model;

import lombok.Data;

/**
 * @author huiylove
 * @date 2019年1月22日
 */
@Data
public class UserQueryCondition {
	
	private String username;

    private int age;
    private int ageTo;

}
