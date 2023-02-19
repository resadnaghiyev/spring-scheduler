package com.rashad.springscheduler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Slf4j
@Component
//@EnableAsync
public class Scheduler {

//    @Autowired
//    private ThreadPoolTaskScheduler taskScheduler;

//    @Async
//    @Scheduled(cron = "*/2 * * * * *")
    @Scheduled(fixedRate = 1000, initialDelay = 1000)
    public void scheduler() throws InterruptedException {
        LocalDateTime current = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = current.format(format);
        log.info("Scheduler time " + formattedDateTime);
        Thread.sleep(10000);
    }


//    public void noOfThreads() {
//
//        // logic returns 3
//
//        taskScheduler.setPoolSize(10);
//    }
}
