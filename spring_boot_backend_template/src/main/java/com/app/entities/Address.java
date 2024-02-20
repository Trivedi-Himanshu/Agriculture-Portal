package com.app.entities;

import javax.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Address{
	
	
	private String city;
	
	private String state;
	
	@Id
	@ManyToOne
	@JoinColumn(name = "customer_id", referencedColumnName = "id")
	private Customer customerId;
	
//	@Id
//	@ManyToOne
//	@JoinColumn(name = "customer_id")
//	private Customer customerId;
	
	@Column(nullable = false)
	private String zip;
	
	private String country;
	
	
	public Address(Customer cust,String city, String state, String zip, String country){
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



