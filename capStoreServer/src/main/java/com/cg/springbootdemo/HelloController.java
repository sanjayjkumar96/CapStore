package com.cg.springbootdemo;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.beans.Customer;
import com.cg.service.CustomerRepo;

@RestController
public class HelloController {
	
	@Autowired
	private CustomerRepo repo;
	
	
	@RequestMapping("/")
	public String sayHello(){
		
		return "Spring Boot is cool...";
	}
	
	/*@RequestMapping(value="/message")
	public Message sendMessage(){
		return new Message("Message from SpringBoot APP",new Sender("Hitesh"));
	}*/
	
	@RequestMapping(value="/receive", method=RequestMethod.POST)
	public Customer receiveMessage(@RequestBody Customer customer){
		repo.save(customer);
		return customer;
	}

	
	
	
	
	
	@RequestMapping(value="/getmessage")
	public Customer getMessage(int id){
		
		return repo.getOne(id);
	}
}























