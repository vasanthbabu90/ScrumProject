package com.scrum.portal.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.scrum.portal.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer>
{
	
	

}
