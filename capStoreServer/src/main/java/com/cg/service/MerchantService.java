package com.cg.service;

import org.springframework.stereotype.Service;

import com.cg.beans.Merchant;

@Service
public interface MerchantService {

	public Merchant merchantSignUp(Merchant merchant);
	
}
