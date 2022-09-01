package com.example.Day2AfterNoon;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class EmployeeService {

	@Autowired EmployeeDao ed;
	public String addValues(List<Employee> em) {
		// TODO Auto-generated method stub
		return ed.addValues(em);
	}
	public List<Employee> getByRange(int salary1, int salary2) {
		// TODO Auto-generated method stub
		return ed.getByRange(salary1,salary2);
	}
	
	public Employee maximumFind() {
		// TODO Auto-generated method stub
		return ed.maximumFind();
	}

}
