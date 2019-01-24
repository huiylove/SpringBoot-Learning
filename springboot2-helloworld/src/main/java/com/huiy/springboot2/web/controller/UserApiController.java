/**
 * 
 */
package com.huiy.springboot2.web.controller;

import lombok.extern.log4j.Log4j2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.Page;
import com.huiy.springboot2.frame.exception.CustomException;
import com.huiy.springboot2.frame.model.ErrorRespInfo;
import com.huiy.springboot2.web.common.RespCommon;
import com.huiy.springboot2.web.model.TCnaBorrowUser;
import com.huiy.springboot2.web.model.UserQueryCondition;
import com.huiy.springboot2.web.service.UserApiService;

/**
 * @author huiylove
 * @date 2019年1月22日
 */
@RestController
@RequestMapping("/api/user")
@Log4j2
public class UserApiController {
	
	@Autowired
    private UserApiService userApiService;

	@GetMapping
    public RespCommon<Page<TCnaBorrowUser>> query(UserQueryCondition condition,
                            @PageableDefault(page = 2, size = 2, sort = "name,desc") Pageable pageable) {
        log.info(condition.toString());
        log.info("pagesize===="+pageable.getPageSize());
        log.info("pagenumber===="+pageable.getPageNumber());
        log.info("sort===="+pageable.getSort());
        return userApiService.findByPaging(pageable.getPageNumber(),pageable.getPageNumber(),orderBy(pageable.getSort().toString()));
    }

	public String orderBy(String sort){
		String order = sort.split(": ASC")[0];
		if(order.contains(",")) return order.split(",")[0]+" "+order.split(",")[1];
		else return sort.split(":")[0]+sort.split(":")[1];
	}
	
	@GetMapping("/exception")
    public int exception(@RequestParam(required = true)Integer num) {
		 if (num == 0) {
            throw new CustomException(ErrorRespInfo.ERROR, "除数不能为0");
        }
	    int i = 10/num;
		return i;
    }

}
