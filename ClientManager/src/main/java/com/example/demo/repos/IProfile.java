package com.example.demo.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entities.Profile;

public interface IProfile extends JpaRepository<Profile, Long>{

	public List<Profile> findByAdresseVille(String v);
	
	@Query("from Profile p where p.adresse.ville= ?1")
	public List<Profile> findByVille(String v);
	
	
	@Query(nativeQuery = true, value = "select * from profile where ville=?1")
	public List<Profile> findByVille2(String v);
}
