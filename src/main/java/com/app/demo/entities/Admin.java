package com.app.demo.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "admin")
@Setter
@Getter
@ToString
public class Admin {
	@Id //user assigned id
	private String email;
	private String password;
}
