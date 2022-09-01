package com.example.Day2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping(value="/Smaz")

public class ProductController {
	
	@Autowired ProductService ps;
	
	@PostMapping(value="/sending")
	
	
	public String sending(@RequestBody Product p) {
		return ps.sending(p);
	}
	@PostMapping(value="/bulk")
	public String bulk(@RequestBody List<Product>p) {
		return ps.bulk(p);
	}
	@DeleteMapping(value="/remove/{a}")
	
	public String deleteById(@PathVariable int a) {
		return ps.deleteById(a);
	}
	@PutMapping(value="/putting")
	
	public String putTheValue(@RequestBody Product p) {
		return ps.putTheValue(p);
	}
	@DeleteMapping(value="/deleting")
	public String deleteTheValue() {
		return ps.deleteTheValue();
	}
	
	@PostMapping(value="/postingAll")
	public String bulking(@RequestBody List<Product>p) {
		return ps.bulking(p);
	}
	@GetMapping(value="/finding/{a}")
	public Product finding(@PathVariable int a) {
		return ps.finding(a);
	}
	
	
	


}
