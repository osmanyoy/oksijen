package com.kkb.spring.rest;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kkb.spring.models.Customer;
import com.kkb.spring.services.CustomerManager;

@RestController
@RequestMapping(path = "/customer/api/v1")
public class CustomerRest {

    @Autowired
    private CustomerManager customerManager;


    @GetMapping("/all")
    public Collection<Customer> allCustomers() {
        return this.customerManager.getAllCustomers();
    }


    @GetMapping("/get/{custId}")
    public String getCustomer(@PathVariable("custId") final long customerId) {
        return this.customerManager.formatCustomer(customerId);
    }

    @PostMapping("/add")
    public String addCustomer(@Validated @RequestBody final Customer customerParam) {
        customerParam.getCredential()
                     .setCustomer(customerParam);
        this.customerManager.addCustomer(customerParam);
        return "OK";
    }

}
