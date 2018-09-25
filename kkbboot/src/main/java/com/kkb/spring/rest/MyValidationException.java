package com.kkb.spring.rest;


public class MyValidationException extends Exception {

    private final String msg;

    public MyValidationException(final String msg) {
        this.msg = msg;
        // TODO Auto-generated constructor stub
    }

    public String getMsg() {
        return msg;
    }
}
