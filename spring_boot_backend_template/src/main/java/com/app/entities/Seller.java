package com.app.entities;

import java.time.LocalDate;

import javax.persistence.*;

import lombok.*;

@Entity
@Setter
@Getter
public class Seller extends BaseEntity {
	
	@Column(nullable = false)
	private long phone;
	
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false)
	private String email;
	
	@Column(nullable = false)
	private String password;
	
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
