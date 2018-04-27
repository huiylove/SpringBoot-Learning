package com.huiy.springboothelloworld.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.huiy.springboothelloworld.web.interceptor.AccessTokenVerifyInterceptor;

/** 
 * 
 * @author : yuanhui 
 * @date   : 2018年4月27日
 */
@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {
 
    @Bean
    public AccessTokenVerifyInterceptor tokenVerifyInterceptor() {
        return new AccessTokenVerifyInterceptor();
    }
 
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(tokenVerifyInterceptor()).addPathPatterns("/","/user/all","/hello");
        super.addInterceptors(registry);
    }
 
}
