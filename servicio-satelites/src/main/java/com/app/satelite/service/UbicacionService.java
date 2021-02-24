package com.app.satelite.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.app.satelite.entity.Ubicacion;

@Service
public interface UbicacionService {
	
	public List<Ubicacion> findAll();
	public Ubicacion findById(long id);

}
