package com.scrum.portal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int ID;
	
	private String firstName;
	private String lastName;
	private int employeeID;
	private String password;
	
	
	public Employee()
	{
		
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public int getEmployeeID() {
		return employeeID;
	}


	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	

}
