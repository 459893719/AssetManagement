package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.mapper")
public class SpingdemoApplication {

    public static void main(String[] args) {
        System.out.print("Hello World");
        SpringApplication.run(SpingdemoApplication.class, args);
    }
}
