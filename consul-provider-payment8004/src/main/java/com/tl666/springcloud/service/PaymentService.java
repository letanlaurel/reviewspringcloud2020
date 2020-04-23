package com.tl666.springcloud.service;

import com.tl666.springcloud.pojo.Payment;

import java.util.List;

public interface PaymentService {
    boolean addPaymentService(Payment payment);

    boolean delPaymentService(Integer id);

    boolean updatePaymentService(Payment payment);

    List<Payment> selectAllPaymentService();
}
