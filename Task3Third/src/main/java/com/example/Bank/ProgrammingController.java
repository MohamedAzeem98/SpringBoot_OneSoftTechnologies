package com.example.Bank;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ProgrammingController {
	@GetMapping("/users")

    public ResponseEntity < List < Customer >> users() {
		List < Customer > users = new ArrayList < > ();
		        users.add(new Customer( "Ramesh","Adyar"));
		        users.add(new Customer("Tony","Tnagar"));
		        users.add(new Customer("Tom","Avadi"));
		        HttpHeaders headers = new HttpHeaders();
		        headers.add("SPD", "Emergency");
		        return ResponseEntity.accepted().headers(headers).body(users);
		    }
@GetMapping("/users1")
@ResponseBody
    public List < Customer > users1() {
        List < Customer > users = new ArrayList < > ();
        		users.add(new Customer( "Ramesh","Adyar"));
        		users.add(new Customer("Tony","Tnagar"));
        		users.add(new Customer("Tom","Avadi"));
        		return users;
			}


}
