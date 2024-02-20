package com.app.dto;

import java.time.LocalDate;

import com.app.entities.Customer;
import com.app.entities.Product;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
public class FeedbackDTO {

	private Customer customerId;
	
	private Product productId;
	
	private int rating;
	
	private String message;
	
}
