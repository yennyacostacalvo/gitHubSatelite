package com.app.satelite.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.app.satelite.dto.MensajeDto;

@Service
public interface MensajeService {

	public List<MensajeDto> findAll();
	
	public List<MensajeDto> findById(long id);
}
