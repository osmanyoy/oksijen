package com.kkb.spring.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CustomerCredential {

    @Id
    @GeneratedValue
    private long   ccId;

    @Column(unique = true)
    private String username;
    private String password;

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


}
