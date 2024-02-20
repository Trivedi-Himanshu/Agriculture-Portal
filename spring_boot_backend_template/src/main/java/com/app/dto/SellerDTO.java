package com.app.dto;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import com.app.entities.Product;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
public class SellerDTO {
	
	//seller
	private long phone;
	
	
	private String name;
	
	
	private String email;
	
	
	private String password;
	
	private String Pname;
	
	//product
	private String brand;
	
	private double price;
	
	private String desc;
	
	//category
	private String catName;
	
//	private List<Product> products = new ArrayList<>();
}
