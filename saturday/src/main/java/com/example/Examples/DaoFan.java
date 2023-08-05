package com.example.Examples;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class DaoFan {
@Autowired RepositoryFan rf;
	public String pushing(List<Fan> f) {
		// TODO Auto-generated method stub
		 rf.saveAll(f);
		 return "Loaded";
	}
	public Fan getBy(int a) {
		// TODO Auto-generated method stub
		return rf.findById(a).get();
	}

}
