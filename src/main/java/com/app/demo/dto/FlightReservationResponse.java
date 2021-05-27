package com.app.demo.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class FlightReservationResponse {
	private Integer reservationId;
	private int noOfPassengers;
	private int totalFare;
}
