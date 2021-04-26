package com.cxy.springboot.controller;

import com.cxy.springboot.entities.CommonResult;
import com.cxy.springboot.entities.Payment;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Author ChenXingYu
 * @Date 2020/11/18 20:19
 */
@RestController
@RequestMapping("consumer")
@EnableEurekaClient
public class OrderController {

    public static final String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/query")
    public CommonResult<Payment> query(String id){
        return restTemplate.getForObject(PAYMENT_URL + "/payment/query?id="+id,CommonResult.class);
    }

    @GetMapping("/create")
    public CommonResult<Integer> create(Payment payment){
        return restTemplate.postForObject(PAYMENT_URL + "/payment/create",payment,CommonResult.class);
    }
}
