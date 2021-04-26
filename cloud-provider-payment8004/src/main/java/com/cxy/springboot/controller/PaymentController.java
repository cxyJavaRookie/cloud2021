package com.cxy.springboot.controller;

import cn.hutool.core.lang.UUID;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class PaymentController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/zk/getPayment")
    public String getPayment(){
        return "springCloud Zookeeper PaymentService :" + port + UUID.randomUUID();
    }

}
