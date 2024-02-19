package com.app.entities;

import java.time.LocalDate;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;


@Entity
@Setter
@Getter
public class Product extends BaseEntity {
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false)
	private String brand;
	
	//@Enumerated(EnumType.STRING) -- (now its an tables)
	@ManyToOne
	@Column(name = "category_id")
	private Category categoryId;
	
	@Column(nullable = false)
	private double price;
	
	@Lob
	private Byte[] image;
	
	@Column(name = "manf_date", insertable = true, updatable = false)
	private LocalDate manufacteDate;
	
	private String description;
	
	@ManyToOne
	@JoinColumn(name = "order_id")
	private Order_detail orderId;
	
	@ManyToOne
	@JoinColumn(name = "seller_id")
	private Seller sellerId;
	
	public Product(String name,String brand,double price) {
		this.name = name;
		this.brand = brand;
		this.price = price;
		manufacteDate = LocalDate.now();
	}
	
	@Override
	public String toString() {
		return " Product: "+name+"   "+brand+"   "+categoryId.getName()+"   "+price+"   "+manufacteDate+"\n";
	}
}
