package com.learn.mybatislearn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.stereotype.Repository;

@SpringBootApplication
@EntityScan(basePackages = "com.learn.mybaitslearn")
@MapperScan("com.learn.mybatislearn.dao")
public class MybatislearnApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatislearnApplication.class, args);
    }

}

