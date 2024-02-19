package com.app.entities;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Address extends BaseEntity{
	
	private String city;
	
	private String state;
	
	@Column(nullable = false)
	private String zip;
	
	private String country;
	
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



