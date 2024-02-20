package com.app.dto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.DecimalMin;

import com.app.entities.Customer;
import com.app.entities.Product;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class OrderDetailsDTO {
	
	private Customer customerId;
	
//	private List<Product> products; ----(have to do something)
	
	private LocalDate orderDate;
	
	private double payment;
	
	private int quantity;
}
