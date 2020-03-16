package com.foxmail.chwetion.cloudtestdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.foxmail.chwetion.cloudtestdemo.dao")
public class CloudTestDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudTestDemoApplication.class, args);
    }

}
