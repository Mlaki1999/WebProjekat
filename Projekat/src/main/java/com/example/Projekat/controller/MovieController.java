package com.example.Projekat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.Projekat.entity.Movie;
import com.example.Projekat.entity.dto.MoviesDTO;
import com.example.Projekat.service.MovieService;



@Controller
public class MovieController {
	@Autowired
	private MovieService movieService;
	
	@GetMapping("/movies")
	public String movies(Model model) {
		MoviesDTO moviesDTO=this.movieService.getData();
		model.addAttribute("moviesDTO", moviesDTO);
		return "movies.html";
	}
	
	@GetMapping("/movie/{id}")
	public String getMovie(@PathVariable(name = "id") Long id,Model model){
		Movie movie=this.movieService.findOne(id);
		model.addAttribute("movie", movie);
		return "movie.html";
	}
}