package com.scrum.portal.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scrum.portal.model.Employee;
import com.scrum.portal.repositories.EmployeeRepository;

@Service
public class EmployeeService 
{
	
	@Autowired
	private EmployeeRepository employeeRepository; 
	
	public void createEmployee(Employee employee)
	{
		System.out.println("service");
		employeeRepository.save(employee);
		
	}

}
