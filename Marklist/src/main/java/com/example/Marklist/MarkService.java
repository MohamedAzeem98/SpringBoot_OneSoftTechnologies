package com.example.Marklist;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class MarkService {
@Autowired MarkDao md;
	public String includes(List<Mark> ma) {
		// TODO Auto-generated method stub
		return md.includes(ma) ;
	}

}
