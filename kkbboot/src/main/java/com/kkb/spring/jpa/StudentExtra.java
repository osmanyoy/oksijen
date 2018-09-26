package com.kkb.spring.jpa;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.LockModeType;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;


@NamedQueries({
                @NamedQuery(name = "StudentExtra.select1",
                            query = "select s from StudentExtra s",
                            lockMode = LockModeType.OPTIMISTIC_FORCE_INCREMENT)
})

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@DiscriminatorColumn(name = "studentType")
public class StudentExtra extends Student {

    private String extra1;
    private String extra2;

    public String getExtra1() {
        return this.extra1;
    }

    public void setExtra1(final String extra1Param) {
        this.extra1 = extra1Param;
    }

    public String getExtra2() {
        return this.extra2;
    }

    public void setExtra2(final String extra2Param) {
        this.extra2 = extra2Param;
    }

}
