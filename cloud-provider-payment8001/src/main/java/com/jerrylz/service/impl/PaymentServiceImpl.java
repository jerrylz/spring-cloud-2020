package com.jerrylz.service.impl;

import com.jerrylz.dao.PaymentDao;
import com.jerrylz.entities.Payment;
import com.jerrylz.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author jerrylz
 * @date 2020/4/14
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;
    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
