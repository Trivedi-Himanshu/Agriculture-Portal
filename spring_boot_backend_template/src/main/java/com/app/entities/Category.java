package com.app.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Category{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;
	
	
	//	SEED, MACHINARY, FERTILIZERS, CROPS, FLOWERS
	@Column(name = "Category_name", nullable = false, unique = true)
	private String catName; 

	@OneToMany(mappedBy = "categoryId")
	private List<Product> products = new ArrayList<>();
}
