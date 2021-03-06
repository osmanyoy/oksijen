package com.kkb.spring.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;


@Entity
public class Customer {

    @Id
    @GeneratedValue
    private long               id;
    private String             name;
    private String             surname;
    private int                age;

    @NotNull
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "customer")
    private CustomerCredential credential;

    public long getId() {
        return this.id;
    }

    public void setId(final long idParam) {
        this.id = idParam;
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String nameParam) {
        this.name = nameParam;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(final String surnameParam) {
        this.surname = surnameParam;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(final int ageParam) {
        this.age = ageParam;
    }

    public CustomerCredential getCredential() {
        return this.credential;
    }

    public void setCredential(final CustomerCredential credentialParam) {
        this.credential = credentialParam;
    }


}
