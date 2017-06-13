package com.example.demo.services;

import com.example.demo.entities.ApplicationBean;
import com.example.demo.entities.Audit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/audit")
public class MainService {
	
	private ApplicationBean applicationBean;
	@Autowired
	private Storage storage;




	@RequestMapping(value="/save",method=RequestMethod.POST)
	public ApplicationBean save(@RequestBody ApplicationBean  list) {
		// TODO Auto-generated method stub
		applicationBean = list;
		storage.applicationBean = applicationBean;

		return applicationBean;
	}
	@RequestMapping(value="/get1", method=RequestMethod.GET)
	public ApplicationBean get() {

		return applicationBean;
	}
	
/*	@RequestMapping(value="/get",method=RequestMethod.GET)
	public List<Audit> get() {
		// TODO Auto-generated method stub
		return audit;
	}*/
	
	

}
