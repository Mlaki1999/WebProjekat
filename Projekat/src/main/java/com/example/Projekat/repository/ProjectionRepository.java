package com.example.Projekat.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Projekat.entity.Projection;



@Repository
public interface ProjectionRepository extends JpaRepository<Projection,Long> {
	List<Projection> findByCinemaId(Long id);
	
}
