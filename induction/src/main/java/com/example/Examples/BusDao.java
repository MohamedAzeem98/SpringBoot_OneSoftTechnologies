package com.example.Examples;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class BusDao {
@Autowired BusRepository br;
	public String showing(List<bus> b) {
		// TODO Auto-generated method stub
		br.saveAll(b);
		return "done";
	}
	
	public List<bus> getInfo() {
		// TODO Auto-generated method stub
		return br.findAll();
	}

	public bus getflow(int a) {
		// TODO Auto-generated method stub
		return br.findById(a).get();
	}

}
