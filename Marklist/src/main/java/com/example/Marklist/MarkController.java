package com.example.Marklist;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/fire")
public class MarkController {
	@Autowired MarkService ms;
	
	@PostMapping(value="/include")
	
	public String includes(@RequestBody List<Mark>ma) {
		return ms.includes(ma);
	}

}
