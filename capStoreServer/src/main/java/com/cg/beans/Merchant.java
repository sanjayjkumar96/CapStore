package com.cg.beans;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Merchant {
	
	@Id
	private String m_id;
	private String m_name;
	private String m_email;
	private String m_password;
	private float m_rating;
	
	@OneToMany
	private List<Product> products_list;

	public String getM_id() {
		return m_id;
	}

	public void setM_id(String m_id) {
		this.m_id = m_id;
	}

	public String getM_name() {
		return m_name;
	}

	public void setM_name(String m_name) {
		this.m_name = m_name;
	}

	public String getM_email() {
		return m_email;
	}

	public void setM_email(String m_email) {
		this.m_email = m_email;
	}

	public String getM_password() {
		return m_password;
	}

	public void setM_password(String m_password) {
		this.m_password = m_password;
	}

	public float getM_rating() {
		return m_rating;
	}

	public void setM_rating(float m_rating) {
		this.m_rating = m_rating;
	}

	public List<Product> getProducts_list() {
		return products_list;
	}

	public void setProducts_list(List<Product> products_list) {
		this.products_list = products_list;
	}
	
	
	
}
