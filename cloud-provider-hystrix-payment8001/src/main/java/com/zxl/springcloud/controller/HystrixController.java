package com.zxl.springcloud.controller;

import com.zxl.springcloud.service.HystrixService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.logging.Logger;

@RestController
@Slf4j
public class HystrixController {
    @Resource
    private HystrixService hystrixService;


    @GetMapping("/payment/hystrix/{id}")
    public String hystrix_ok(@PathVariable("id") Long id){
       return hystrixService.hystrix_ok(id);
    }

    @GetMapping("/payment/hystrixbreak/{id}")
    public String hystrix_break(@PathVariable("id") Long id){

        return hystrixService.hystrix_break(id);
    }
}
