package com.cg.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.beans.Customer;
import com.cg.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService cService;
	
	
	
	
	
	
	@RequestMapping(value="/srvcSignUp", method=RequestMethod.POST)
	public Customer srvCustSignUp(@RequestBody Customer customer){
		cService.customerSignUp(customer);
		return customer;
	}

	
	@RequestMapping(value="/srvcSignIn")
	public Customer srvCustSignIn(Customer customer){
		
		return cService.login(customer);
	}
}























