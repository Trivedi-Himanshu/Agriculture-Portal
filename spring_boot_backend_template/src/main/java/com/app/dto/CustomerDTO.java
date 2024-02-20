package com.app.dto;

import java.time.LocalDate;

import com.app.entities.Address;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class CustomerDTO {

	//customer
	
	 String name;

	 String email;
	
	 String password;

	 long phone;
	
	 LocalDate createDate;
	
	 String gender;
	
	public CustomerDTO(String name,String email,String gender,long phone) {
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.phone = phone;
	}
}
