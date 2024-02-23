package com.kob.botrunningsystem;

import com.kob.botrunningsystem.service.impl.BotRunningServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class BotRunningSystemApplication {

    private BotRunningServiceImpl service;
    @PostConstruct
    public void init() {
        service = new BotRunningServiceImpl();
        service.botPool.start() ;
    }
    public static void main(String[] args) {
        SpringApplication.run(BotRunningSystemApplication.class, args);
    }

}
