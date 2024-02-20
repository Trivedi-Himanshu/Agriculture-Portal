package com.app.dto;

import java.time.LocalDate;

import com.app.entities.Customer;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PaymentDTO {
	
	private Customer customerId;
	
	private String cardName;
	
	private long cardNo;
	
	private double amount;
	
	private LocalDate paymentDate;
}
