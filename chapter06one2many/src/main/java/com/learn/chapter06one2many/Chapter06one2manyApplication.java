package com.learn.chapter06one2many;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.learn.chapter06one2many")
@MapperScan("com.learn.chapter06one2many.dao")
public class Chapter06one2manyApplication {

    public static void main(String[] args) {
        SpringApplication.run(Chapter06one2manyApplication.class, args);
    }

}

