package com.kob.matchingsystem;

import com.kob.matchingsystem.service.impl.MatchingServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class MatchingSystemApplication {
    private MatchingServiceImpl service;
    @PostConstruct
    public void init() {
        service = new MatchingServiceImpl();
        service.matchingPool.start();
    }
    public static void main(String[] args) {
        SpringApplication.run(MatchingSystemApplication.class, args);
    }
}
/* MatchingServiceImpl.matchingPool.start();   //启动匹配线程
 * 在Spring Boot应用程序中，直接在类字段初始化时调用方法（如service.matchingPool.start()）是不被允许的，
 * 因为这样做违反了Java的初始化顺序和Spring的生命周期管理。在Spring中，bean的初始化和依赖注入是由Spring容器管理的，
 * 而不是由你自己在代码中直接控制的。在你的MatchingSystemApplication类中，你尝试在类的字段初始化时启动线程，这是不正确的。
 * 你应该将线程的启动逻辑放在某个生命周期方法内，例如@PostConstruct注解的方法或者一个普通的初始化方法中。
 * 此外，由于MatchingPool是一个非静态内部类，你不能直接通过MatchingServiceImpl的实例来访问它.
 * 你需要先获得MatchingPool的实例，然后才能调用其start()方法。
 * 下面是一个修正后的示例，展示了如何在Spring Boot应用程序中正确地启动线程：
 * */
