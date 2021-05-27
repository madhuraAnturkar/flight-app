package com.app.demo.dto;

import java.util.List;

import com.app.demo.entities.FlightSchedule;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SearchFlightResponse {
	private List<FlightSchedule> schedules;
}
