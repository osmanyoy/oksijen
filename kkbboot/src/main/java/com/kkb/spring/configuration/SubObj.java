package com.kkb.spring.configuration;


public class SubObj {

    private String     name;
    private String     desc;
    private ThirdLevel tl;

    public String getName() {
        return this.name;
    }

    public void setName(final String nameParam) {
        this.name = nameParam;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(final String descParam) {
        this.desc = descParam;
    }

    public ThirdLevel getTl() {
        return this.tl;
    }

    public void setTl(final ThirdLevel tlParam) {
        this.tl = tlParam;
    }

    @Override
    public String toString() {
        return "SubObj [name=" + this.name + ", desc=" + this.desc + ", tl=" + this.tl + "]";
    }


}
