package com.app.entities;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.*;

import lombok.*;

@Entity
@Getter
@Setter
public class Customer extends BaseEntity{
	
	
	@OneToMany(mappedBy = "customer_id",cascade = CascadeType.ALL)
	private Address address;
	
	@OneToMany(mappedBy = "customer_id",cascade = CascadeType.ALL)
	private Feedback feedback;
	
	@OneToMany(mappedBy = "customer_id",cascade = CascadeType.ALL)
	private Order orders;
	
	@OneToMany(mappedBy = "customer_id",cascade = CascadeType.ALL)
	private List<Payment> payments;
	
	private String name;
	
	@Column(nullable = false)
	private String email;
	
	@Column(nullable = false)
	private String pswd;
	
	@Column(nullable = false)
	private long phone;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "create_date", insertable = true, updatable = false)
	private LocalDate createDate;
	
	@Column(nullable = false)
	private String gender;
	
	public Customer(String name, String email, String pswd, long phone, String gender, String city, String state, String zip, String country) {
		this.name = name;
		this.email = email;
		this.pswd = pswd;
		this.phone = phone;
		this.gender = gender;
		createDate = LocalDate.now();
		this.address.setCity(city);
		this.address.setState(state);
		this.address.setZip(zip);
		this.address.setCountry(country);
	}
	
	public String toString() {
		return "Customer: "+super.getId()+"   "+name+"   "+email+"   "+phone+"   "+gender+"   "+createDate+"   "+address.toString()+" \n";
	}
}
