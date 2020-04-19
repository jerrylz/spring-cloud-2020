package com.jerrylz.service;

import com.jerrylz.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author jerrylz
 * @date 2020/4/14
 */
public interface PaymentService {
    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
