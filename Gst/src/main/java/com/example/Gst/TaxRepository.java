package com.example.Gst;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TaxRepository extends JpaRepository<Tax,Integer> {
   @Query(value="select percentage from Gst where hnt=?",nativeQuery=true)
	int crossCheck(int hnt);

}
