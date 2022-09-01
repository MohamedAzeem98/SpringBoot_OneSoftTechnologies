package com.example.Gst;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class TaxService {
@Autowired TaxDao td;
	public String check(List<Tax> t) {
		// TODO Auto-generated method stub
		return td.check(t);
	}
	public int crossCheck(int hnt) {
		// TODO Auto-generated method stub
		return td.crossCheck(hnt);
	}

}
