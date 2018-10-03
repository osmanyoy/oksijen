package com.kkb.spring.repository;

import java.util.List;
import java.util.Optional;

import com.kkb.spring.models.Customer;

public class Test {

    static ICustomerRepo customerRepo;

    public static void main(final String[] args) {
        Optional<List<Customer>> sc = Test.customerRepo.selectCustomerByUsername2("asd");
        //        sc.ifPresent(t -> {
        //            t.stream().forEach(z -> {
        //
        //            }))
        //        });
    }


}
