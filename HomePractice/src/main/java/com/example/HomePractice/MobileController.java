package com.example.HomePractice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/Spark")
public class MobileController {
	@Autowired MobileService ms;
	
	@PostMapping(value="/showDetailsOfMobile")
	
	public String showDetailsOfMobile(@RequestBody List<MobilePhone>m) {
		return ms.showDetailsOfMobile(m);
	}
	

}
