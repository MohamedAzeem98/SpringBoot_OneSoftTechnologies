package com.example.Day2AfterNoon;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {
	@Autowired EmployeeRepository er;
	
	public String addValues(List<Employee> em) {
		er.saveAll(em);
		return "Succeeded";
	}

	public List<Employee> getByRange(int salary1, int salary2) {
		// TODO Auto-generated method stub
		return er.getByRange(salary1,salary2);
	}

	

	public Employee maximumFind() {
		// TODO Auto-generated method stub
		return er.maximumFind();
	}

}
