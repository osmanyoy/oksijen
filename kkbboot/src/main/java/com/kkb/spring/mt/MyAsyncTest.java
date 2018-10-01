package com.kkb.spring.mt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;

public class MyAsyncTest {

    @Autowired
    private MyAsyncTestCallee asyncTestCallee;

    public String method1() {
        ListenableFuture<String> method2Loc = this.asyncTestCallee.method2();

        final String stringLoc5 = "test";

        method2Loc.addCallback(new ListenableFutureCallback<String>() {

            @Override
            public void onSuccess(final String resultParam) {
                String stringLoc6 = stringLoc5;
                System.out.println("result : " + resultParam);
            }

            @Override
            public void onFailure(final Throwable exParam) {
                System.err.println("Error : " + exParam);
            }
        });
        String stringLoc = "test";
        for (int iLoc = 0; iLoc < 10; iLoc++) {
            stringLoc += iLoc;
        }

        try {

            if (method2Loc.isDone()) {
                String string2Loc = method2Loc.get();
                stringLoc += string2Loc;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return stringLoc;
    }


}
