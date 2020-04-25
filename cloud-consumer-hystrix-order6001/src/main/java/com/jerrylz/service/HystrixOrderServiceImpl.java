package com.jerrylz.service;

import com.jerrylz.entities.CommonResult;
import com.jerrylz.entities.Payment;
import org.springframework.stereotype.Service;

/**
 * @author jerrylz
 * @date 2020/4/25
 */
@Service
public class HystrixOrderServiceImpl implements HystrixOrderService {
    @Override
    public CommonResult<Payment> getPaymentById(Long id) {
        return null;
    }

    @Override
    public String readTimeOut() {
        return ">>>>>>>>>HystrixOrderServiceImpl服务降级";
    }
}
