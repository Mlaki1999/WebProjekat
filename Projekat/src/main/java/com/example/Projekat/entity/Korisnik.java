package com.example.Projekat.entity;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Table;

enum Uloga{gledaoc,menadzer,administrator}
 
@Entity 
@Table(name="Korisnici")
public class Korisnik implements Serializable {

	
	
	@Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	
	@Column(name = "ime")
    private String ime;

    @Column(nullable = false,name="prezime")
    private String prezime;
     
    @Column(name="korisnicko_ime")
    private String korisnicko_ime;
    
    @Column
    private String lozinka;
     
    @Column(name="telefon")
    private String telefon;
      
    @Column(name="email")
    private String email;
    
    @Column(name="datum_rodjenja")
    private Date datum_rodjenja;
    
    @Column(name="uloga")
    private Uloga uloga;
    
    @Column(name="aktivan")
    private String aktivan;
   
    @ManyToMany
    @JoinTable(name = "odgledaniFilmovi",
            joinColumns = @JoinColumn(name = "gledaoc_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "Film_id", referencedColumnName = "id"))
    private Set<Film> odgledaniFilmovi = new HashSet<>();
    
    @ManyToMany
    @JoinTable(name = "rezervisaniFilmovi",
            joinColumns = @JoinColumn(name = "gledaoc_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "Film_id", referencedColumnName = "id"))
    private Set<Film> rezervisaniFilmovi = new HashSet<>();
    
    @OneToMany(mappedBy="gledaoc",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<OcenaFilm> oceneFilmova=new HashSet<>();//jedan gledaoc ima listu ocenjenih filmova
    
    @ManyToMany(mappedBy="zaduzeni",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Bioskop> bioskop=new HashSet<>();//menadzer vise bioskopa, bioskop vise menadzera

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public String getKorisnicko_ime() {
		return korisnicko_ime;
	}

	public void setKorisnicko_ime(String korisnicko_ime) {
		this.korisnicko_ime = korisnicko_ime;
	}

	public String getLozinka() {
		return lozinka;
	}

	public void setLozinka(String lozinka) {
		this.lozinka = lozinka;
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

	public Date getDatum_rodjenja() {
		return datum_rodjenja;
	}

	public void setDatum_rodjenja(Date datum_rodjenja) {
		this.datum_rodjenja = datum_rodjenja;
	}

	public Uloga getUloga() {
		return uloga;
	}

	public void setUloga(Uloga uloga) {
		this.uloga = uloga;
	}

	public String getAktivan() {
		return aktivan;
	}

	public void setAktivan(String aktivan) {
		this.aktivan = aktivan;
	}

	public Set<Film> getOdgledaniFilmovi() {
		return odgledaniFilmovi;
	}

	public void setOdgledaniFilmovi(Set<Film> odgledaniFilmovi) {
		this.odgledaniFilmovi = odgledaniFilmovi;
	}

	public Set<Film> getRezervisaniFilmovi() {
		return rezervisaniFilmovi;
	}

	public void setRezervisaniFilmovi(Set<Film> rezervisaniFilmovi) {
		this.rezervisaniFilmovi = rezervisaniFilmovi;
	}

	public Set<OcenaFilm> getOceneFilmova() {
		return oceneFilmova;
	}

	public void setOceneFilmova(Set<OcenaFilm> oceneFilmova) {
		this.oceneFilmova = oceneFilmova;
	}

	@Override
	public String toString() {
		return "Korisnik [id=" + id + ", ime=" + ime + ", prezime=" + prezime + ", korisnicko_ime=" + korisnicko_ime
				+ ", lozinka=" + lozinka + ", telefon=" + telefon + ", email=" + email + ", datum_rodjenja="
				+ datum_rodjenja + ", uloga=" + uloga + ", aktivan=" + aktivan + "]";
	}

	public Korisnik( String ime, String prezime) {
		super();
	
		this.ime = ime;
		this.prezime = prezime;
	}
    
    
    
    
}
