package com.cxy.springboot.service.impl;

import com.cxy.springboot.dao.PaymentDao;
import com.cxy.springboot.entities.Payment;
import com.cxy.springboot.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author ChenXingYu
 * @Date 2020/11/18 19:25
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;


    @Override
    public Payment queryOne(String id) {
        return paymentDao.selectByPrimaryKey(id);
    }

    @Override
    public int create(Payment payment) {
        return paymentDao.insert(payment);
    }
}
