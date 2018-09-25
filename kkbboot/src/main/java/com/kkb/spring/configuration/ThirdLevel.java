package com.kkb.spring.configuration;


public class ThirdLevel {

    private int    port;
    private String level;

    public int getPort() {
        return this.port;
    }

    public void setPort(final int portParam) {
        this.port = portParam;
    }

    public String getLevel() {
        return this.level;
    }

    public void setLevel(final String levelParam) {
        this.level = levelParam;
    }

    @Override
    public String toString() {
        return "ThirdLevel [port=" + this.port + ", level=" + this.level + "]";
    }


}
