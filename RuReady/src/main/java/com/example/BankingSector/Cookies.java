package com.example.BankingSector;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Datas")
public class Cookies {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private String brand;
	private String type;
	private int price;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Cookies(String brand, String type, int price) {
		super();
		this.brand = brand;
		this.type = type;
		this.price = price;
	}
	
	
	
	
	
	

}
