package com.example.BankingSector;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class CookieDao {
@Autowired CookieRepository cr;
	public String go(List<Cookies> co) {
		// TODO Auto-generated method stub
		cr.saveAll(co);
		return "Done";
	}

}
