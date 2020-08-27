package com.zdw.openfeign.controller;

import com.zdw.openfeign.service.FeignClientService;
import com.zdw.springcloud.entities.CommonResult;
import com.zdw.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
public class FeignController {
    @Resource
    private FeignClientService feignClientService;

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        CommonResult<Payment> paymentById = feignClientService.getPaymentById(id);
        return paymentById;
    }
}
