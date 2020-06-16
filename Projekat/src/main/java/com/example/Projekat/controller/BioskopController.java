package com.example.Projekat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Projekat.entity.Bioskop;
import com.example.Projekat.entity.Korisnik;
import com.example.Projekat.entity.dto.BioskopDTO;
import com.example.Projekat.entity.dto.KorisnikDTO;
import com.example.Projekat.service.BioskopService;




@RestController

@RequestMapping(value = "/api/bioskopi")
public class BioskopController {
	
	private final BioskopService bioskopService;

	
	@Autowired
    public BioskopController(BioskopService bioskopService) {
        this.bioskopService = bioskopService;
    }
	
	
	@PostMapping(
            consumes = MediaType.APPLICATION_JSON_VALUE,     // tip podataka koje metoda može da primi
            produces = MediaType.APPLICATION_JSON_VALUE)     // tip odgovora
    public ResponseEntity<BioskopDTO> createBioskop(@RequestBody BioskopDTO bioskopDTO) throws Exception {
        // Kreiramo objekat klase Employee, tako što setujemo vrednosti atributa
        // Vrednosti atributa uzimamo iz pristiglog DTO
        Bioskop bioskop = new Bioskop(bioskopDTO.getNaziv());

        // Pozivanje metode servisa koja kreira novog zaposlenog
        Bioskop newBioskop = bioskopService.create(bioskop);

        // Mapiranje novog zaposlenog na DTO objekat, koji će biti vraćen u sklopu odgovora
        BioskopDTO newBioskopDTO = new BioskopDTO(newBioskop.getId(),newBioskop.getNaziv());

        return new ResponseEntity<>(newBioskopDTO, HttpStatus.OK);


    }
}

