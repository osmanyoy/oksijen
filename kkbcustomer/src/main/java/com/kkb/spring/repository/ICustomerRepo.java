package com.kkb.spring.repository;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.Future;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.scheduling.annotation.Async;

import com.kkb.spring.models.Customer;

public interface ICustomerRepo extends CrudRepository<Customer, Long> {

    @Async
    @Query("select c from Customer c, CustomerCredential m where m.username= :user")
    Future<List<Customer>> selectCustomerByUsername(@Param("user") String user);

    @Query("select c from Customer c, CustomerCredential m where m.username= :user")
    Optional<List<Customer>> selectCustomerByUsername2(@Param("user") String user);


}
