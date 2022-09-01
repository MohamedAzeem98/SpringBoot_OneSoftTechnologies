package com.example.SchoolStudent;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface SchoolRepository extends JpaRepository<SchoolStudent,Integer> {
@Query(value="select * from studentlist where std> ? and std< ?",nativeQuery=true)
	List<SchoolStudent> ranging(int std1, int std2);


@Query(value="select * from studentlist where std=(select max(std)from studentlist)",nativeQuery=true)
SchoolStudent maximumstd();

}

