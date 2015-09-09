package com.scrum.portal.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.scrum.portal.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer>
{
	

}
