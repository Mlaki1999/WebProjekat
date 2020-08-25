package com.example.Projekat.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Projekat.entity.Movie;
import com.example.Projekat.entity.dto.MoviesDTO;
import com.example.Projekat.repository.MovieRepository;



@Service
public class MovieService {

	@Autowired
	private MovieRepository movieRepository;
	
	public Movie findOne(Long id) {
		Movie movie=this.movieRepository.findById(id).get();
		return movie;
	}
	
	public List<Movie> findAll(){
		List<Movie> movies=this.movieRepository.findAll();
		return movies;
	}
	
	public Movie save(Movie movie) {
		return this.movieRepository.save(movie);
	}
	
	public MoviesDTO getData(){
		List<Movie> movies=findAll();
		List<String> genres=new ArrayList<String>();
		for(int i=0;i<movies.size();i++)
		{
			if(!genres.contains(movies.get(i).getGenre())) {
				genres.add(movies.get(i).getGenre());
			}
		}
		return new MoviesDTO(movies,genres);
	}
	public void setRating(Long id,double rating) {
		this.movieRepository.setRating(id, rating);
	}
}

