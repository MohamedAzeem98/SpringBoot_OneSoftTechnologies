package com.example.Gst;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/tax")
public class TaxController {
	@Autowired TaxService ts;
	
	@PostMapping(value="/check")
	public String check(@RequestBody List<Tax>t) {
		return ts.check(t);
	}
	@GetMapping(value="/crossCheck/{hnt}")
	public int crossCheck(@PathVariable int hnt) {
		return ts.crossCheck(hnt);
	}
	
	

}
