package com.example.demo.comtroller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.Billing;
import com.example.demo.bean.BillingList;

@RestController
@RequestMapping("/bill")
public class BillResource {
	

	List<Billing> billObj = Arrays.asList(
			new Billing(100, "fastfood", "rs 500"),
			new Billing(101, "veg", "rs 400"),
			new Billing(102, "nonvegfood", "rs 700"));

	
	@GetMapping("/billings")
	public BillingList getAllBilling() {

		BillingList bl = new BillingList();
		bl.setBill(billObj);
		return bl;
	}
	
	@GetMapping("/billing/{id}")
	public Billing  getBillById(@PathVariable("id") int id){
		
		return  billObj.stream().filter( billing     ->   id==billing.getBillId()).findAny().orElse(null);
		
		
		
	}

}
