package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.Address;
import com.app.entities.Seller;
import java.lang.String;
import java.util.List;

public interface SellerDao extends JpaRepository<Seller, Integer>{
	Seller findByEmail(String email);
	Seller findByPhone(long phone);
}
