package com.coderUlagam.helther;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="api")

public class HeltherController {
	@Autowired HealtherService f;
	public String adding(@RequestBody String b) {
		return HealtherController.adding(b);
	}
	
	
	
	

}
