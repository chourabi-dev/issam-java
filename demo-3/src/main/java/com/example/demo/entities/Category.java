package com.example.demo.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table( name="categories" )
public class Category {

	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	private long id;
	
	@Column( name="name", nullable=false )
	private String name;
	
	
	@OneToMany( mappedBy="categoy" )
	private List<Product> products;
	
	
	
	

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Category() {
		super();
	}
	
	
	
}
