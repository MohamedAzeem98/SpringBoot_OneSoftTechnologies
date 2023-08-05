package com.coderUlagam.helther;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class HealtherDao {
@Autowired HealtherRepoistory hr;
	public String adding(List<Healther>h) {
		
		 hr.saveAll(h);
		return "done";
		
	}
	
}
