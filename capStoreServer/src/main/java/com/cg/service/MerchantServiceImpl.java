package com.cg.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.cg.beans.Merchant;
import com.cg.repository.MerchantRepo;


public class MerchantServiceImpl implements MerchantService {
	
	@Autowired
	private MerchantRepo merchantRepo;

	public Merchant merchantSignUp(Merchant merchant) {
		return merchantRepo.save(merchant);
	}
}
