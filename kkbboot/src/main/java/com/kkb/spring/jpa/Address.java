package com.kkb.spring.jpa;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {


    public Address() {
        // TODO Auto-generated constructor stub
    }

    public Address(final String cityParam,
                   final String streetParam) {
        super();
        this.city = cityParam;
        this.street = streetParam;
    }

    @Column(name = "sehir")
    private String city;
    private String street;

    public String getCity() {
        return this.city;
    }

    public void setCity(final String cityParam) {
        this.city = cityParam;
    }

    public String getStreet() {
        return this.street;
    }

    public void setStreet(final String streetParam) {
        this.street = streetParam;
    }


}
