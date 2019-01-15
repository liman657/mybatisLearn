package com.learn.chapterfour;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.learn.chapterfour")
@MapperScan("com.learn.chapterfour.dao")
public class ChapterfourApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChapterfourApplication.class, args);
    }

}