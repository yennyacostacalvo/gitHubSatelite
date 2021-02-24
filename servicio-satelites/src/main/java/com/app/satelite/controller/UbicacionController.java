package com.app.satelite.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.satelite.entity.Ubicacion;
import com.app.satelite.service.UbicacionService;

@RestController
public class UbicacionController {
	
	
	@Autowired
	private UbicacionService ubicacionService;
	
	@GetMapping("/listarUbicacion")
	public List<Ubicacion> listar(){
		return ubicacionService.findAll();
	}
	

}
