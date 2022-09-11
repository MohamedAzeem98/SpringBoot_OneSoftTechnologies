package com.example.BankingSector;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class CookieService {
@Autowired CookieDao cd;
	public String go(List<Cookies> co) {
		// TODO Auto-generated method stub
		return cd.go(co);
	}

}
