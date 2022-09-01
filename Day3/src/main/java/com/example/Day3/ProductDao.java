package com.example.Day3;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDao {
	@Autowired ProductRepository pr;
	public String show(List<Product>p) {
		pr.saveAll(p);
		return "Succeed";
	}
	public List<Product> getting() {
		// TODO Auto-generated method stub
		
		return pr.findAll();
	}
}

