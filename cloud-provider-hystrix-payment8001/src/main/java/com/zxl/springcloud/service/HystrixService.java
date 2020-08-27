package com.zxl.springcloud.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.concurrent.TimeUnit;

@Service
public class HystrixService {


    public String hystrix_ok(@PathVariable("id") Long id){
        return Thread.currentThread().getName()+"当前id为："+id;
    }

    public String hystrix_break(@PathVariable("id") Long id){
        try {
            //TimeUnit.SECONDS.sleep(5);
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return Thread.currentThread().getName()+"当前id为："+id;
    }


}
