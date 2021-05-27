package com.app.demo.service;

import com.app.demo.dto.AuthenticationResponse;
import com.app.demo.dto.LoginRequest;
import com.app.demo.entities.Flight;
import com.app.demo.entities.FlightSchedule;

public interface IAdminService {
	AuthenticationResponse authenticateAdmin(LoginRequest request);
	
	Flight addFlight(Flight newFlight);

	FlightSchedule addFlightSchedule(FlightSchedule schedule);
}
