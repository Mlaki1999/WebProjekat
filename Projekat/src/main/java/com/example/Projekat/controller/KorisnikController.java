package com.example.Projekat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Projekat.entity.Korisnik;
import com.example.Projekat.entity.dto.KorisnikDTO;
import com.example.Projekat.service.KorisnikService;

@RestController

@RequestMapping(value = "/api/korisnici")
public class KorisnikController {

	private final KorisnikService korisnikService;
	
	@Autowired
    public KorisnikController(KorisnikService korisnikService) {
        this.korisnikService = korisnikService;
    }
	
	 @GetMapping(
	            value = "/{id}",
	            produces = MediaType.APPLICATION_JSON_VALUE)  // tip odgovora
	    public ResponseEntity<KorisnikDTO> getKorisnik(@PathVariable(name = "id") Long id) {
	        // Dobavljamo zaposlenog po ID-u
	        Korisnik korisnik = this.korisnikService.findOne(id);

	        // Kreiramo objekat klase EmployeeDTO
	        KorisnikDTO korisnikDTO = new KorisnikDTO();
	        korisnikDTO.setIme(korisnik.getIme());
	        korisnikDTO.setPrezime(korisnik.getPrezime());
	   //     korisnikDTO.setUloga(korisnik.getUloga());

	        // Vraćamo ResponseEntity
	        // ResponseEntity predstavlja ceo HTTP odgovor: status kod, zaglavlja i body.
	        // Možemo u potpunosti da kontrolišemo šta će se nalaziti u odgovoru koji želimo da vratimo.
	        // Ako je došlo do greške postavljamo drugi HttpStatus npr. HttpStatus.BAD_REQUEST
	        return new ResponseEntity<>(korisnikDTO, HttpStatus.OK);
	    }
	
	 
	 
	 @PostMapping(
	            consumes = MediaType.APPLICATION_JSON_VALUE,     // tip podataka koje metoda može da primi
	            produces = MediaType.APPLICATION_JSON_VALUE)     // tip odgovora
	    public ResponseEntity<KorisnikDTO> createKorisnik(@RequestBody KorisnikDTO korisnikDTO) throws Exception {
	        // Kreiramo objekat klase Employee, tako što setujemo vrednosti atributa
	        // Vrednosti atributa uzimamo iz pristiglog DTO
	        Korisnik korisnik = new Korisnik(korisnikDTO.getIme(), korisnikDTO.getPrezime());

	        // Pozivanje metode servisa koja kreira novog zaposlenog
	        Korisnik newKorisnik = korisnikService.create(korisnik);

	        // Mapiranje novog zaposlenog na DTO objekat, koji će biti vraćen u sklopu odgovora
	        KorisnikDTO newKorisnikDTO = new KorisnikDTO(newKorisnik.getId(), newKorisnik.getIme(),
	                newKorisnik.getPrezime());

	        return new ResponseEntity<>(newKorisnikDTO, HttpStatus.OK);


	    }
}
