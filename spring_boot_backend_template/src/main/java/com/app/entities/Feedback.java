package com.app.entities;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import lombok.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Feedback{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name = "customer_id")
	private Customer customerId;
	
	@ManyToOne
	@JoinColumn(name = "product_id")
	private Product productId;
	
	@Max(5)
	@Min(1)
	private int rating;
	
	private String message;
	//email and name we will get from customers pojo
	
	public Feedback(Customer customer, int rating, String message) {
		this.customerId = customer;
		this.rating = rating;
		this.message = message;
	}
	
	@Override
	public String toString() {
		return "Rating: "+this.rating+"\nFeedback: "+this.message+"\n";
	}
}
