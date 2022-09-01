package com.example.mohamed;

import javax.websocket.server.PathParam;
                                                                                    //controller layer
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/MohamedAzeem")
public class Mohamed {
	@GetMapping(value="/checking")
	
	public String checking(@PathParam(value="name")String name,@PathParam(value="password")String password) {
		if(name.equals("mohamed")&&password.equals("S2467")) {
			return "Access granted";
			
		}
		else {
			return "Invalid users";
		}
		
	}
	@GetMapping(value="/adding/{a}/{b}")
	
	public int adding(@PathVariable int a,@PathVariable int b) {
		return a+b;
	}
	
	
	
@PostMapping(value="/send")
	
	public String carInfo(@RequestBody Car c) {
		return c.getBrand()+" "+c.getPrice()+" "+c.getColor();
		
	}
	
	
	

}
