package com.example.Projekat.entity.dto;



public class KorisnikDTO {
	private Long id;
	private String ime;
	private String prezime;
	//private Uloga uloga;
	
	
	 public KorisnikDTO() {
	   
	 }

	public KorisnikDTO(Long id, String ime, String prezime) {
		super();
		this.id = id;
		this.ime = ime;
		this.prezime = prezime;
		
	}

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


	 
}
