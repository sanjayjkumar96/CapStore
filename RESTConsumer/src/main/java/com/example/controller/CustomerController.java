package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.example.beans.Customer;

@Controller
public class CustomerController {

	@RequestMapping(value="/CustSignUp")
	public ModelAndView custSignUp(@ModelAttribute Customer customer,BindingResult result){
		
		RestTemplate restTemplate = new RestTemplate();
		Customer cust_obj = restTemplate.postForObject("http://localhost:8080/srvcSignUp",customer, Customer.class);
		
		
		return new ModelAndView("showDetails","cust_obj",cust_obj);
	}
	
	
	@RequestMapping(value= "/custSignIn")
	public ModelAndView custSignIn(@RequestParam String c_id,@RequestParam String c_password) {
		
		Customer temp = new Customer();
		temp.setC_id(c_id);
		temp.setC_password(c_password);
		RestTemplate restTemplate =new RestTemplate();
		temp=restTemplate.postForObject("http://localhost:8080/srvcSignIn",temp, Customer.class);
		if(temp==null)
		{
		String errMsg = "Login Error!";
		return new ModelAndView("custHome","msg",errMsg);
		}
		return new ModelAndView("custLogin","customer",temp);
		
		
		
		
	}
	
}
