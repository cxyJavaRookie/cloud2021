package com.cxy.springboot.Controller;

import com.cxy.springboot.entities.CommonResult;
import com.cxy.springboot.entities.Payment;
import com.cxy.springboot.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @Author ChenXingYu
 * @Date 2020/11/18 19:28
 */
@RestController
@RequestMapping("payment")
@Slf4j
public class PaymentController {

    @Resource
    public PaymentService paymentService;

    @Value("${server.port}")
    private String port;

    @GetMapping("query")
    public CommonResult<Payment> query(String id){
        log.info("热部署123213" + port);
        return new CommonResult<>(paymentService.queryOne(id));
    }

    @PostMapping("create")
    public CommonResult<Integer> create(@RequestBody Payment payment){
        return new CommonResult<>(paymentService.create(payment));
    }

}
