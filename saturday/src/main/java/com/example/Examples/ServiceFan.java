package com.example.Examples;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ServiceFan {
@Autowired DaoFan df;
	public String pushing(List<Fan> f) {
		// TODO Auto-generated method stub
		return df.pushing(f);
	}
	public Fan getBy(int a) {
		// TODO Auto-generated method stub
		return df.getBy(a);
	}

}
