package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.Bill;
import com.example.demo.bean.BillingList;

@RequestMapping("/bill")
@RestController
public class BillResource {
	
	
	List<Bill>   billList = Arrays.asList(
			new   Bill(111,"non-veg bill","Rs 500"),
			new   Bill(222,"veg bill","Rs 450"),
			new   Bill(333,"non-veg bill","Rs 600")
			);
	
	
	@GetMapping("/AllBill")
	public BillingList  getAllBill(){
		
		BillingList  list = new BillingList();
		list.setBill(billList);
		return  list;
	}
	
	
	
	

}
