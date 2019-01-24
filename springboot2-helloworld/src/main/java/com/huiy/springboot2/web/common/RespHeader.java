package com.huiy.springboot2.web.common;
/** 
 * 
 * @author : yuanhui 
 * @date   : 2018年7月25日
 * @version : 1.0
 */
public class RespHeader {
	
	/**返回码**/
	private String resCode;
	/**返回描述**/
	private String resMsg;
	
	public RespHeader(String resCode,String resMsg){
		this.resCode = resCode;
		this.resMsg = resMsg;
	}
	
	public String getResCode() {
		return resCode;
	}
	public String getResMsg() {
		return resMsg;
	}
	public void setResCode(String resCode) {
		this.resCode = resCode;
	}
	public void setResMsg(String resMsg) {
		this.resMsg = resMsg;
	}


}
