package com.example.Projekat.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Projekat.entity.Korisnik;
import com.example.Projekat.repository.KorisnikRepository;
import com.example.Projekat.service.KorisnikService;

@Service
public class KorisnikServiceImpl implements KorisnikService{
	@Autowired
	private KorisnikRepository korisnikRepository;

	@Override
	public Korisnik create(Korisnik korisnik) throws Exception {
		 if (korisnik.getId() != null) {
	            throw new Exception("ID must be null!");
	        }
	        Korisnik newKorisnik = this.korisnikRepository.save(korisnik);
	        return newKorisnik;
	}

	@Override
	public Korisnik findOne(Long id) {
		Korisnik korisnik=this.korisnikRepository.getOne(id);
		return korisnik;
	}

	@Override
	public Korisnik update(Korisnik korisnik) throws Exception {
		Korisnik korisnikToUpdate = this.korisnikRepository.getOne(korisnik.getId());
        if (korisnikToUpdate == null) {
            throw new Exception("Employee doesnt exist!");
        }

        // postavljanje novog imena
        korisnikToUpdate.setIme(korisnik.getIme());

        // čuvanje u bazi
        Korisnik savedKorisnik = this.korisnikRepository.save(korisnikToUpdate);
        return savedKorisnik;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Korisnik> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
