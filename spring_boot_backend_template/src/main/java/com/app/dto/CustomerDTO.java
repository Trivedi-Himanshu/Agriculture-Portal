package com.app.dto;

import java.time.LocalDate;

import com.app.entities.Address;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CustomerDTO {

	//customer
	private String name;

	private String email;
	
	private String password;

	private long phone;
	
	private LocalDate createDate;
	
	private String gender;
	
	//address
	private String state;
	
	private String city;
	
	private String zip;
	
	private String country;
	
	//feedback
	private String message;
	
	private int rating;

	//payment
	private String cardName;
	
	private long cardNo;
	
	private double amount;
}
