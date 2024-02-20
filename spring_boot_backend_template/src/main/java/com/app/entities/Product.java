package com.app.entities;

import java.time.LocalDate;

import javax.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Setter
@Getter
@NoArgsConstructor
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;
	
	@Column(nullable = false)
	private String pName;
//	
//	@Column(nullable = false)
//	private String brand;
//	
	//@Enumerated(EnumType.STRING) -- (now its an tables)
	@ManyToOne
	@JoinColumn(name = "category_id")
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
	private OrderDetail orderId;
	
	@ManyToOne
	@JoinColumn(name = "seller_id")
	private Seller sellerId;
	
	public Product(String name,String brand,double price) {
		this.pName = name;
//		this.brand = brand;
		this.price = price;
		manufacteDate = LocalDate.now();
	}
	
	@Override
	public String toString() {
		return " Product: "+pName+"   "+""+"   "+categoryId.getCatName()+"   "+price+"   "+manufacteDate+"\n";
	}
}
