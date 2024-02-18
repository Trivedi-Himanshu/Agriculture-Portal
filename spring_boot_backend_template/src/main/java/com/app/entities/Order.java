package com.app.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

import lombok.*;

@Entity
@Setter
@Getter
public class Order extends BaseEntity{
	
	@ManyToOne
	@JoinColumn(name = "customer_id")
	private Customer customer;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "order_id")
	private List<Product> products;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "order_date")
	private LocalDate orderDate;
	
	private double payment;
	
	private int quantity;
	
	public Order(Customer customer, int quantity) {
		this.customer = customer;
		this.quantity = quantity;
		this.products = new ArrayList<>();
	}
	
	//helper methods
	public boolean addProduct(Product p) {
		boolean flag = false;
		products.add(p);
		payment = p.getPrice()*quantity;
		flag = true;
		return flag;
	}
	
	public boolean removeProduct(Product p) {
		boolean flag = false;
		products.remove(p);
		flag = true;
		return flag;
	}
	
	@Override
	public String toString() {
		return "Order Details: "+super.getId()+"   "+products+"   "+quantity+"   "+payment;
	}
}
