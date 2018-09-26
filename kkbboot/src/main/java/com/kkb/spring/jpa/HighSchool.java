package com.kkb.spring.jpa;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("HighSchool")
public class HighSchool extends StudentExtra {

    private String highSchoolName;
    private String highSchoolAddr;


    public String getHighSchoolName() {
        return this.highSchoolName;
    }


    public void setHighSchoolName(final String highSchoolNameParam) {
        this.highSchoolName = highSchoolNameParam;
    }


    public String getHighSchoolAddr() {
        return this.highSchoolAddr;
    }


    public void setHighSchoolAddr(final String highSchoolAddrParam) {
        this.highSchoolAddr = highSchoolAddrParam;
    }

}
