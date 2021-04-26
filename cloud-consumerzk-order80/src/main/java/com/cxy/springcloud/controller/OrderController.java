package com.cxy.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@Slf4j
public class OrderController {

    public static final String PAYMENT_URL = "http://cloud-payment-service";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping(value = "/zk/consumer/order")
    public String getOrder(){
        return restTemplate.getForObject(PAYMENT_URL + "/zk/getPayment", String.class);
    }

}
