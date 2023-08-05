package com.example.Examples;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ControllerFan {
	@Autowired ServiceFan sf;
	
	@PostMapping(value="/sat")
	public String pushing(@RequestBody List<Fan>f) {
		return sf.pushing(f);
		
	}
	@GetMapping(value="/denmark/{a}")
	
	public Fan getBy(@PathVariable int a){
		return sf.getBy(a);
	}

}
