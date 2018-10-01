package com.kkb.spring.mt;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.util.concurrent.ListenableFuture;

public class MyAsyncTestCallee {

    @Async("myThreadPool")
    public ListenableFuture<String> method2() {
        try {
            Thread.sleep(100);
        } catch (Exception eLoc) {
        }
        return AsyncResult.forValue("hello");
    }

}
