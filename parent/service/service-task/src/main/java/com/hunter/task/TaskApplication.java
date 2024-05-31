package com.hunter.task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.hunter.task.dao")
public class TaskApplication {
    public static void main(String[] args) {
        SpringApplication.run(TaskApplication.class);
    }
}