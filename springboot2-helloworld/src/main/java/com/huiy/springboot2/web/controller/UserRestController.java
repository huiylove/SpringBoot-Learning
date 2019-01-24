/**
 * 
 */
package com.huiy.springboot2.web.controller;

import java.util.List;

import lombok.extern.log4j.Log4j2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonView;
import com.huiy.springboot2.web.mapper.UserMapper;
import com.huiy.springboot2.web.model.User;
import com.huiy.springboot2.web.model.UserQueryCondition;
import com.huiy.springboot2.web.service.UserService;

/**
 * @author huiylove
 * @date 2019年1月22日
 */
@RestController
@RequestMapping("/user")
@Log4j2
public class UserRestController {
	
	@Autowired
    private UserService userService;

	@GetMapping
    @JsonView(User.UserSimpleView.class)
    public List<User> query(UserQueryCondition condition,
                            @PageableDefault(page = 2, size = 2, sort = "name,asc") Pageable pageable) {
        log.info(condition.toString());
        log.info("pagesize===="+pageable.getPageSize());
        log.info("pagenumber===="+pageable.getPageNumber());
        log.info("sort===="+pageable.getSort());
        return userService.findAll();
    }

	
	@GetMapping("/{id:\\d+}")
    @JsonView(User.UserDetailView.class)
    public User getInfo(@PathVariable int id) {
        return userService.getUserById(id);
    }
    
	@PostMapping
    public void create(@RequestBody User user) {
          userService.addUser(user);
    }
    
    @PutMapping
    public User update(@RequestBody User user) {
    	userService.updateUser(user);
        return user;
    }

    @DeleteMapping("/{id:\\d+}")
    public void delete(@PathVariable int id) {
    	userService.delUserById(id);
    }

}
