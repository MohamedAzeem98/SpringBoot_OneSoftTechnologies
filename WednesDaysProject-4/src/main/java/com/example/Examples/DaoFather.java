package com.example.Examples;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class DaoFather {
@Autowired RepoFather rf;
	public String show(List<FatherName> f) {
		// TODO Auto-generated method stub
		rf.saveAll(f);
		return "Added successfully";
	}

}
