package com.example.Examples;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Examples.*;

@RestController
public class BusController {
	@Autowired BusService bs;
	
	@PostMapping(value="/showings")    //postForBulkValues
	
	public String showing(@RequestBody List<bus>b) {
		return bs.showing(b);
	}
	@GetMapping(value="/flows")    //getForBulkValues
	
	public List<bus>getInfo(){
		return bs.getInfo();
	}
	
	@GetMapping(value="/throne/{a}")     //getForSpecific
	
	public bus getflow(@PathVariable int a) {
		return bs.getflow(a);
	}

}
