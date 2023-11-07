package com.ccst.endserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EndServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EndServerApplication.class, args);
    }

}
