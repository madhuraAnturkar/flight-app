package com.app.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/*
 * flight_id     | int         | NO   | PRI | NULL    | auto_increment |
| from_location | varchar(45) | NO   |     | NULL    |                |
| to_location   | varchar(45) | NO   |     | NULL    |                |
| capacity      | int         | NO   |     | NULL    |
 */
@Entity
@Table(name = "flight")
@Setter
@Getter
@ToString
public class Flight extends BaseEntity {
	@Column(name = "from_location")
	private String departureCity;
	@Column(name = "to_location")
	private String arrivalCity;
	private int capacity;
}
