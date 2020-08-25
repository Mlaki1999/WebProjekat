package com.example.Projekat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.Projekat.entity.Movie;



@Repository
public interface MovieRepository extends JpaRepository<Movie,Long>{
	@Modifying
	@Query("update Movie set rating = :rating WHERE id = :movieId")
    void setRating(@Param("movieId") Long id, @Param("rating") double rating);
}

