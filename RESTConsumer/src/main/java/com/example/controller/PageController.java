package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.beans.Customer;
import com.example.beans.Merchant;

@Controller
public class PageController {

	
	@RequestMapping("/")
	public String consume(){
		return "welcome";
	}
	
	
	@RequestMapping(value = "/merchantHome")
	public String showSignUpMer(@ModelAttribute("merchant") Merchant merchant)
	{
		return "MerchantSignUp";
	}
	
	@RequestMapping(value = "/CustomerHome")
	public String showSignUpCust(@ModelAttribute("customer") Customer customer)
	{
		return "CustomerSignUp";
	}
	
}
