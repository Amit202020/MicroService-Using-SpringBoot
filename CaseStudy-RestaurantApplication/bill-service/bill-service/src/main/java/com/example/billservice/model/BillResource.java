package com.example.billservice.model;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.billservice.bean.Billing;
import com.example.billservice.bean.BillingList;

@RestController
@RequestMapping("/bill")
public class BillResource {
	
	
	List<Billing>    billingObj = Arrays.asList(
			new Billing("b01","fastfood","rs 300 "),
			new Billing("b02","snacks","100"),
			new Billing("b03","lunch","400")
			);
	
	
	 @RequestMapping("/billings")
	 public BillingList getBills(){
		 
		 BillingList   bl=new BillingList();
		 bl.setBill(billingObj);
		 
		 return bl;
	 }
	 
	 
	 
	 @RequestMapping("/billing/{id}")
	 public  Billing  getBillById(@PathVariable("id")String id){
	      Billing  b=	 billingObj.stream().filter( billing -> id.equals(billing.getId())).findAny().orElse(null);
	      return b;
	 }
			

}
