package com.example.SchoolStudent;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
@Service
public class SchoolService {
@Autowired SchoolDao sd;
	public String addingDetails(List<SchoolStudent> s) {
		// TODO Auto-generated method stub
		return sd.addingDetails(s);
	}
	public SchoolStudent getTheValue(int a) {
		// TODO Auto-generated method stub
		return sd.getTheValue(a);
	}
	public List<SchoolStudent>ranging(int std1 ,int std2){
		return sd.ranging(std1,std2);
		
	}
	public SchoolStudent maximumstd() {
		// TODO Auto-generated method stub
		return sd.maximumstd();
	}
	public List gettingTheValues() {
		// TODO Auto-generated method stub
		return sd.gettingTheValues();
	}

}
