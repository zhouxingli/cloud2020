package com.zxl.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class HystrixMain {
    public static void main(String[] args) {
        SpringApplication.run(HystrixMain.class,args);
    }
}
