package com.app.entities;

import java.time.LocalDate;

import javax.persistence.*;

import lombok.*;

@Entity
@Getter
@Setter
public class Payment extends BaseEntity{
	
	@ManyToOne
	@JoinColumn(name = "customer_id")
	private Customer customerId;
	
	@Column(name="card_name")
	private String cardName;
	
	@Column(name = "card_no", unique = true)
	private long cardNo;
	private double amount;
	
	@Column(name = "payment_date")
	private LocalDate paymentDate;
	
	public Payment(String nameOnCard,long cardNo,double amount) {
		this.cardName = nameOnCard;
		this.cardNo = cardNo;
		this.amount = amount;
		this.paymentDate = LocalDate.now();
	}
	
	@Override
	public String toString() {
		return "Payment details: "+ cardName+"   "+cardNo+"   "+amount+"   "+paymentDate+"\n";
	}
}

