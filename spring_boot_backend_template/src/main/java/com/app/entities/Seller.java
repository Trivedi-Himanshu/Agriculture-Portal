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
@NoArgsConstructor
public class Seller {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;
	
	@Column(nullable = false, unique = true)
	private long phone;
	
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false, unique = true)
	private String email;
	
	@Column(nullable = false)
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
		return "Seller: "+id+"   "+name+"   "+email+"   "+phone+" \n";
	}
}

