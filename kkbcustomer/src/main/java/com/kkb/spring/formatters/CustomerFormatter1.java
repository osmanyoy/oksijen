package com.kkb.spring.formatters;

import com.kkb.spring.models.Customer;

public class CustomerFormatter1 implements ICustomerFormatter {

    @Override
    public String format(final Customer customerParam) {
        return customerParam.getName() + "," + customerParam.getSurname() + "," + customerParam.getAge();
    }

}
