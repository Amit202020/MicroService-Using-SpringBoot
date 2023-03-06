package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.bean.BillingList;
import com.example.demo.bean.Restaurant;
import com.example.demo.config.Properties;
import com.example.demo.config.RestServiceConfig;
import com.example.demo.service.RestService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

@RequestMapping("/rest")
@RestController
public class RestResource {
	
	@Autowired
	RestService  service;
	
	@Autowired
	RestTemplate    restTemplate;
	
	@Autowired
	RestServiceConfig  asc;
	
	
//	@GetMapping("/billing")
//    public  BillingList   getBilling() {
//		
//		return restTemplate.getForObject("http://localhost:8098/AllBill", BillingList.class);
//		
//	}

	


	@GetMapping("/rest/properties")
	public String getPropertiesDetails()throws JsonProcessingException{
		
                         ObjectWriter ow= new ObjectMapper().writer();
                         Properties properties=new Properties(asc.getMessage(),asc.getBuildversion(),asc.getMail(),asc.getSubject());
                         String obj=ow.writeValueAsString(properties);
                         return obj;
    }
	
	
	
	@GetMapping("/AllRest")
	public  List<Restaurant>  getAllRestaurant(){
		
		return service.getAllRestaurant();
		
	}
	
	

}
