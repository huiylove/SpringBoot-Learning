package com.huiy.frame.core.model;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2018年4月27日
 * @version 1.0
 */
public class ErrorInfo<T> {
	 	public static final Integer OK = 0;
	    public static final Integer ERROR = 100;

	    private Integer code;
	    private String message;
	    private String url;
	    private T data;
	    
	    
		public Integer getCode() {
			return code;
		}
		public String getMessage() {
			return message;
		}
		public String getUrl() {
			return url;
		}
		public T getData() {
			return data;
		}
		public void setCode(Integer code) {
			this.code = code;
		}
		public void setMessage(String message) {
			this.message = message;
		}
		public void setUrl(String url) {
			this.url = url;
		}
		public void setData(T data) {
			this.data = data;
		}

	    // 省略getter和setter


}
