package com.example.Day2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class ProductDao {
	
@Autowired
ProductRepository pr;

	public String sending(Product p) {
		
		pr.save(p);
		return "successfully sended";
	}

	public String bulk(List<Product> p) {
		// TODO Auto-generated method stub
		pr.saveAll(p);
		return "All are Succeeded";
	}

	public String deletById(int a) {
		// TODO Auto-generated method stub
		pr.deleteById(a);
		return "Successfully deleted";
	}

	

	public String putTheValue(Product p) {
		// TODO Auto-generated method stub
		pr.save(p);
		return "A value been added";
	}

	public String deleteTheValue() {
		// TODO Auto-generated method stub
		pr.deleteAll();
		return "All are deleted";
	}

	public String bulking(List<Product> p) {
		// TODO Auto-generated method stub
		pr.saveAll(p);
		return "All are added";
	}

	public Product finding(int a) {
		// TODO Auto-generated method stub
		return pr.findById(a).get();
		
	}

	/*public String deleteById(int a) {
		// TODO Auto-generated method stub
		return null;
	}
	*/

}
