package com.cxy.cloud.controller;

import com.cxy.cloud.service.PaymentFeignService;
import com.cxy.springboot.entities.CommonResult;
import com.cxy.springboot.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
public class OrderFeignController {

    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping("/consumer/query")
    public CommonResult<Payment> query(String id){
        return paymentFeignService.query(id);
    }

}
