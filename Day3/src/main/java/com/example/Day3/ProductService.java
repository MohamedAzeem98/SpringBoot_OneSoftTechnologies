package com.example.Day3;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ProductService {
	@Autowired ProductDao pd;

	public String show(List<Product> p) {
		// TODO Auto-generated method stub
		return pd.show(p);
	}

	public List<Product> getting() {
		// TODO Auto-generated method stub
		return pd.getting();
	}

}
