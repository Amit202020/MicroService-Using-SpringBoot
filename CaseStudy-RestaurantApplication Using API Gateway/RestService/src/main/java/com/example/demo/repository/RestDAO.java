package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.bean.RestBean;

@Repository
public interface RestDAO  extends   CrudRepository <RestBean, Integer> {

}
