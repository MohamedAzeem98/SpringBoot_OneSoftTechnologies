package com.coderUlagam.helther;

import com.fasterxml.jackson.annotation.JacksonInject.Value;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="helthertable")
public class Healther {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	private int no;
	
	Healther(int id , String n,int o){
		this.id=id;
		this.name=n;
		this.no=o;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id= id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}
	
	
	
	
	
	
	
	

}
