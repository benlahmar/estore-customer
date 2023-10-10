package com.example.demo.repos;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entities.User;



public interface IUser extends JpaRepository<User, Long>{

	public User findByUsername(String nom);
	public User findByUsernameAndPassword(String n,String ps);
	public List<User> findByUsernameContainingIgnoringCase(String mc);
	public List<User> findByProfileNom(String n);
	//public Page<User> findByProfileNom(String n,Pageable p);
	
	//recuperer les user dont les prenoms >2
	@Query("from User u where u.getprenomssize()>?1")
	public List<User> abc(int nb);
	
	@Query("from User u where u.password=?2 and u.username=?1")
	public List<User> klk(String lg,String ps);
	
	@Query("from User u where u.password= :ps and u.username= :lg")
	public List<User> klk2(@Param("lg") String log,@Param("ps") String pd);
	
	
	 
}
