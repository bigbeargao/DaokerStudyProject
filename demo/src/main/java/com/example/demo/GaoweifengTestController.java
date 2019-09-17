package com.example.demo;

import org.springframework.beans.BeanUtils;
import org.springframework.util.CollectionUtils;
import org.springframework.util.NumberUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

@RestController
public class GaoweifengTestController implements Comparable {
    public void b() {
        AtomicInteger atomicInteger = new AtomicInteger(5);
        atomicInteger.getAndSet(5);
        String s = Integer.toString(1);
        GaoweifengTestController gaoweifengTestController = new GaoweifengTestController();

    }


    @GetMapping("/x/{b}")
    @RequestMapping()
    public void a(@PathVariable String b) {
        TimeUnit.SECONDS.toDays(1);
        //新建一个线程
        new Thread(new Runnable() {
            @Override
            public void run() {

            }
        }).start();

        //新建一个线程池
        ExecutorService executorService = Executors.newCachedThreadPool();
        BlockingQueue blockingQueue = new ArrayBlockingQueue(122);
        try {
            blockingQueue.put("2");
            blockingQueue.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        executorService.execute(new Runnable() {
            @Override
            public void run() {

            }
        });
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
