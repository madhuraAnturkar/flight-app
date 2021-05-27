package com.app.demo.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.demo.entities.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer> {
//finder method typical pattern : email n password are Admin POJO properties
	Optional<Admin> findByEmailAndPassword(String email,String pwd);
}
