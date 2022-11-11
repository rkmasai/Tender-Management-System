package com.project.model;

public class Vandor {
	
	private int id;
	private String name;
	private String address;
	private String email;
	private String password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Vandor(String name, String address, String email, String password) {
		super();
		this.name = name;
		this.address = address;
		this.email = email;
		this.password = password;
	}
	public Vandor() {
		super();
	}
	
	
	
	

}
