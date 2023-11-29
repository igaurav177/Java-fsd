package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeedbackServices {
	@Autowired
	FeedbackRepo repo;
	
	//insert
	public Feedback insert(Feedback f) {
		return repo.save(f);
	}
	//getallrecord
		public List<Feedback> getall(){
			return repo.findAll();
		}
}
