package com.example.sample;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/Greek")
public class Strining {
	
	@GetMapping(value="/myDetail")
	public String myDetail(@PathParam(value=" ")String name,@PathParam(value=" ")String degree){
		return "NAME : "+name+" "+"DEGREE : "+degree;
	}
	
	@GetMapping(value="/evenOrOdd/{a}")
	public String evenOrOdd(@PathVariable int a) {
		if(a%2==0) {
			return "EVEN NUMBER ";
		}
		return "ODD NUMBER";
	}
	@GetMapping(value="/lettersFinding/{s}")
	
	public String letterFinding(@PathVariable String s) {
		if(s.contains("t")) {
			return "LETTER : "+s;
		}
		
			return "Nope";	
		
	}

			
	
	
	@GetMapping(value="/showDetails")
	
	public String showDetails(@RequestBody Laptop l) {
		
		return l.getBrand()+" "+l.getPrice();
	}
	

}
