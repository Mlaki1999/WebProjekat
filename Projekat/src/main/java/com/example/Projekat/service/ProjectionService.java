package com.example.Projekat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Projekat.entity.Cinema;
import com.example.Projekat.entity.Movie;
import com.example.Projekat.entity.Projection;
import com.example.Projekat.entity.Room;
import com.example.Projekat.entity.dto.ProjectionDTO;
import com.example.Projekat.repository.ProjectionRepository;



@Service
public class ProjectionService {
	@Autowired
	private ProjectionRepository projectionRepository;
	
	@Autowired
	private CinemaService cinemaService;
	
	@Autowired
	private MovieService movieService;
	
	@Autowired
	private RoomService roomService;
	
	public Projection findOne(Long id) {
		Projection projection=this.projectionRepository.findById(id).get();
		return projection;
	}
	
	public List<Projection> findAll(){
		List<Projection> projections=this.projectionRepository.findAll();
		return projections;
	}
	public Projection save(Projection projection) {
		return this.projectionRepository.save(projection);
	}
	
	public List<Projection> findByCinemaId(Long id)
	{
		return projectionRepository.findByCinemaId(id);
	}
	
	public void addProjection(ProjectionDTO projectionDTO) {
		Projection projection=new Projection();
		Cinema cinema=this.cinemaService.findOne(projectionDTO.getCinema_id());
		Movie movie=this.movieService.findOne(projectionDTO.getMovie_id());
		Room room=this.roomService.findOne(projectionDTO.getRoom_id());
		projection.setCinema(cinema);
		projection.setMovie(movie);
		projection.getRooms().add(room);
		projection.setDay(projectionDTO.getDay());
		projection.setPrice(projectionDTO.getPrice());
		projection.setTime(projectionDTO.getTime());
		projection.setViewers(null);
		this.projectionRepository.save(projection);
		cinema.getSchedule().add(projection);
		room.getProjections().add(projection);
		
	}
}
