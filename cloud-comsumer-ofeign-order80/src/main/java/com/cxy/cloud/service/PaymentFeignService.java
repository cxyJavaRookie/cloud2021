package com.cxy.cloud.service;

import com.cxy.springboot.entities.CommonResult;
import com.cxy.springboot.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@FeignClient("CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {

    @GetMapping("/payment/query")
    CommonResult<Payment> query(@RequestParam("id") String id);

}
