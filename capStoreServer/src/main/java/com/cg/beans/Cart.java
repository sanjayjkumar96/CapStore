package com.cg.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Cart {
	String p_id;
	String c_id;
	int cart_p_qty;
	float cart_price;
	
	public String getP_id() {
		return p_id;
	}
	public void setP_id(String p_id) {
		this.p_id = p_id;
	}
	public String getC_id() {
		return c_id;
	}
	public void setC_id(String c_id) {
		this.c_id = c_id;
	}
	public int getCart_p_qty() {
		return cart_p_qty;
	}
	public void setCart_p_qty(int cart_p_qty) {
		this.cart_p_qty = cart_p_qty;
	}
	public float getCart_price() {
		return cart_price;
	}
	public void setCart_price(float cart_price) {
		this.cart_price = cart_price;
	}
	
	
}
