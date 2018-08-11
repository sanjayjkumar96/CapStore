package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.example.beans.Customer;
import com.example.beans.Merchant;

@Controller
public class RestConsumer {

	@RequestMapping("/")
	public String consume(){
		return "welcome";
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
	
	@RequestMapping(value="/signUp")
	public ModelAndView sendMessage(){
		Customer cust = new Customer();
		cust.setC_id(1);
		cust.setC_name("John");
		cust.setC_phone("9874563210");
		cust.setC_email("abc@gmail.com");
		cust.setC_password("abc123@");
		System.out.println(cust);
		RestTemplate restTemplate = new RestTemplate();
		Customer cust_obj = restTemplate.postForObject("http://localhost:8080/receive",cust, Customer.class);
		
		
		return new ModelAndView("showDetails","cust_obj",cust_obj);
	}
	@RequestMapping(value ="/merchantSignUp", method = RequestMethod.POST)
	public String MerchantSignUp(@ModelAttribute Merchant merchant , BindingResult result ) {
		
		if(result.hasErrors())
			return "Error";
		
		RestTemplate restTemplate=new RestTemplate();
		restTemplate.postForObject("http://localhost:8080/serverMerchantSignUp",merchant, Merchant.class);
		return "merchantHome";
			
	}
	@RequestMapping(value = "/merchantHome")
	public String showSignUpMer(@ModelAttribute("merchant") Merchant merchant)
	{
		return "MerchantSignUp";
	}
	
	@RequestMapping("/merchantSignIn")
	public String MerchantSignIn(@RequestParam String m_id ,@RequestParam String m_password) {
		
		Merchant temp=new Merchant();
		temp.setM_id(m_id);
		temp.setM_password(m_password);
		
		Merchant m=new Merchant();
		RestTemplate restTemplate =new RestTemplate();
		m=restTemplate.postForObject("http://localhost:8080/serverMerchantSignIn",temp, Merchant.class);
		//restTemplate.postForObject("http://localhost:9090/serverMerchantSignIn", m_id,m_password,Merchant.class);
		if(m!=null)
			return "merchantHome";
		else
			return "merchantSignIn";
	}
}
