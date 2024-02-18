package com.app.entities;

import javax.management.ConstructorParameters;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Address{
	
	private String city;
	
	private String state;
	
	private String zip;
	
	private String country;
	
	@ManyToOne//(fetch=FetchType.LAZY) its by default
	@JoinColumn(name = "customer_id")
	@MapsId         
	private  Customer customer;
	
	public Address(String city, String state, String zip, String country){
		this.state = state;
		this.city = city;
		this.country = country;
		this.zip = zip;
	}
	
	@Override
	public String toString() {
		return "Address: "+city+"   "+state+"   "+country+"   "+zip+"  \n";
	}
}
