package com.example.Projekat.service;

import java.util.List;

import com.example.Projekat.entity.Korisnik;

public interface KorisnikService {

	Korisnik create(Korisnik korisnik) throws Exception;
	
	Korisnik findOne(Long id);
	
	Korisnik update(Korisnik korisnik) throws Exception;

    void delete(Long id);

    List<Korisnik> findAll();
}