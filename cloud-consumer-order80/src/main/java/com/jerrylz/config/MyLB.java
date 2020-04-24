package com.jerrylz.config;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author jerrylz
 * @date 2020/4/24
 */
public class MyLB  implements  LoadBalance{
    private AtomicInteger atomicInteger = new AtomicInteger(0);

    private final int getAndIncrement(){
        int current, next;
        do {
            current = atomicInteger.get();
            next = current >= Integer.MAX_VALUE ? 0 : current+1;
        }while (!atomicInteger.compareAndSet(current, next));

        return next;
    }
    @Override
    public ServiceInstance getInstance(List<ServiceInstance> instanceList) {
        int index = atomicInteger.getAndIncrement() % instanceList.size();
        return instanceList.get(index);
    }
}
