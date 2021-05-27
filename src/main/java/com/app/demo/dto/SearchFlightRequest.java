package com.app.demo.dto;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class SearchFlightRequest {
	private String departureCity;
	private String arrivalCity;
	private LocalDate departureDate;
}
