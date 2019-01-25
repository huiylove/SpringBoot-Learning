package com.huiy.springboot2.frame.exception.handler;

import javax.servlet.http.HttpServletRequest;

import lombok.extern.log4j.Log4j2;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.huiy.springboot2.frame.exception.CustomException;
import com.huiy.springboot2.frame.model.ErrorRespInfo;

/**
 * 全局异常处理类
 * @author huiylove
 * @date 2019年1月24日
 */
@Log4j2
@ControllerAdvice
public class GlobalExceptionHandler { 
	
	public static final String DEFAULT_ERROR_VIEW = "exerror";

	@ExceptionHandler(value = Exception.class)
    public ModelAndView defaultErrorHandler(HttpServletRequest req,final Exception e) throws Exception {
    	log.info("-----------------进入统一异常处理类-------------------");
        ModelAndView mav = new ModelAndView();
        mav.addObject("exception",e); 
        mav.addObject("url", req.getRequestURL());
    	log.info("message==="+e.getMessage());    
    	log.info("url==="+req.getRequestURL());
        mav.setViewName(DEFAULT_ERROR_VIEW);
        return mav;
    }
	
	@ExceptionHandler(value = CustomException.class)
	@ResponseBody
	public ErrorRespInfo customErrorHandler(HttpServletRequest req,final Exception e) throws Exception {
    	log.info("-----------------进入自定义处理类-------------------");
    	ErrorRespInfo r = new ErrorRespInfo();
    	CustomException exception = (CustomException)e;
        r.setCode(exception.getCode());
        r.setMessage(exception.getMessage());
        return r;
    }
	
	
}
