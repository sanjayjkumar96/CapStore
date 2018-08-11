package com.cg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.beans.Merchant;
import com.cg.service.MerchantService;

@RestController
public class MerchantController {

	@Autowired
	private MerchantService mService;
	
	
	
	@RequestMapping(value="/srvMerSignUp",method=RequestMethod.POST)
	public Merchant MerchantSignUp(@RequestBody Merchant merchant) {
		
		mService.merchantSignUp(merchant);
		return merchant;
	}	
	
	
}
