package com.example.Day3;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.example.Day2AfterNoon.Employee;

@RestController
@RequestMapping(value="/product")
public class ProductController {
	@Autowired ProductService ps;
	
	@PostMapping(value="/show")
	
	public String show(@RequestBody List<Product> p) {
		return ps.show(p);
	}
	
	@GetMapping(value="/getting")
	
	public List<Product> getting() {
		return ps.getting();
	}




}
