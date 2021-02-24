package com.app.satelite.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.app.satelite.dto.SateliteDto;
import com.app.satelite.entity.Satelite;

@Service
public interface SateliteService {
	
	public List<SateliteDto> findAll();
	public Satelite findById(long id);
	public List<Satelite> findAllAll();

}
