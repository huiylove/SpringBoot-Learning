package com.huiy.springboot2.web.common;

/**
 * 接口返回消息
 * @author user
 *
 */
public class RespCommon<T> {
	
	/**
	 * 返回头 
	 */
	private RespHeader head;
	
	/**
	 * 返回报文
	 */
	private T content;
	
	
	public RespHeader getHead() {
		return head;
	}
	
	public void setHead(RespHeader head) {
		this.head = head;
	}

	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}
	
	
	
	
}
