package com.example.Projekat.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity//pomocna klasa za "pravu terminsku listu"
public class Terminska_lista implements Serializable {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@OneToOne
	private Raspored raspored;
	
	private int brojRezervacija;
	
	@ManyToMany(mappedBy="terminska_lista")//ManyToMany za slucaj da vise sala ima istu terminsku listu
	private Set<Sala> listaSala = new HashSet<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Raspored getRaspored() {
		return raspored;
	}

	public void setRaspored(Raspored raspored) {
		this.raspored = raspored;
	}

	public int getBrojRezervacija() {
		return brojRezervacija;
	}

	public void setBrojRezervacija(int brojRezervacija) {
		this.brojRezervacija = brojRezervacija;
	}

	@Override
	public String toString() {
		return "Terminska_lista [id=" + id + ", raspored=" + raspored + ", brojRezervacija=" + brojRezervacija + "]";
	}
	
	
}
