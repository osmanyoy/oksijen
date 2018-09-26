package com.kkb.spring.models;


public class Customer {

    private long   id;
    private String name;
    private String surname;
    private int    age;

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


}
