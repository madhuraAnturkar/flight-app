package com.app.demo.entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "passenger")
@Getter
@Setter
@ToString
/*
 * id | int | NO | PRI | NULL | auto_increment | | reservation_id | int | NO |
 * MUL | NULL | | | first_name | varchar(45) | YES | | NULL | | | last_name |
 * varchar(45) | YES | | NULL | | +
 */
public class Passenger extends BaseEntity {
	private String firstName;
	private String lastName;
	//Under single reservation , there can be multiple passengers
	//BUT for single passenger_id ----there can be only single reservation id
	@ManyToOne
	@JoinColumn(name = "reservation_id")
	private FlightReservation reservation;
}
