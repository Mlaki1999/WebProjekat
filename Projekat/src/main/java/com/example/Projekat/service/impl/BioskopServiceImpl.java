
package com.example.Projekat.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Projekat.entity.Bioskop;
import com.example.Projekat.repository.BioskopRepository;
import com.example.Projekat.service.BioskopService;

@Service
public class BioskopServiceImpl implements BioskopService {
	
	@Autowired
	private BioskopRepository bioskopRepository;

	@Override
	public Bioskop create(Bioskop bioskop) throws Exception {
		if (bioskop.getId() != null) {
            throw new Exception("ID must be null!");
        }
        Bioskop newBioskop = this.bioskopRepository.save(bioskop);
        return newBioskop;
	}

	@Override
	public Bioskop findOne(Long id) {
		// TODO Auto-generated method stub
		Bioskop bioskop=this.bioskopRepository.getOne(id);
		return bioskop;
	}

}