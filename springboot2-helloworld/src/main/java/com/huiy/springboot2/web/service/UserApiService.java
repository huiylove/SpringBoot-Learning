/**
 * 
 */
package com.huiy.springboot2.web.service;

import com.github.pagehelper.Page;
import com.huiy.springboot2.web.common.RespCommon;
import com.huiy.springboot2.web.model.TCnaBorrowUser;


/**
 * @author huiylove
 * @date 2019年1月23日
 */
public interface UserApiService {
	
	public RespCommon<Page<TCnaBorrowUser>> findByPaging(int pageNum,int pageSize,String sort);
	

}
