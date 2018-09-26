package com.kkb.spring.jpa;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Identity {

    @Id
    @GeneratedValue
    private long    identId;
    private String  number;

    @Transient
    private String  str;

    @JsonIgnore
    @XmlTransient
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @MapsId
    private Student student;

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

    public Student getStudent() {
        return this.student;
    }

    public void setStudent(final Student studentParam) {
        this.student = studentParam;
    }

    public String getStr() {
        return this.str;
    }

    public void setStr(final String strParam) {
        this.str = strParam;
    }

}
