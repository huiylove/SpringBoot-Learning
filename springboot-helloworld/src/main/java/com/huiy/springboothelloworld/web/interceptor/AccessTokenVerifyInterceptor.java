package com.huiy.springboothelloworld.web.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/** 
 * 
 * @author : yuanhui 
 * @date   : 2018年4月27日
 */

@Component
public class AccessTokenVerifyInterceptor extends HandlerInterceptorAdapter {
 
    private final static Logger LOG = LoggerFactory.getLogger(AccessTokenVerifyInterceptor.class);
 
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        LOG.info("AccessToken executing ...");
        
        //token验证
//        String token = request.getParameter("access_token");
        System.out.println("--------------------进入拦截器-----------------");
        return true;
    }
}
