package com.example.Examples;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ServiceFather {
@Autowired DaoFather df;
	public String  show(List<FatherName> f) {
		// TODO Auto-generated method stub
		return df.show(f);
	}

}
