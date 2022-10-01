package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.bean.AccountList;
import com.example.demo.bean.Cust;
import com.example.demo.bean.CustList;
import com.example.demo.service.CustService;


@RequestMapping("/cust")
@RestController
public class CustResource {
	
	@Autowired
	private  RestTemplate  restTemplate;
	
//	@Value("${hello}") String luckyWord;
//
//	@GetMapping("/lucky-word")
//	public String showLuckyWord() {
//	    return "The lucky word is: " + luckyWord;
//	}



	@Autowired
	CustService service;
	
	@GetMapping("/allAccounts")
	public AccountList getAccount() {
		 
		 AccountList    accList = restTemplate.getForObject("http://ACC-SERVICE/allAcc",AccountList.class);
		 return accList;
		 
	 }


	@GetMapping("/allCust")
	public CustList getAllCust() {
		CustList clist = new CustList();
		clist.setCustList(service.getAllCust());
		return clist;
	}

	@GetMapping("/cust/{id}")
	public Cust getCustById(@PathVariable("id") String id) {

		return service.getCustById(id);

	}

}
