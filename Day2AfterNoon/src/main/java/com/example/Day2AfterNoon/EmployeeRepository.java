package com.example.Day2AfterNoon;

import java.util.List;

import javax.persistence.NamedQuery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
	
	
	@Query(value="select * from enployeedetails1 where salary >? and salary <?",nativeQuery=true)
	List<Employee> getByRange(int salary1, int salary2);
	
	@Query(value="select * from enployeedetails1 where salary >?",nativeQuery=true)
	List<Employee> maximumFind(int salary);

	

	
	@Query(value = "Select * from enployeedetails1 where salary = (select max(salary) from enployeedetails1)",nativeQuery=true)
	Employee maximumFind();
	
 
}
