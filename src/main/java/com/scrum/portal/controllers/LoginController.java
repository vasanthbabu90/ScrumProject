package com.scrum.portal.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.scrum.portal.model.User;
import com.scrum.portal.services.UserService;

@Controller
public class LoginController 
{

	@Autowired
	private UserService userService;
	
	@RequestMapping(value= "login", method=RequestMethod.GET)
	public String login()
	{
		System.out.println("inside login");
		
		return "Employee";
	}
	
	@RequestMapping(value ="success", method= RequestMethod.GET)
	public String success(@ModelAttribute("user") User userModel)
	{
		
		System.out.println("Success controller " +userModel.getUserName());
		userService.addUser(userModel);
		return "Success";
	}
	
}
