package com.huiy.springboot2.frame.exception;

import lombok.Data;

/**
 * 自定义异常类
 * @author huiylove
 * @date 2019年1月24日
 */
@Data
public class CustomException extends RuntimeException{

	 private String code;
     private String message;
     
     public CustomException(){
    	 super();
     }
	
     public CustomException(String message){
    	 super(message);
     }
     
     public CustomException(String code,String message){
    	 this.code = code;
    	 this.message = message;
     }
}
