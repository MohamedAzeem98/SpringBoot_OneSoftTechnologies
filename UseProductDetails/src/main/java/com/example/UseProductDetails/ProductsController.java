package com.example.UseProductDetails;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController

public class ProductsController {
	@Autowired 
	RestTemplate restTemplate ;
	
	@GetMapping(value="/showWithTax")
	
	public List<ProductEntity>getInfo(){
		String url1="http://localhost:8081/product/getting";
		String url2="http://localhost:8082/tax/crossCheck/";
				
ResponseEntity<List<ProductEntity>>response1=restTemplate.exchange(url1,HttpMethod.GET,null,new ParameterizedTypeReference<List<ProductEntity>>(){});
	List<ProductEntity>products=response1.getBody();
	
	products.forEach((x)->{
		int hnt=x.getHnt();
		
ResponseEntity<Integer>response2=restTemplate.exchange(url2+hnt,HttpMethod.GET,null,Integer.class);
		
	Integer percentage=response2.getBody();
	   x.setPrice(x.getPrice()+(x.getPrice()+percentage/100));
	});
	return products;
	}

}
