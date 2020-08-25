package com.example.Projekat.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Projekat.entity.Roles;
import com.example.Projekat.entity.User;



@Repository
public interface UserRepository extends JpaRepository<User,Long>{

	 User findByEmail(String email);
	 
	 List<User> findByRole(Roles role);

}

