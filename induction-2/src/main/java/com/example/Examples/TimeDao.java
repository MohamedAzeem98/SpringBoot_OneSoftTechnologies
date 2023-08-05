package com.example.Examples;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class TimeDao {
@Autowired TimeRepository tr;
	public String display(List<bustime> bt) {
		// TODO Auto-generated method stub
		tr.saveAll(bt);
		return "done";
	}
	public List<bustime> get() {
		// TODO Auto-generated method stub
		return tr.findAll();
	}
	public bustime fly(int a) {
		// TODO Auto-generated method stub
		return tr.findById(a).get();
	}
	public bustime bulkget(int a) {
		// TODO Auto-generated method stub
		return tr.findById(a).get();
	}

}
