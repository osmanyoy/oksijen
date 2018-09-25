package com.kkb.spring.rest;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Employee {

    @XmlElement(name = "isim")
    @NotEmpty
    @Size(min = 2, max = 20, message = "2 den küçük 20 den büyük olamaz")
    private String name;

    private String surname;
    @Min(value = 10, message = "10 dan küçük olamaz")
    @Max(120)
    private int    age;

    private String phone;
    private String dep;

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

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(final String phoneParam) {
        this.phone = phoneParam;
    }

    public String getDep() {
        return this.dep;
    }

    public void setDep(final String depParam) {
        this.dep = depParam;
    }

}
