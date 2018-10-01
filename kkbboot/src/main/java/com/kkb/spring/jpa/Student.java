package com.kkb.spring.jpa;

import javax.persistence.AttributeOverride;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;
import javax.persistence.PostLoad;
import javax.persistence.PostPersist;
import javax.persistence.PostRemove;
import javax.persistence.PostUpdate;
import javax.persistence.PrePersist;
import javax.persistence.PreRemove;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Version;
import javax.validation.constraints.NotEmpty;


@Table(name = "ogrenci",
       indexes = {
                   @Index(columnList = "name,surname", name = "name_surname_index")
       })
@MappedSuperclass
public abstract class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long     stId;

    @NotEmpty
    @Column(length = 25, nullable = false)
    private String   name;
    private String   surname;

    @Embedded
    @AttributeOverride(column = @Column(name = "mysehir", length = 20), name = "city")
    private Address  addr;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(nullable = true)
    private Identity identity;

    @Version
    private int      versiyon;

    @PrePersist
    @PreUpdate
    @PreRemove
    public void before() {
    }

    @PostPersist
    @PostUpdate
    @PostRemove
    @PostLoad
    public void after() {

    }

    public long getStId() {
        return this.stId;
    }

    public void setStId(final long stIdParam) {
        this.stId = stIdParam;
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

    public Address getAddr() {
        return this.addr;
    }

    public void setAddr(final Address addrParam) {
        this.addr = addrParam;
    }

    public int getVersiyon() {
        return this.versiyon;
    }

    public void setVersiyon(final int versiyonParam) {
        this.versiyon = versiyonParam;
    }


}
