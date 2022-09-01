package com.example.Marklist;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MarkDao {
	@Autowired MarkRepository mr;

	public String includes(List<Mark> ma) {
		// TODO Auto-generated method stub
		mr.saveAll(ma);
		return "Successfully posted";
	}

}
