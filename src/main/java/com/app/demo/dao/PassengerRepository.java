package com.app.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.demo.entities.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Integer> {

}
