package com.example.demo.service;


import java.util.Optional;

import com.example.demo.entities.Profile;
import com.example.demo.entities.User;

public interface ICustomer {

	public User save(User u, long idp) throws Exception;
	public Profile addProfile(Profile p);
	public Optional<Profile> findprofile(long id);
	
	//public List<User> getWithCondition(Predicate<User> p);
	
}
