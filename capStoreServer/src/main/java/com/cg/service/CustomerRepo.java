package com.cg.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.beans.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer>{

}
