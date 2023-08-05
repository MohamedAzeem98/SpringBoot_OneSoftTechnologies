package com.coderUlagam.helther;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api")
public class HealtherController {
	@Autowired HeatherService hs;
	
	@PostMapping(value="/tenning")
	public String adding(@RequestBody List<Healther> h) {
		return hs.adding(h);
	}
	
	

}
