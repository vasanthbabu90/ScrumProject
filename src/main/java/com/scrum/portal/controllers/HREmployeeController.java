package com.scrum.portal.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.scrum.portal.model.Employee;
import com.scrum.portal.services.EmployeeService;

@Controller
public class HREmployeeController 
{
	
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(value="employeeCreate", method=RequestMethod.GET)
	public String createEmployee(@ModelAttribute("employee") Employee employeeModel)
	{
		System.out.println("Hr controller");
		employeeService.createEmployee(employeeModel);
		return "Success";
		
	}

}
