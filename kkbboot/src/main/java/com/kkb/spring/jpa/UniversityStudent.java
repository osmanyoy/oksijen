package com.kkb.spring.jpa;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("university")
public class UniversityStudent extends StudentExtra {

    private String universityName;
    private String test1;


    public String getUniversityName() {
        return this.universityName;
    }


    public void setUniversityName(final String universityNameParam) {
        this.universityName = universityNameParam;
    }


    public String getTest1() {
        return this.test1;
    }


    public void setTest1(final String test1Param) {
        this.test1 = test1Param;
    }

}
