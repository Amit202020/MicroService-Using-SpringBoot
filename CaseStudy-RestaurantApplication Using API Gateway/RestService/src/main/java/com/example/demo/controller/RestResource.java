package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.bean.BillingList;
import com.example.demo.bean.RestBean;
import com.example.demo.service.RestService;

@RestController
@RequestMapping("/rest")
public class RestResource {
	
	
	@Autowired
	RestTemplate    restTemplate;
	
	@GetMapping("/billing")
	public  BillingList   getBilling() {
		
		return restTemplate.getForObject("http://BILL-SERVICE/billings", BillingList.class);
	}
	

	
	@Autowired
	RestService  service;
	
	
	@PostMapping("/createrest")
	public void  createRest(@RequestBody RestBean rest) {
		
		 service.createRest(rest);		
		
	}
	
	@GetMapping("/allrestaurants")
	public   Iterable<RestBean> getAllRest() {
		
		return  service.getAllRest();	
		
	}

}
