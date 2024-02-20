package com.app.dto;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.app.entities.Customer;

import lombok.*;

@Getter
@Setter
@ToString
public class AddressDTO {
	
	private Customer customerId;
	
	private String city;
	
	private String state;
	
	private String zip;
	
	private String country;
}
