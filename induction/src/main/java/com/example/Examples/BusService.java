package com.example.Examples;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class BusService {
@Autowired BusDao bd;
	public String showing(List<bus> b) {
		// TODO Auto-generated method stub
		
	return bd.showing(b);
	}
	
	public List<bus> getInfo() {
		// TODO Auto-generated method stub
		return bd.getInfo();
	}

	public bus getflow(int a) {
		// TODO Auto-generated method stub
		return bd.getflow(a);
	}

}
