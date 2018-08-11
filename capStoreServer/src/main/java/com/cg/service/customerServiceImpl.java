package com.cg.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.cg.beans.Customer;
import com.cg.repository.CustomerRepo;

public class customerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepo repo;
	
	
	@Override
	public Customer customerSignUp(Customer customer) {
		
		return repo.save(customer);
	}

	

	public CustomerRepo getRepo() {
		return repo;
	}

	public void setRepo(CustomerRepo repo) {
		this.repo = repo;
	}



	@Override
	public Customer login(Customer customer) {
		repo.getOne(customer.getC_id());
		return null;
	}

}
