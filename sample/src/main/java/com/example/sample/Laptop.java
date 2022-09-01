package com.example.sample;

public class Laptop {
	private String brand;
	private int price;
	//private boolean isBrand;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	public String toString() {
		return "BRAND : "+brand+", "+"PRICE : "+price;
	}

}
