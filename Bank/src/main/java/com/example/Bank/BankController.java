package com.example.Bank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/day")
public class BankController {
@Autowired BankService bs;
@PostMapping(value="/posting")

public Bank posting(@RequestBody Bank b) {
	return bs.posting(b);
}

}
