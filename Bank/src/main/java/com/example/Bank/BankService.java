package com.example.Bank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankService {
@Autowired BankDao bd;
	public Bank posting(Bank b) {
		// TODO Auto-generated method stub
		return bd.posting(b) ;
	}

}
