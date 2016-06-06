package com.demo.timer;

import org.springframework.scheduling.annotation.Scheduled;

public class Task2 {

    @Scheduled(fixedDelay = 2000)
    public void doTask() {
        System.out.println("spring Task2 doTask() ...");
    }
}
