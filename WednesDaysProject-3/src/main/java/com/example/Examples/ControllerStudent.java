package com.example.Examples;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerStudent {
	
	@Autowired ServiceStudent ss;
	
	@RequestMapping(value="/aze123")
	public String verify() {
		return "hello";
	}
	@PostMapping(value="/postFor")
	
	public Student postFor(@RequestBody List<Student>s) {
		return ss.postFor(s);
	}
	
	@GetMapping(value="/getFor/{a}")
	
	public Student getFor(@PathVariable int a){
		return ss.getFor(a);
	}
	

}
