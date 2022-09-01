package com.example.HomePractice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class MobileDao {
	@Autowired MobileRepository mr;

	public String showDetailsOfMobile(List<MobilePhone> m) {
		// TODO Auto-generated method stub
		mr.saveAll(m);
		return "Done";
	}

}
