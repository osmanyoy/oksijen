package com.kkb.spring.appevent;

import org.springframework.context.ApplicationEvent;

public class MyAppEvent extends ApplicationEvent {

    private static final long serialVersionUID = 1979093463041781573L;

    private String            message;
    private int               cause;
    private boolean           error;

    public MyAppEvent() {
        super(MyAppEvent.class);
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(final String messageParam) {
        this.message = messageParam;
    }

    public int getCause() {
        return this.cause;
    }

    public void setCause(final int causeParam) {
        this.cause = causeParam;
    }

    public boolean isError() {
        return this.error;
    }

    public void setError(final boolean errorParam) {
        this.error = errorParam;
    }

    @Override
    public String toString() {
        return "MyAppEvent [message=" + this.message + ", cause=" + this.cause + ", error=" + this.error + "]";
    }


}
