package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class ReqHandleController {
	
	
	      @RequestMapping("/billhandle")
	      public  Mono<String>  BillServiceHandler(){
	    	  return Mono.just("bill server is down");
	      }
	      
	      @RequestMapping("/resthandle")
	      public  Mono<String>  RestServiceHandler(){
	    	  return Mono.just("rest server is down");
	      }


}
