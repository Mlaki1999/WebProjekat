
package com.example.Projekat.entity.dto;

public class BioskopDTO {
	private Long id;
	private String naziv;

	public BioskopDTO(String naziv) {
		super();
		this.naziv = naziv;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public BioskopDTO() {
		super();
	}

	public BioskopDTO(Long id, String naziv) {
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
	
}