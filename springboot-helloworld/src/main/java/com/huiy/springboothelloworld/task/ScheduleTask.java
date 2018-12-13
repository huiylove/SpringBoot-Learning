package com.huiy.springboothelloworld.task;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/** 
 * 定时任务配置类
 * @author : yuanhui 
 * @date   : 2018年5月4日
 * @version : 1.0
 */
@Component
public class ScheduleTask {
	
	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm");

//    @Scheduled(fixedRate = 5000)
//    @Scheduled(cron="0 0/1 * * * ?")//0 0 0/1 * * ?
    public void reportCurrentTime() {
        System.out.println("现在时间：" + dateFormat.format(new Date()));
    }
}
