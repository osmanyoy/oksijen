package com.kkb.spring;

import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class MyTestBean implements BeanNameAware, BeanClassLoaderAware {

    @Autowired
    private Environment env;

    public int readIndex() {
        return Integer.parseInt(this.env.getProperty("my.execute.index"));
    }

    @Override
    public void setBeanName(final String nameParam) {

    }

    @Override
    public void setBeanClassLoader(final ClassLoader classLoaderParam) {

    }
}
