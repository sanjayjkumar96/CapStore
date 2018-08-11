package com.cg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.beans.Merchant;

@Repository
public interface MerchantRepo extends JpaRepository<Merchant,Integer>{

}
