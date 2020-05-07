package com.example.Projekat.entity;

import java.io.Serializable;
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

@Entity
public class Sala implements Serializable {  

	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column
	private int kapacitet;
	 
	@Column 
	private String oznakaSale;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Bioskop bioskop;
	
	@ManyToMany
	@JoinTable(name = "rasporedFilmovaPoSalama",
    joinColumns = @JoinColumn(name = "sala_id", referencedColumnName = "id"),
    inverseJoinColumns = @JoinColumn(name = "terminskaLista_id", referencedColumnName = "id"))
	private Set<Terminska_lista> terminska_lista=new HashSet<>();//prava terminska lista je u stvari lista pomocn klase Terminska_lista

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getKapacitet() {
		return kapacitet;
	}

	public void setKapacitet(int kapacitet) {
		this.kapacitet = kapacitet;
	}

	public String getOznakaSale() {
		return oznakaSale;
	}

	public void setOznakaSale(String oznakaSale) {
		this.oznakaSale = oznakaSale;
	}

	public Bioskop getBioskop() {
		return bioskop;
	}

	public void setBioskop(Bioskop bioskop) {
		this.bioskop = bioskop;
	}

	@Override
	public String toString() {
		return "Sala [id=" + id + ", kapacitet=" + kapacitet + ", oznakaSale=" + oznakaSale + ", bioskop=" + bioskop
				+ "]";
	}
	
	
	
}
 