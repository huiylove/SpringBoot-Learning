package com.huiy.springboot2.web.mapper;

import com.github.pagehelper.Page;
import com.huiy.springboot2.web.model.TCnaBorrowUser;

public interface TCnaBorrowUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TCnaBorrowUser record);

    int insertSelective(TCnaBorrowUser record);

    TCnaBorrowUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TCnaBorrowUser record);

    int updateByPrimaryKey(TCnaBorrowUser record);
    
    Page<TCnaBorrowUser> findByPaging();
}