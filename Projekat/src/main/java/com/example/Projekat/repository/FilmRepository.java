package com.example.Projekat.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Projekat.entity.Film;

public interface FilmRepository extends JpaRepository<Film, Long> {

}
