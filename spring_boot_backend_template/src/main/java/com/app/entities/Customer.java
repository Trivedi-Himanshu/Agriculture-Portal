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
@NoArgsConstructor        //--its used by ModelMapper internally therefore give noArgsConstructor
public class Customer{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;
	
	@OneToMany(mappedBy = "customerId", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private List<Address> address;
	
	@OneToMany(mappedBy = "customerId",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private List<Feedback> feedbacks = new ArrayList<>();
	
	@OneToMany(mappedBy = "customerId",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private List<OrderInfo> orders = new ArrayList<>();
	
	@OneToMany(mappedBy = "customerId",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private List<Payment> payments = new ArrayList<>();
	
	private String name;
	
	@Column(nullable = false)
	private String email;
	
	@Column(nullable = false)

	private String password;
	
	@Column(nullable = false)
	private long phone;
	
	@Column(name = "create_date")
	private LocalDate createDate;
	
	@Column(nullable = false)
	private String gender;
	
	public Customer(String name, String email, String pswd, long phone, String gender) {
		this.name = name;
		this.email = email;
		this.password = pswd;
		this.phone = phone;
		this.gender = gender;
		this.createDate = LocalDate.now();
	}
	
	public Customer(String name, LocalDate createDate, String email, String pswd, long phone, String gender) {
		this.name = name;
		this.email = email;
		this.password = pswd;
		this.phone = phone;
		this.gender = gender;
		this.createDate = createDate;
	}
	
	public String toString() {
		return "Customer: "+id+"   "+name+"   "+email+"   "+phone+"   "+gender+"   "+createDate+"   "+" \n"; //here we can write only address instead of address.toString()
	}
}



//to be applied on password in dto
//@Column(length = 20,nullable = false)
//@Pattern(regexp="((?=.*\\d)(?=.*[a-z])(?=.*[#@$*]).{5,20})")
