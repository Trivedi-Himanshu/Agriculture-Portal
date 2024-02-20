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
public class OrderInfo{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name = "customer_id")
	private Customer customerId;
	
	@OneToMany(mappedBy = "orderInfoId",cascade = CascadeType.ALL)
	private List<OrderItem> orderItmes = new ArrayList<>();
	
	@Column(name = "order_date")
	private LocalDate orderDate;
	
	@DecimalMin(value = "0.00")
	private double totalAmount;
	
	public OrderInfo(int custId) {
		orderDate = LocalDate.now();
		
	}
	
	
	//helper methods
//	public boolean addOrderItem(order p) {
//		boolean flag = false;
//		products.add(p);
//		payment = p.getPrice()*quantity;
//		flag = true;
//		return flag;
//	}
//	
//	public boolean removeProduct(Product p) {
//		boolean flag = false;
//		products.remove(p);
//		flag = true;
//		return flag;
//	}
	
	@Override
	public String toString() {
		return "orderInfo: " + this.id+"   "+this.customerId+"    "+this.totalAmount+"\n";
	}
}

