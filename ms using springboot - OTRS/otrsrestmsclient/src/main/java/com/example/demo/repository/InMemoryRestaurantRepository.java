package com.example.demo.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.Restaurant;

@Repository
public class InMemoryRestaurantRepository {

	private Map<String,Restaurant> entities;
	
	
	public InMemoryRestaurantRepository() {
		entities = new HashMap<String,Restaurant>();
	}


	@Override
	public String toString() {
		return "InMemoryRestaurantRepository [entities=" + entities + "]";
	}


	public boolean containsName(String name) {
		return entities.containsKey(name);
	}
	

	public void add(Restaurant entity) {
			entities.put(entity.getName(),entity);
		
	}


	public void remove(String id) {
		if(entities.containsKey(id)) {
			entities.remove(id);
		}
	}

	public void update(Restaurant entity) {
		if(entities.containsKey(entity.getName())) {
			entities.put(entity.getName(),entity);
		}
		
	}

	public boolean contain(String id) {
		
		return false;
	}


	public Restaurant get(String id) {
		// TODO Auto-generated method stub
		return null;
	}


	public Collection<Restaurant> getAll() {
		return entities.values();
	}
}


