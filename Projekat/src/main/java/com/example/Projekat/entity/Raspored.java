package com.example.Projekat.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity//nije pravi raspored nego pomocna klasa za "pravi raspored" u bioskopu i za terminsku listu
public class Raspored implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Date datum;
	
	@ManyToOne
	private Film film; 
	
	private double cena;
	
	 
	@ManyToOne
	@JoinColumn(name="bioskop_id")
	private Bioskop bioskop;
	
	@OneToOne(mappedBy="raspored")
	private Terminska_lista tl;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Date getDatum() {
		return datum;
	}


	public void setDatum(Date datum) {
		this.datum = datum;
	}


	public Film getFilm() {
		return film;
	}


	public void setFilm(Film film) {
		this.film = film;
	}


	public double getCena() {
		return cena;
	}


	public void setCena(double cena) {
		this.cena = cena;
	}


	public Bioskop getBioskop() {
		return bioskop;
	}


	public void setBioskop(Bioskop bioskop) {
		this.bioskop = bioskop;
	}


	@Override
	public String toString() {
		return "Raspored [id=" + id + ", datum=" + datum + ", film=" + film + ", cena=" + cena + ", bioskop=" + bioskop
				+ "]";
	}
	
	
	
	
	
}
