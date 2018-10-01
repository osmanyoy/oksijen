package com.kkb.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

// @Component
public class MyBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(final Object bean,
                                                  final String beanName) throws BeansException {
        System.out.println("beanName : " + beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(final Object bean,
                                                 final String beanName) throws BeansException {
        return bean;
    }

}
