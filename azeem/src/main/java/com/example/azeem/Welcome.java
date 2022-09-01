package com.example.azeem;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/Azeem")
public class Welcome {
	@GetMapping(value="/Welcome")
	public String welcome() {
		return "Hello Azeem";
	}

@GetMapping(value="/add/{a}/{b}")
public int add(@PathVariable int a,@PathVariable int b) {
	return a+b;
}

@GetMapping(value="/primeNumber/{a}")
public String primeNumber(@PathVariable int a) {
	boolean flag=true;
	for(int i=2;i<a;i++) {
		if(a%i==0) {
			flag=false;
		  }
		}
	if(flag) {
		return "Prime";
	}else
		
	return "not Prime Number";
	
}

@RequestMapping(value="/check")

public String check(@PathParam(value = "name") String name,@PathParam(value = "password") String password) {
	if(name.equals("azeem")&& password.equals("S2467")) {
		return "Access granted";
	}
	else {
		return "Invalid User";
	}
}






}
