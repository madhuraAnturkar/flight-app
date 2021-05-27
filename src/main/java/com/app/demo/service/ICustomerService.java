package com.app.demo.service;

import com.app.demo.dto.FlightReservationResponse;
import com.app.demo.dto.LoginRequest;
import com.app.demo.dto.SearchFlightRequest;
import com.app.demo.dto.SearchFlightResponse;
import com.app.demo.entities.Customer;
import com.app.demo.entities.FlightReservation;

public interface ICustomerService {
	Customer registerCustomer(Customer newCustomer);
	Customer authenticateCustomer(LoginRequest request);
	SearchFlightResponse searchFlights(SearchFlightRequest request);
	FlightReservationResponse reserveFlight(FlightReservation reservation);
	
}
