package com.example.Bank;



public class Customer {
	private String name;
	private String location;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Customer(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", location=" + location + "]";
	}
	

}
