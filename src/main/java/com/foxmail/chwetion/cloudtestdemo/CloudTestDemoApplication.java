package com.foxmail.chwetion.cloudtestdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@MapperScan("com.foxmail.chwetion.cloudtestdemo.dao")
public class CloudTestDemoApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(CloudTestDemoApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(CloudTestDemoApplication.class, args);
    }

}
