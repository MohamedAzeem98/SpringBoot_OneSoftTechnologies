package com.example.SchoolStudent;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class SchoolDao {
@Autowired SchoolRepository sr;
	public String addingDetails(List<SchoolStudent> s) {
		// TODO Auto-generated method stub
		sr.saveAll(s);
		return "Succeed";
	}
	public SchoolStudent getTheValue(int a) {
		// TODO Auto-generated method stub
		
		return sr.findById(a).get();
	}
	public List<SchoolStudent> ranging(int std1, int std2) {
		// TODO Auto-generated method stub
		return sr.ranging(std1,std2);
	}
	public SchoolStudent maximumstd() {
		// TODO Auto-generated method stub
		return sr.maximumstd();
	}
	public List gettingTheValues() {
		// TODO Auto-generated method stub
		return sr.findAll();
	}

}
