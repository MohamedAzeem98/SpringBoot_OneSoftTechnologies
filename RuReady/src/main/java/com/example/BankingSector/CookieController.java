package com.example.BankingSector;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/Welcome")
public class CookieController {
	@Autowired CookieService cs;
	
	@PostMapping(name="/go")
	public String go(@RequestBody List<Cookies>co) {
		return cs.go(co);
	}
	
	
	
	}

	

