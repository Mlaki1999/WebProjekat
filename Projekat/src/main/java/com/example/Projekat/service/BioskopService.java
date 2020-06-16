
package com.example.Projekat.service;

import com.example.Projekat.entity.Bioskop;

public interface BioskopService {

	Bioskop create(Bioskop bioskop) throws Exception;
	
	Bioskop findOne(Long id);
	
}