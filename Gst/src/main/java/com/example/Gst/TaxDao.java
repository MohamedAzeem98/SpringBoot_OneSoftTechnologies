package com.example.Gst;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class TaxDao {
@Autowired TaxRepository tr;
	public String check(List<Tax> t) {
		// TODO Auto-generated method stub
		tr.saveAll(t);
		return "Succeed";
	}
	public int crossCheck(int hnt) {
		// TODO Auto-generated method stub
		return tr.crossCheck(hnt);
	}

}
