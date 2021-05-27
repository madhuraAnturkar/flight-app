package com.app.demo.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.demo.custom_exception.AuthenticationFailedException;
import com.app.demo.dao.AdminRepository;
import com.app.demo.dao.FlightRepository;
import com.app.demo.dao.FlightScheduleRepository;
import com.app.demo.dto.AuthenticationResponse;
import com.app.demo.dto.LoginRequest;
import com.app.demo.entities.Flight;
import com.app.demo.entities.FlightSchedule;

@Service
@Transactional
public class AdminServiceImpl implements IAdminService {
	// dependency
	@Autowired
	private FlightRepository flightRepo;

	@Autowired
	private AdminRepository adminRepo;

	@Override
	public AuthenticationResponse authenticateAdmin(LoginRequest request) {
		// TODO Auto-generated method stub
		adminRepo.findByEmailAndPassword(request.getEmail(), request.getPassword())
				.orElseThrow(() -> new AuthenticationFailedException("Admin Authentication failed!!!!"));
		return new AuthenticationResponse("Admin Authenticated.....");
	}

	@Autowired
	private FlightScheduleRepository flightScheduleRepo;

	@Override
	public Flight addFlight(Flight newFlight) {

		return flightRepo.save(newFlight);
	}

	@Override
	public FlightSchedule addFlightSchedule(FlightSchedule schedule) {
		// since it's uni dir asso from FlightSchedule ----> Flight , no need of reverse
		// mapping
		return flightScheduleRepo.save(schedule);
	}

}
