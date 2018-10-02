package com.kkb.spring.web;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import org.springframework.core.annotation.Order;

@WebFilter("/servlet")
@Order(1)
public class MyFilter implements Filter {

    @Override
    public void init(final FilterConfig filterConfigParam) throws ServletException {

    }

    @Override
    public void doFilter(final ServletRequest requestParam,
                         final ServletResponse responseParam,
                         final FilterChain chainParam) throws IOException, ServletException {
        System.out.println("MyFilter is here");
        responseParam.getOutputStream()
                     .println("Error olustu");
        //        chainParam.doFilter(requestParam,
        //                            responseParam);
    }

    @Override
    public void destroy() {
        // TODO Auto-generated method stub

    }

}
