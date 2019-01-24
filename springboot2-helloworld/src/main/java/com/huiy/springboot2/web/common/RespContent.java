package com.huiy.springboot2.web.common;
/** 
 * 
 * @author : yuanhui 
 * @date   : 2018年7月25日
 * @version : 1.0
 */
public class RespContent<T> {
	
	private T datas;

	public RespContent(T t){
		this.datas = t;
	}
   
	public T getDatas() {
		return datas;
	}

	public void setDatas(T datas) {
		this.datas = datas;
	}
	
}
