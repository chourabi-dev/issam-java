package com.issamapp.controllers.models;

public class CreateAccountModel {
	
	private String fullname;
	private String email;
	
	
	
	public String getFullname() {
		return fullname;
	}
	public String getEmail() {
		return email;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public CreateAccountModel(String fullname, String email) {
		super();
		this.fullname = fullname;
		this.email = email;
	}
	public CreateAccountModel() {
		super();
	}
	
	
		

}
