package com.coderUlagam.helther;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
//@RequestMapping(value="krick")
public class HeatherService {
@Autowired HealtherDao hd;
		public String adding(List<Healther> h) {
		// TODO Auto-generated method stub
		return hd.adding(h);
	}

}
