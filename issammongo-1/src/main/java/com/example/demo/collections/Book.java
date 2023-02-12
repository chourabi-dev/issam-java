package com.example.demo.collections;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document( collection="books" )
public class Book {
	
	
	@Id
	private String id;
	
	 
	private String name;
	private String category;
	private String auth;
	private int pages;
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getAuth() {
		return auth;
	}
	public void setAuth(String auth) {
		this.auth = auth;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public Book(String id, String name, String category, String auth, int pages) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.auth = auth;
		this.pages = pages;
	}
	public Book() {
		super();
	}
	
	

}
