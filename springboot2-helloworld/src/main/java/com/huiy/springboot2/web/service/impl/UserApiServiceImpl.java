/**
 * 
 */
package com.huiy.springboot2.web.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.huiy.springboot2.web.common.RespCommon;
import com.huiy.springboot2.web.common.RespContent;
import com.huiy.springboot2.web.common.RespHeader;
import com.huiy.springboot2.web.mapper.TCnaBorrowUserMapper;
import com.huiy.springboot2.web.model.TCnaBorrowUser;
import com.huiy.springboot2.web.service.UserApiService;

/**
 * @author huiylove
 * @date 2019年1月23日
 */
@Service
public class UserApiServiceImpl implements UserApiService {
	
	@Autowired
	TCnaBorrowUserMapper tCnaBorrowUserMapper;
	
	private static RespCommon respCommon = new RespCommon();

	@Override
	public RespCommon<Page<TCnaBorrowUser>> findByPaging(int pageNum, int pageSize,String sort) {
//		PageHelper.startPage(pageNum,pageSize);
		PageHelper.startPage(pageNum, pageSize, sort);
	    Page<TCnaBorrowUser> userList = tCnaBorrowUserMapper.findByPaging();
	    respCommon.setContent(userList);
	    respCommon.setHead(new RespHeader("0000","响应成功"));
		return respCommon;
	}

}
