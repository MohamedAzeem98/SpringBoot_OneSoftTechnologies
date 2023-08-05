package com.example.Examples;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TimeRepository extends JpaRepository<bustime,Integer>{

	
	@Query(value="Select * from bustiming where busregno like?",nativeQuery=true)
	 List<bustime> bulkget(int a);
}
