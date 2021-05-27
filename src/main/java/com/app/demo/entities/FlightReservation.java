package com.app.demo.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
/*
 * id                | int  | NO   | PRI | NULL    |                |
| customer_id       | int  | NO   | MUL | NULL    | auto_increment |
| schedule_id       | int  | NO   | MUL | NULL    |                |
| num_of_passengers | int  | NO   |     | NULL    |                |
| reservation_date  | date | NO   |     | NULL    |                |
| total_fare        | int  | YES  |     | NULL
 */

@Entity
@Table(name = "reservation")
@Getter
@Setter
@ToString
public class FlightReservation extends BaseEntity {
	@Column(name = "num_of_passengers")
	private int NoOfPassengers;
	private LocalDate reservationDate;
	private int totalFare;

	// 1 customer can create multiple reservations , BUT 1 reservation(id) can have
	// only 1 customer id
	@ManyToOne
	@JoinColumn(name = "customer_id")
	private Customer customer;

	// 1 flight schedule can have multiple reservations (for different passengers)
	// BUT for a single reservation (with unique reservation id) there will be 1
	// flight schedule
	@ManyToOne
	@JoinColumn(name = "schedule_id")
	private FlightSchedule schedule;
	// under single reservation , there can be multiple passengers travelling
	// bi dir association between Reservation 1 <----->* Passenger
	// mappedBy : to tell Hibernate about the owner of the association
	// it's value should be name of the property as it appears in the owning side
	// cascade = CascadeType.ALL => To enable cascading of all
	// operations(insert/update/delete from parent(Reservation) -->child(Passenger)
	// orphanRemoval = true => if the passenger is removed form the relationship i.e
	// list , hibernate should auto fire a delete query on passengers (child) table
	// , deleting the orphan record
	@OneToMany(mappedBy = "reservation", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Passenger> passengers = new ArrayList<>();

}
