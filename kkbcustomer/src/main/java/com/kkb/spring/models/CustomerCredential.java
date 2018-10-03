package com.kkb.spring.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import com.kkb.spring.jpa.PasswordConverter;

@Entity
public class CustomerCredential {

    @Id
    @GeneratedValue
    private long     ccId;

    @Column(unique = true)
    @NotNull
    private String   username;
    @NotNull
    @Convert(converter = PasswordConverter.class)
    private String   password;

    private String   role;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @MapsId
    private Customer customer;

    public long getCcId() {
        return this.ccId;
    }

    public void setCcId(final long ccIdParam) {
        this.ccId = ccIdParam;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(final String usernameParam) {
        this.username = usernameParam;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(final String passwordParam) {
        this.password = passwordParam;
    }

    public String getRole() {
        return this.role;
    }

    public void setRole(final String roleParam) {
        this.role = roleParam;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public void setCustomer(final Customer customerParam) {
        this.customer = customerParam;
    }


}
