package com.huiy.springboot2.web.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lombok.extern.log4j.Log4j2;

import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;

@Log4j2
public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//		log.info("=====进入登录拦截器=====");
//        Object userName = request.getSession().getAttribute("loginUserName");
//        if(StringUtils.isEmpty(userName)){
//            request.setAttribute("msg","您没有操作权限");
//            request.getRequestDispatcher("/index.html").forward(request,response);
//            return false;
//        }
        return true;
    }

}
