package com.zdw.openfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Feignmain {
    public static void main(String[] args) {
        SpringApplication.run(Feignmain.class,args);
    }
}
