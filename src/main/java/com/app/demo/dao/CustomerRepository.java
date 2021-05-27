package com.app.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.demo.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
