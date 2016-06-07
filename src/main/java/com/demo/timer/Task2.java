package com.demo.timer;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@EnableScheduling
public class Task2 {

    @Scheduled(fixedDelay = 2000)
    public void doTask() {
        System.out.println("spring Task2 doTask() ...");
    }
}
