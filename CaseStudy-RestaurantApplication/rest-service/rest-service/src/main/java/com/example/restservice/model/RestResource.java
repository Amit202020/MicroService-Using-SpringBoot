package com.example.restservice.model;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/rest")
public class RestResource {

	@Autowired
	private RestTemplate restTemplate;

	List<Restaurant> restList = Arrays.asList(new Restaurant("r01", "Mac", "branded"),
			new Restaurant("r02", "KFC", "branded"), new Restaurant("r03", "MAX", "local"));

	@RequestMapping("/restaurants")
	public BillingList getAllRestaurants() {

		BillingList billlist = (BillingList) restTemplate.getForObject("http://localhost:8082/bill/billings",
				BillingList.class);
		return billlist;
	}

	
	
	@RequestMapping("/restaurant/{id}")
	public Restaurant getRestDetailsById(@PathVariable("id") String id) {

		Restaurant p = restList.stream().filter(rest -> id.equals(rest.getId())).findAny().orElse(null);
		return p;
	}

}
