package com.example.Day2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ProductService {
	
@Autowired
	ProductDao pd;

	public String sending(Product p) {
		return pd.sending(p);
	}

	public String bulk(List<Product> p) {
		// TODO Auto-generated method stub
		return  pd.bulk(p);
	}

	public String deleteById(int a) {
		// TODO Auto-generated method stub
		return pd.deletById(a);
	}

	

	public String putTheValue(Product p) {
		// TODO Auto-generated method stub
		return pd.putTheValue(p);
	}

	public String deleteTheValue() {
		// TODO Auto-generated method stub
		return pd.deleteTheValue();
	}

	public String bulking(List<Product> p) {
		// TODO Auto-generated method stub
		return pd.bulking(p);
	}

	public Product finding(int a) {
		// TODO Auto-generated method stub
		return pd.finding(a);
	}

}
