package com.app.entities;

import java.time.LocalDate;
import java.util.*;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import lombok.*;

@Entity
@Setter
@Getter
public class Seller extends BaseEntity {
	
	@Column(nullable = false, unique = true)
	private long phone;
	
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false, unique = true)
	private String email;
	
	@Column(nullable = false)
	@Min(8)
	@Max(30)
	private String password;
	
	@OneToMany(mappedBy = "sellerId")
	private List<Product> products = new ArrayList<>();
	
	public Seller(long phone,String name, String email, String pswd) {
		this.phone = phone;
		this.name = name;
		this.email = email;
		this.password = pswd;
	}
	
	@Override
	public String toString() {
		return "Seller: "+super.getId()+"   "+name+"   "+email+"   "+phone+" \n";
	}
}

