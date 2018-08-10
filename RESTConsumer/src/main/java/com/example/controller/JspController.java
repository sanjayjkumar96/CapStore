package com.example.controller;

import org.springframework.stereotype.Controller;

@Controller
public class JspController {

/*	@RequestMapping(value="/welcome")
	public String showWelcomePage(Integer id, ModelMap model){
		
		RestTemplate restTemplate = new RestTemplate();
		Message message = restTemplate.getForObject("http://localhost:9090/getmessage?id="+id, Message.class);
		System.out.println(message);
		model.put("message", message);
		return "welcome";
	}*/
}
