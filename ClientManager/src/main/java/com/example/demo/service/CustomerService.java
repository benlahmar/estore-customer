package com.example.demo.service;

import java.util.Optional;
import java.util.function.Predicate;
import java.util.function.Supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ICalc;
import com.example.demo.entities.Profile;
import com.example.demo.entities.User;
import com.example.demo.repos.IProfile;
import com.example.demo.repos.IUser;

@Service
public class CustomerService implements ICustomer{

	@Autowired
	IProfile prepo;
	@Autowired
	IUser urepo;
	
	@Override
	public User save(User u, long idp) throws Exception  {
		
		Optional<Profile> op = prepo.findById(idp);
		Profile p;
		
		if(op.isPresent())
		{
			u.setProfile(op.get());
			urepo.save(u);
	
		}else
			throw new Exception("");
		
		
		return u;
	}

	@Override
	public Profile addProfile(Profile p) {
		
		return prepo.save(p);
	}

	@Override
	public Optional<Profile> findprofile(long id) {
		// TODO Auto-generated method stub
		return prepo.findById(id);
	}

}
