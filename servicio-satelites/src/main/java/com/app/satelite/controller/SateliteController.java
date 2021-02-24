package com.app.satelite.controller;



import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.satelite.dto.MensajeDto;
import com.app.satelite.dto.SateliteDto;
import com.app.satelite.service.MensajeService;
import com.app.satelite.service.SateliteService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@CrossOrigin(origins = "*", maxAge = 3600)
public class SateliteController {	
	
	@Autowired
	private SateliteService sateliteService;
	
	@Autowired
	private MensajeService mensajeService;
	
	
	
	@GetMapping("/topSecret")
	public List<SateliteDto> listarDto(){
		return sateliteService.findAllAll().stream().map(producto ->{
			SateliteDto dto =new SateliteDto();
			dto.setName(producto.getName());
			dto.setDistance(producto.getDistance());
			dto.setMensaje(obtenerMensaje(producto.getId()));
			return dto;
		}).collect(Collectors.toList());
	}
	
	
	public List<MensajeDto>  obtenerMensaje(Long idSatelite) {
		MensajeDto mensaje = new MensajeDto();
		return mensajeService.findById(idSatelite).stream().map(producto ->{
			mensaje.setMensaje(producto.getMensaje());
			return mensaje;
		}).collect(Collectors.toList());
	}
	
	
	
	
	
	
	
}
