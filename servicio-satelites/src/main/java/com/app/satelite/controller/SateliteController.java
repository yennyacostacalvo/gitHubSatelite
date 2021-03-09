package com.app.satelite.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.satelite.entity.Satellite;
import com.app.satelite.serviceImpl.SatelliteServiceImpl;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@CrossOrigin(origins = "*", maxAge = 3600)
public class SateliteController {	
	
	@Autowired
	private SatelliteServiceImpl serviceSatelite;
	

	@GetMapping("/topSecret")
	public List<Satellite> listarSatelites(){
		return serviceSatelite.getAllSatellites();
	}
	
	

	
	
	
	
	
	
}
