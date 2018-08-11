package com.cg.springbootdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cg.beans.Merchant;
import com.cg.repository.MerchantRepo;

@Controller
public class MerchantController {

	@Autowired
	private MerchantRepo repo;
	
	
	@RequestMapping(value="/serverMerchantSignUp",method=RequestMethod.POST)
	public Merchant MerchantSignUp(@RequestBody Merchant merchant) {
		//merchantService.merchantSignUp(merchant);
		repo.save(merchant);
		return merchant;
	}	
	
	
}
