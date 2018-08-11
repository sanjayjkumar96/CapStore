package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.example.beans.Merchant;

@Controller
public class MerchantController {


	
	
	@RequestMapping(value ="/merchantSignUp", method = RequestMethod.POST)
	public String MerchantSignUp(@ModelAttribute Merchant merchant , BindingResult result ) {
		
		if(result.hasErrors())
			return "Error";
		
		RestTemplate restTemplate=new RestTemplate();
		restTemplate.postForObject("http://localhost:8080/srvMerSignUp",merchant, Merchant.class);
		return "merchantHome";
			
	}
	
	
	@RequestMapping("/merchantSignIn")
	public String MerchantSignIn(@RequestParam String m_id ,@RequestParam String m_password) {
		
		Merchant temp=new Merchant();
		temp.setM_id(m_id);
		temp.setM_password(m_password);
		
		Merchant m=new Merchant();
		RestTemplate restTemplate =new RestTemplate();
		m=restTemplate.postForObject("http://localhost:8080/srvMerSignIn",temp, Merchant.class);
		
		if(m!=null)
			return "merchantHome";
		else
			return "merchantSignIn";
	}
}
