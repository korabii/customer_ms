package com.example.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
