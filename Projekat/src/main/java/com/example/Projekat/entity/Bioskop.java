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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Bioskop implements Serializable {

	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column
	private String naziv; 
	 
	@Column
	private String adresa;
	
	@Column
	private String telefon;
	
	@Column
	private String email;
	
	public Bioskop(String naziv) {
		super();
		this.naziv = naziv;
	}


	@Column
	@ManyToMany
	@JoinTable(name = "menadzeriBioskopa",
            joinColumns = @JoinColumn(name = "bioskop_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "menadzer_id", referencedColumnName = "id"))
	private Set<Korisnik> zaduzeni=new HashSet<>();
	
	

	@Column
	@OneToMany(mappedBy="bioskop")
	private Set<Sala> listaSala = new HashSet<>();
	
	
	@OneToMany (mappedBy = "bioskop")//sadrzi vise rasporeda jer u rasporedu je samo jedan film i ostalo vezano za njega
	private Set<Raspored> raspored=new HashSet<>();


	public Bioskop(Long id, String naziv) {
		super();
		this.id = id;
		this.naziv = naziv;
	}


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


	public String getAdresa() {
		return adresa;
	}


	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}


	public String getTelefon() {
		return telefon;
	}


	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

	public Set<Korisnik> getZaduzeni() {
		return zaduzeni;
	}


	public void setZaduzeni(Set<Korisnik> zaduzeni) {
		this.zaduzeni = zaduzeni;
	}


	public Set<Sala> getListaSala() {
		return listaSala;
	}


	public void setListaSala(Set<Sala> listaSala) {
		this.listaSala = listaSala;
	}


	public Set<Raspored> getRaspored() {
		return raspored;
	}


	public void setRaspored(Set<Raspored> raspored) {
		this.raspored = raspored;
	}


	@Override
	public String toString() {
		return "Bioskop [id=" + id + ", naziv=" + naziv + ", adresa=" + adresa + ", telefon=" + telefon + ", email="
				+ email + ", zaduzeni=" + zaduzeni + "]";
	}
	
	
	
}
