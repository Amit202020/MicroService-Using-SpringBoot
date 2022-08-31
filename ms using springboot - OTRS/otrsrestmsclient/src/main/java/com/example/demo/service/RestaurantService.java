package com.example.demo.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Restaurant;
import com.example.demo.entity.Table;
import com.example.demo.repository.InMemoryRestaurantRepository;

@Service
public class RestaurantService {
	
	@Autowired
	private InMemoryRestaurantRepository restaurantRepository;
	
	
	public Collection getAll() {
		return restaurantRepository.getAll();
	}

	public void  insertRecord() {
		
		Table t1=new Table(1,"TABLE1",10);
		Table t2=new Table(2,"TABLE2",11);
		Table t3=new Table(3,"TABLE3",12);
		
		List<Table>  tabList=new ArrayList(); 
		tabList.add(t1);
		tabList.add(t2);
		tabList.add(t3);
		
		
		Restaurant res1=new  Restaurant(21,"A2B",tabList);
		Restaurant res2=new  Restaurant(22,"KFC",tabList);
		Restaurant res3=new  Restaurant(21,"Domino",tabList);
		
		restaurantRepository.add(res1);
		restaurantRepository.add(res2);
		restaurantRepository.add(res3);
		
		System.out.println("Record inserted");
		
	}
	
	
	public void add(Restaurant restaurant) {
		
		restaurantRepository.add(restaurant);
	}


}
