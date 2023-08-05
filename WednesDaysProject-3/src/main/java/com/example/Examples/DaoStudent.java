package com.example.Examples;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class DaoStudent {
@Autowired RepositoryStudent rs;
	
	public Student postFor(List<Student> s) {
		// TODO Auto-generated method stub
		rs.saveAll(s);
		return null;
	}

	public Student  getFor(int a) {
		// TODO Auto-generated method stub
		
		return rs.findById(a).get();
	}

}
