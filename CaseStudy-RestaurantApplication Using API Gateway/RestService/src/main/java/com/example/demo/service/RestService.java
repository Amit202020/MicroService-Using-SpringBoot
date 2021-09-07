package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.RestBean;
import com.example.demo.repository.RestDAO;

@Service
public class RestService {
	
	@Autowired
	RestDAO   dao;
	
	public  void createRest(RestBean rest) {
		
		dao.save(rest);
		
	}
	
	
	public   Iterable<RestBean> getAllRest() {
		
		return dao.findAll();
	}

}
