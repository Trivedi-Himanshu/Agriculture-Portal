package com.app.entities;

import javax.persistence.*;
import javax.validation.constraints.DecimalMin;

import lombok.*;

@Entity
@Getter
@Setter
@ToString(exclude = {"orderId","productId"})
@NoArgsConstructor
public class OrderItem {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name = "order_id")
	private OrderInfo orderInfoId;
	
	@ManyToOne
	private Product productId;
	
	private int quantity;
	
	@DecimalMin (value = "0.00", message= "price must be non-negative")
	private double price;
	
	public OrderItem(int qty) {
		this.quantity = qty;
	}

}
