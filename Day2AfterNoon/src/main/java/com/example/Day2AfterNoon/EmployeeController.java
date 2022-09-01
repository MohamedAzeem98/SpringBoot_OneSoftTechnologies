package com.example.Day2AfterNoon;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/sample")

public class EmployeeController {
	@Autowired EmployeeService es;
	
	
	@PostMapping(value="/addValues")
	public String addValues(@RequestBody List<Employee> em) {
		
		return es.addValues(em);
	}
	
	@GetMapping(value="/getByRange/{from}/{to}")
	
	public List<Employee>getByRange(@PathVariable("from")int salary1,@PathVariable("to")int salary2){
		return es.getByRange(salary1,salary2);
	}
	@GetMapping(value="/maximumFind")
	
	public Employee maximumFind(){
		return es.maximumFind();
		
	}

}
