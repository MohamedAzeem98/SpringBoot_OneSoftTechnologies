package com.example.SchoolStudent;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/specifying")
public class SchoolController {
	@Autowired SchoolService ss;
	
	@PostMapping(value="/addingDetails")
	
	public String addingDetails(@RequestBody List<SchoolStudent> s) {
		return ss.addingDetails(s);
	}
	@GetMapping(value="/getTheValue/{a}")
	
	public SchoolStudent getTheValue(@PathVariable int a) {
		return ss.getTheValue(a);
	}
	
	@GetMapping(value="/ranging/{from}/{to}")
	
	public List<SchoolStudent>ranging(@PathVariable("from")int std1 ,@PathVariable("to")int std2){
		return ss.ranging(std1,std2);
		
	}
	@GetMapping(value="/maximumStd")
	public SchoolStudent maximumstd() {
		return ss.maximumstd();
	}
	@GetMapping(value="/gettingTheValues")
	
	public List gettingTheValues() {
		return ss.gettingTheValues();
	}

}
