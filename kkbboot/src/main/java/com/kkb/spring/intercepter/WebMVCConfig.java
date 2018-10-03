package com.kkb.spring.intercepter;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Component
public class WebMVCConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(final InterceptorRegistry registryParam) {
        registryParam.addInterceptor(new MyIntercepter());
    }

}
