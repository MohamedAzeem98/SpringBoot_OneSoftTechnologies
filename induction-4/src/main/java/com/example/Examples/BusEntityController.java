package com.example.Examples;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;



@RestController
public class BusEntityController {
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping(value="commonterms")
	
	public List<busentity>getDis(){
		String url1="http://localhost:8081/showings";
		String url2="http://localhost:8082/watching";
	
	
	ResponseEntity<List<busentity>>response1=restTemplate.exchange(url1,HttpMethod.GET,null,new ParameterizedTypeReference<List<busentity>>(){});
	List<busentity>b1=response1.getBody();
	
	b1.forEach((y)->{
		String arrival=y.getArrival();
	
	ResponseEntity<String>response2=restTemplate.exchange(url2+arrival,HttpMethod.GET,null,String.class );
	
	String b2=response2.getBody();
	     y.setArrival(y.getArrival());
	
	
	});
	return b1;
	
	
	}
}
