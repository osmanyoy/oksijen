package com.kkb.spring.formatters;

import com.kkb.spring.models.Customer;

public class CustomerFormatter2 implements ICustomerFormatter {

    @Override
    public String format(final Customer customerParam) {
        return customerParam.getName() + "-name," + customerParam.getSurname() + "-surname," + customerParam.getAge() + "-age";
    }

}
