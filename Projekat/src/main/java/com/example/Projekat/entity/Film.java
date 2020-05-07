package com.example.Projekat.entity;

import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;



@Entity
public class Film implements Serializable {

	
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column
	private String naziv;
	
	@Column 
	private String opis; 
	
	@Column
	private String zanr;
	
	@Column
	private String trajanje;
	 
	@Column
	private double ocena;
	
	@ManyToMany(mappedBy = "odgledaniFilmovi", fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
	private Set<Korisnik> gledaoci = new HashSet<>();
	
	@ManyToMany(mappedBy = "rezervisaniFilmovi", fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
	private Set<Korisnik> rezervacije = new HashSet<>();

	
	@OneToMany(mappedBy = "film", fetch = FetchType.LAZY, cascade = CascadeType.ALL)//svaki gledaoc moze dati jednu ocenu za jedan film
	private Set<OcenaFilm> ocene = new HashSet<>();
	
	@OneToMany(mappedBy = "film", fetch = FetchType.LAZY, cascade = CascadeType.ALL)//stavljam jedan film u raspored pa pravim listu rasporeda("pravi raspored") u bioskopu
	private Set<Raspored> rasporedi = new HashSet<>();
	 
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	public String getZanr() {
		return zanr;
	}

	public void setZanr(String zanr) {
		this.zanr = zanr;
	}

	public String getTrajanje() {
		return trajanje;
	}

	public void setTrajanje(String trajanje) {
		this.trajanje = trajanje;
	}

	public double getOcena() {
		return ocena;
	}

	public void setOcena(double ocena) {
		this.ocena = ocena;
	}

	public Set<Korisnik> getGledaoci() {
		return gledaoci;
	}

	public void setGledaoci(Set<Korisnik> gledaoci) {
		this.gledaoci = gledaoci;
	}

	public Set<Korisnik> getRezervacije() {
		return rezervacije;
	}

	public void setRezervacije(Set<Korisnik> rezervacije) {
		this.rezervacije = rezervacije;
	}
	
/*
	public int getBroj_ocena() {
		return broj_ocena;
	}

	public void setBroj_ocena(int broj_ocena) {
		this.broj_ocena = broj_ocena;
	} */

	@Override
	public String toString() {
		return "Film [id=" + id + ", naziv=" + naziv + ", opis=" + opis + ", zanr=" + zanr + ", trajanje=" + trajanje
				+ ", ocena=" + ocena + "]";
	}
	
	
	
	
}
