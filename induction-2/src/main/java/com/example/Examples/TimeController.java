package com.example.Examples;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TimeController {
@Autowired TimeService ts;
@PostMapping(value="/watching")
public String display(@RequestBody List<bustime>bt) {
	return ts.display(bt);
  }
@GetMapping(value="/getway")
public List<bustime> get(){
	return ts.get();
	
	}
@GetMapping(value="/henrich/{a}")
public bustime fly(@PathVariable int a) {
	return ts.fly(a);
}
@GetMapping(value="/krypton/{a}")
public bustime bulkget(@PathVariable int a){
	return ts.bulkget(a);
	
}
}
