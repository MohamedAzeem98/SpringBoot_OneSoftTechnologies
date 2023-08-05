package com.example.Examples;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ServiceStudent {
@Autowired DaoStudent ds;
	
	public Student postFor(List<Student> s) {
		// TODO Auto-generated method stub
		return ds.postFor(s);
	}

	public Student getFor(int a) {
		// TODO Auto-generated method stub
		return ds.getFor(a);
	}

	

	

}
