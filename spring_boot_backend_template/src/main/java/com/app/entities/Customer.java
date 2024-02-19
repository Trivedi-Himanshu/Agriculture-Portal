package com.app.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import lombok.*;

@Entity
@Getter
@Setter
public class Customer extends BaseEntity{
	
	
	@OneToMany(mappedBy = "customerId", cascade = CascadeType.ALL)
	private List<Address> address;
	
	@OneToMany(mappedBy = "customerId",cascade = CascadeType.ALL)
	private List<Feedback> feedbacks = new ArrayList<>();
	
	@OneToMany(mappedBy = "customerId",cascade = CascadeType.ALL)
	private List<OrderDetail> orders = new ArrayList<>();
	
	@OneToMany(mappedBy = "customerId",cascade = CascadeType.ALL)
	private List<Payment> payments = new ArrayList<>();
	
	private String name;
	
	//hi this is to be deleted line 
	@Column(nullable = false)
	private String email;
	
	@Column(nullable = false)
	@Min(8)
	@Max(30)
	private String password;
	
	@Column(nullable = false)
	private long phone;
	
	@Column(name = "create_date", insertable = true, updatable = false)
	private LocalDate createDate;
	
	@Column(nullable = false)
	private String gender;
	
	public Customer(String name, String email, String pswd, long phone, String gender) {
		this.name = name;
		this.email = email;
		this.password = pswd;
		this.phone = phone;
		this.gender = gender;
		createDate = LocalDate.now();
	}
	
	public String toString() {
		return "Customer: "+super.getId()+"   "+name+"   "+email+"   "+phone+"   "+gender+"   "+createDate+"   "+address.toString()+" \n"; //here we can write only address instead of address.toString()
	}
}



//to be applied on password in dto
//@Column(length = 20,nullable = false)
//@Pattern(regexp="((?=.*\\d)(?=.*[a-z])(?=.*[#@$*]).{5,20})")
