package com.app.demo.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/*
 *  sch_id         | int  | NO   | PRI | NULL    | auto_increment |
| flight_id      | int  | NO   | MUL | NULL    |                |
| departure_date | date | NO   |     | NULL    |                |
| arrival_date   | date | NO   |     | NULL    |                |
| fare           | int  | NO   |     | NULL
 */
@Entity
@Table(name = "schedule")
//@Getter
//@Setter
@ToString
public class FlightSchedule extends BaseEntity {
	private LocalDate departureDate;
	private LocalDate arrivalDate;
	private double fare;
	private int availableSeats;
	@ManyToOne
	@JoinColumn(name = " flight_id", nullable = false)
	@JsonIgnore
	private Flight flight;
	public LocalDate getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(LocalDate departureDate) {
		this.departureDate = departureDate;
	}
	public LocalDate getArrivalDate() {
		return arrivalDate;
	}
	public void setArrivalDate(LocalDate arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
	public double getFare() {
		return fare;
	}
	public void setFare(double fare) {
		this.fare = fare;
	}
	
	@JsonIgnore
	public Flight getFlight() {
		return flight;
	}
	@JsonProperty	
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	public int getAvailableSeats() {
		return availableSeats;
	}
	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}
	

}
