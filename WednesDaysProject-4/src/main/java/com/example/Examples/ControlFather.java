package com.example.Examples;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControlFather {
	@Autowired ServiceFather sf;
	
	@PostMapping(value="/shell")
	public String show(@RequestBody List<FatherName>f) {
		return sf.show(f);
		
	}

}
