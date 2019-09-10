package com.example.demo;

import org.springframework.util.CollectionUtils;
import org.springframework.util.NumberUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

@RestController
public class GaoweifengTestController {
    public void b() {
        AtomicInteger atomicInteger = new AtomicInteger(5);
        atomicInteger.getAndSet(5);
        Integer.toString(1);
    }


    @GetMapping(value = "/x")
    public void a() {
        //新建一个线程
        new Thread(new Runnable() {
            @Override
            public void run() {

            }
        }).start();

        //新建一个线程池
        Executor executor = Executors.newCachedThreadPool();
        executor.execute(new Runnable() {
            @Override
            public void run() {

            }
        });
    }
}
