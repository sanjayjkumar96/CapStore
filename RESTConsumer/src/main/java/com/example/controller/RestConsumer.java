package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.beans.Customer;

@RestController
public class RestConsumer {

	@RequestMapping("/")
	public String consume(){
		return "REST Consumer";
	}
	/*@RequestMapping(value="/quote")
	public Quote consumeQuote(){
		RestTemplate restTemplate = new RestTemplate();
		Quote quote = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
		
		return quote;
	}*/
	
/*	@RequestMapping(value="/message")
	public Message consumeMessage(){
		RestTemplate restTemplate = new RestTemplate();
		Message message = restTemplate.getForObject("http://localhost:9090/getmessage?id=13", Message.class);
		
		
		return message;
	}*/
	
	@RequestMapping(value="/send")
	public Customer sendMessage(){
		Customer cust = new Customer();
		cust.setC_id(1);
		cust.setC_name("John");
		cust.setC_phone("9874563210");
		cust.setC_email("abc@gmail.com");
		cust.setC_password("abc123@");
		System.out.println(cust);
		RestTemplate restTemplate = new RestTemplate();
		Customer cust_obj = restTemplate.postForObject("http://localhost:8080/receive",cust, Customer.class);
		
		return cust_obj;
	}
	
}
