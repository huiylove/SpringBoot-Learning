/**
 * 
 */
package com.huiy.springboot2.frame.model;

import lombok.Data;

/**
 * @author huiylove
 * @date 2019年1月24日
 */
@Data
public class ErrorRespInfo {
	
	public static final String OK = "0000";
    public static final String ERROR = "9999";
	
	private String code;
    private String message;
    
//    private String url;
//    private T data;
    

}
