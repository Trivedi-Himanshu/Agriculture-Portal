package com.app.dto;

import com.app.entities.OrderInfo;
import com.app.entities.Product;

import lombok.*;

@Getter
@Setter
@ToString
public class OrderItemDTO {
	
	private OrderInfo orderId;
	
	private Product productId;
	
	private int quantity;
	
	private double price;
}
