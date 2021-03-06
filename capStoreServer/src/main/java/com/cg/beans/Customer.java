package com.cg.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
public class Customer {
		
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int c_id;
	
	private String c_name;
	
	private String c_phone;
	
	private String c_email;
	
	private String c_password;

	public int getC_id() {
		return c_id;
	}

	public void setC_id(int c_id) {
		this.c_id = c_id;
	}

	public String getC_name() {
		return c_name;
	}

	public void setC_name(String c_name) {
		this.c_name = c_name;
	}

	public String getC_phone() {
		return c_phone;
	}

	public void setC_phone(String c_phone) {
		this.c_phone = c_phone;
	}

	public String getC_email() {
		return c_email;
	}

	public void setC_email(String c_email) {
		this.c_email = c_email;
	}

	public String getC_password() {
		return c_password;
	}

	public void setC_password(String c_password) {
		this.c_password = c_password;
	}

	public Customer() {
		
	}

	@Override
	public String toString() {
		return "Customer [c_id=" + c_id + ", c_name=" + c_name + ", c_phone=" + c_phone + ", c_email=" + c_email
				+ ", c_password=" + c_password + "]";
	}
}
