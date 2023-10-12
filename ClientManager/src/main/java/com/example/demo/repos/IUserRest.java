package com.example.demo.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.User;

@RepositoryRestResource(collectionResourceRel = "utilisateurs", itemResourceRel = "abc")
public interface IUserRest extends JpaRepository<User, Long>{

	
	@RestResource(exported = false)
	 @Override
	 void delete(User entity) ;
		
	@RestResource(path = "getu")
	List<User> findByUsername(String username);
}
