package com.cxy.springboot.service;

import com.cxy.springboot.entities.Payment;

public interface PaymentService {
    Payment queryOne(String id);
    int create(Payment payment);

}
