package com.example.demo.service;


import com.example.demo.entities.Profile;
import com.example.demo.entities.User;

public interface ICustomer {

	public User save(User u, long idp) throws Exception;
	public Profile addProfile(Profile p);
	
	//public List<User> getWithCondition(Predicate<User> p);
	
}
