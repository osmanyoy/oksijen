package com.kkb.spring.configuration;

import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "kkb.prop")
public class MyConfigurationObj {


    private String              restIp;

    private List<String>        ipsList;

    private Map<String, String> mapTest;

    private SubObj              sub;


    public String getRestIp() {
        return this.restIp;
    }


    public void setRestIp(final String restIpParam) {
        this.restIp = restIpParam;
    }


    public List<String> getIpsList() {
        return this.ipsList;
    }


    public void setIpsList(final List<String> ipsListParam) {
        this.ipsList = ipsListParam;
    }


    public Map<String, String> getMapTest() {
        return this.mapTest;
    }


    public void setMapTest(final Map<String, String> mapTestParam) {
        this.mapTest = mapTestParam;
    }


    public SubObj getSub() {
        return this.sub;
    }


    public void setSub(final SubObj subParam) {
        this.sub = subParam;
    }


    @Override
    public String toString() {
        return "MyConfigurationObj [restIp="
               + this.restIp
               + ", ipsList="
               + this.ipsList
               + ", mapTest="
               + this.mapTest
               + ", sub="
               + this.sub
               + "]";
    }


}
