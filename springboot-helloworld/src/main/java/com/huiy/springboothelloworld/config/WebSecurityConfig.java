package com.huiy.springboothelloworld.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/** 
 * 启动Spring Security配置
 * @author : yuanhui 
 * @date   : 2018年4月28日
 */

@Configuration
@EnableWebSecurity //注解开启Spring Security的功能
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{//重写方法来设置一些web安全的细节
	
	@Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .authorizeRequests() //authorizeRequests()定义哪些URL需要被保护、哪些不需要被保护
                .antMatchers("/", "/home").permitAll()
                .anyRequest().authenticated()
                .and()
            .formLogin()  //formLogin() 定义当需要用户登录时候，转到的登录页面。
                .loginPage("/login")
                .permitAll()
                .and()
            .logout()
                .permitAll();
    }
	
	@Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth
            .inMemoryAuthentication()
                .withUser("user").password("password").roles("USER");//内存中创建了一个用户
    }
	

}
