package com.example.Projekat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Projekat.entity.Cinema;



@Repository
public interface CinemaRepository extends JpaRepository<Cinema,Long> {
	
}
