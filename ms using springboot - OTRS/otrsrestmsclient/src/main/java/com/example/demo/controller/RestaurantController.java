package com.example.demo.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Restaurant;
import com.example.demo.service.RestaurantService;

@RestController
@RequestMapping("/v1/restaurant")
public class RestaurantController {
	
	@Autowired
	private RestaurantService restaurantService;
	
	
	@GetMapping("/insertAll")
	public void insertRecord() {
		restaurantService.insertRecord();
	}
	

	
	
	@GetMapping("/selectAll")
	public ResponseEntity<Collection<Restaurant>>  findAll(){
		Collection<Restaurant> restaurant=restaurantService.getAll();
		return new ResponseEntity<>(restaurant,HttpStatus.OK);
	}

}
