package com.scrum.portal.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scrum.portal.model.User;
import com.scrum.portal.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService 
{

	@Autowired
	private UserRepository userRespository;
	
	@Override
	public void addUser(User user) 
	{
		
		userRespository.save(user);
	}
	

}
