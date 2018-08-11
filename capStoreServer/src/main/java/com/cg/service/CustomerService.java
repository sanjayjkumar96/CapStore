package com.cg.service;

import org.springframework.stereotype.Service;

import com.cg.beans.Customer;

@Service
public interface CustomerService {

	public Customer customerSignUp(Customer customer);

	public Customer login(Customer customer);

}
