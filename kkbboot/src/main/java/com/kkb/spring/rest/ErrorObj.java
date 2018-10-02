package com.kkb.spring.rest;

import io.swagger.annotations.ApiModelProperty;

public class ErrorObj {

    @ApiModelProperty(notes = "Message burada gelir")
    private String msg;

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(final String msgParam) {
        this.msg = msgParam;
    }
}
