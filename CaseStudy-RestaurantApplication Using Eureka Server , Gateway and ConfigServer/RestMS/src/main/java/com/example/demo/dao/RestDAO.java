package com.example.demo.dao;

import java.util.Arrays;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.bean.Restaurant;

@Repository
public interface RestDAO extends CrudRepository<Restaurant,Integer>{
	
}
