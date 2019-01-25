package com.huiy.springboot2.web.job;

import java.time.LocalDateTime;

import lombok.extern.log4j.Log4j2;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author huiylove
 * @date 2019年1月24日
 */
@Log4j2
@Component
public class SpringTaskDemo {

	@Async
    @Scheduled(cron = "0/1 * * * * *")
    public void scheduled1() throws InterruptedException {
        Thread.sleep(3000);
        log.info("scheduled1 每1秒执行一次：{}", LocalDateTime.now());
    }

//    @Scheduled(fixedRate = 1000)
//    public void scheduled2() throws InterruptedException {
//        Thread.sleep(3000);
//        log.info("scheduled2 每1秒执行一次：{}", LocalDateTime.now());
//    }
//
//    @Scheduled(fixedDelay = 3000)
//    public void scheduled3() throws InterruptedException {
//        Thread.sleep(5000);
//        log.info("scheduled3 上次执行完毕后隔3秒继续执行：{}", LocalDateTime.now());
//    }
}
