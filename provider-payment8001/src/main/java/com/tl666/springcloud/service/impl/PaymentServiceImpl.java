package com.tl666.springcloud.service.impl;

import com.tl666.springcloud.mapper.PaymentMapper;
import com.tl666.springcloud.pojo.Payment;
import com.tl666.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: TanLe
 * @Date: 2020/4/22 17:44
 * @Description:
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    PaymentMapper paymentMapper;


    @Override
    public boolean addPaymentService(Payment payment) {
        return paymentMapper.addPayment(payment);
    }

    @Override
    public boolean delPaymentService(Integer id) {
        return paymentMapper.delPayment(id);
    }

    @Override
    public boolean updatePaymentService(Payment payment) {
        return paymentMapper.updatePayment(payment);
    }

    @Override
    public List<Payment> selectAllPaymentService() {
        return paymentMapper.selectAllPayment();
    }
}
