package com.app.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.demo.dto.AuthenticationResponse;
import com.app.demo.dto.LoginRequest;
import com.app.demo.entities.Flight;
import com.app.demo.entities.FlightSchedule;
import com.app.demo.service.IAdminService;

@RestController
@RequestMapping("/api/admin")
public class AdminController {
	// dependency
	@Autowired
	private IAdminService adminService;

	//api end point for admin authentication 
	@PostMapping("/auth")
	public ResponseEntity<AuthenticationResponse>authenticateAdmin(@RequestBody LoginRequest request) {
		System.out.println("in admin auth " + request);
		return ResponseEntity.ok(adminService.authenticateAdmin(request));

	}
	//api end point for adding a flight
	@PostMapping("/flights")
	public ResponseEntity<?> addFlight(@RequestBody Flight newFlight)
	{
		System.out.println("admin add flight");
		return ResponseEntity.ok(adminService.addFlight(newFlight));
	}
	
	//api end point for adding a flight schedule
		@PostMapping("/flight-schedules")
		public ResponseEntity<?> addFlightSchedule(@RequestBody FlightSchedule newFlightSchedule)
		{
			System.out.println("admin add flight schedule");
			return ResponseEntity.ok(adminService.addFlightSchedule(newFlightSchedule));
		}
	
	
	

}
