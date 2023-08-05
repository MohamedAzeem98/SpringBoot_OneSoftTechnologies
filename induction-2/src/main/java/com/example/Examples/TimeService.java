package com.example.Examples;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class TimeService {
@Autowired TimeDao td;
	public String display(List<bustime> bt) {
		// TODO Auto-generated method stub
		return td.display(bt);
	}
	public List<bustime> get() {
		// TODO Auto-generated method stub
		return td.get();
	}
	public bustime fly(int a) {
		// TODO Auto-generated method stub
		return td.fly(a);
	}
	public bustime bulkget(int a) {
		// TODO Auto-generated method stub
		return td.bulkget(a);
	}

}
