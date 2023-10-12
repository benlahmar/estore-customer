package com.example.demo.api;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Profile;
import com.example.demo.service.ICustomer;

@RestController
public class CustomerApi {

	@Autowired
	ICustomer service;
	
	@GetMapping("/profiles/{id}")
	public Profile getpbyid(@PathVariable long id)
	{
		Optional<Profile> oc = service.findprofile(id);
		if(oc.isPresent())
			return oc.get();
		else
			return null;
	}
}
