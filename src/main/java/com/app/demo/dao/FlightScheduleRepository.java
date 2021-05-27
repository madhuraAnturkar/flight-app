package com.app.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.demo.entities.FlightSchedule;

public interface FlightScheduleRepository extends JpaRepository<FlightSchedule, Integer> {

}
