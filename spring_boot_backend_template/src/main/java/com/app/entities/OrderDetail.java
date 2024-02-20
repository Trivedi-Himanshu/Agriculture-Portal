package com.app.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.DecimalMin;

import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;

import lombok.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class OrderDetail{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name = "customer_id")
	private Customer customerId;
	
	@OneToMany(mappedBy = "orderId",cascade = CascadeType.ALL)
	private List<Product> products = new ArrayList<>();
	
	@Column(name = "order_date")
	private LocalDate orderDate;
	
	@DecimalMin(value = "0.00")
	private double payment;
	
	private int quantity;
	
	public OrderDetail(int quantity) {
		this.quantity = quantity;
		orderDate = LocalDate.now();
		
	}
	
	//how to find payment
//	public void paymentDetail() {
//		this.payment =
//	}
	
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
		return "orders: "+this.products+"    quantity: "+this.quantity+"   Amount: "+this.payment;
	}
}

