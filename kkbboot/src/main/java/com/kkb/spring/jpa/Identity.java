package com.kkb.spring.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Identity {

    @Id
    @GeneratedValue
    private long   identId;
    private String number;

    @Transient
    private String str;


    public long getIdentId() {
        return this.identId;
    }

    public void setIdentId(final long identIdParam) {
        this.identId = identIdParam;
    }

    public String getNumber() {
        return this.number;
    }

    public void setNumber(final String numberParam) {
        this.number = numberParam;
    }

    public String getStr() {
        return this.str;
    }

    public void setStr(final String strParam) {
        this.str = strParam;
    }

}
