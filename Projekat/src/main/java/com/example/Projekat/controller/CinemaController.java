package com.example.Projekat.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.Projekat.entity.Cinema;
import com.example.Projekat.entity.dto.CinemaDTO;

import com.example.Projekat.service.CinemaService;



@Controller
public class CinemaController {
	
	@Autowired
	private CinemaService cinemaService;
	
	@GetMapping("/cinemas")
	public String welcome1(Model model) {
		List<Cinema> cinemas=this.cinemaService.findAll();
		model.addAttribute("cinemas", cinemas);
		return "cinemas.html";
	}
		
	@PostMapping("/add-cinema")
	public ResponseEntity<?> add(@RequestBody CinemaDTO cinemaDTO){
		Cinema cinema=cinemaService.save(Cinema.getCinemaByDTO(cinemaDTO));
		if (cinema == null)
			return new ResponseEntity<>(HttpStatus.CONFLICT);
		return new ResponseEntity<Cinema>(cinema, HttpStatus.OK);
	} 
	/*
	@PostMapping("/add-cinema")
	public ResponseEntity<CinemaDTO> add(@RequestBody CinemaDTO c) throws Exception {
			Cinema cinema=new Cinema(c.getName(),c.getAddress(),c.getPhone_number(),c.getEmail());
			this.cinemaService.save(cinema);
			CinemaDTO cinemaDTO=new CinemaDTO(cinema.getName(),cinema.getAddress(),cinema.getPhone_number(),cinema.getEmail());
			return new ResponseEntity<>(cinemaDTO,HttpStatus.OK);
			
	} */
	@DeleteMapping("/cinemas/{id}")
	public ResponseEntity<?> delete(@PathVariable(name="id") Long id){
		if(cinemaService.deleteById(id))
			return new ResponseEntity<>(HttpStatus.OK);
		else
			return new ResponseEntity<>(HttpStatus.CONFLICT);
	}

}