package com.example.Projekat.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class OcenaFilm implements Serializable {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	private Film film;
	
	private int ocena;
	
	@ManyToOne
	@JoinColumn(name="gledaoc_id") 
	private Korisnik gledaoc;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Film getFilm() {
		return film;
	}

	public void setFilm(Film film) {
		this.film = film;
	}

	public int getOcena() {
		return ocena;
	}

	public void setOcena(int ocena) {
		this.ocena = ocena;
	}

	public Korisnik getGledaoc() {
		return gledaoc;
	}

	public void setGledaoc(Korisnik gledaoc) {
		this.gledaoc = gledaoc;
	}

	@Override
	public String toString() {
		return "OcenaFilm [id=" + id + ", film=" + film + ", ocena=" + ocena + ", gledaoc=" + gledaoc + "]";
	}
	
	
	
	
}

