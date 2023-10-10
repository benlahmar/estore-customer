package com.example.demo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entities.Adresse;
import com.example.demo.entities.Profile;
import com.example.demo.entities.User;
import com.example.demo.repos.IProfile;
import com.example.demo.repos.IUser;
import com.example.demo.service.ICustomer;

@SpringBootApplication
public class ClientManagerApplication implements CommandLineRunner {

	@Autowired
	ICustomer service;
	
	public static void main(String[] args) {
		SpringApplication.run(ClientManagerApplication.class, args);		
	}

	@Override
	public void run(String... args) throws Exception {		

		Profile p=new Profile();
		service.addProfile(p);
//		System.out.println("*************");
//		System.out.println(prepo.findByVille2("casa"));
	}

}
