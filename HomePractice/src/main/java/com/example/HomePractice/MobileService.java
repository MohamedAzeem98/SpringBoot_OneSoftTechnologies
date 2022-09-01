package com.example.HomePractice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class MobileService {
	@Autowired MobileDao md;

	public String showDetailsOfMobile(List<MobilePhone> m) {
		// TODO Auto-generated method stub
		return md.showDetailsOfMobile(m);
	}

}
