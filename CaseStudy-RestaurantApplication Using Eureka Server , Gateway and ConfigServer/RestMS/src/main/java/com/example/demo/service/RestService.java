package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.Restaurant;
import com.example.demo.dao.RestDAO;


@Service
public class RestService {
	
	
	@Autowired
	RestDAO  dao;
	
	
	public  List<Restaurant>  getAllRestaurant(){
	
           List<Restaurant>  list =  (List<Restaurant>) dao.findAll();
           
           return list;
	}

}
