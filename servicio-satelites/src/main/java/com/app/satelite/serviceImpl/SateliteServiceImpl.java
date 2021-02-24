package com.app.satelite.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.satelite.dto.SateliteDto;
import com.app.satelite.entity.Satelite;
import com.app.satelite.repository.SateliteRepository;
import com.app.satelite.service.SateliteService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class SateliteServiceImpl implements SateliteService{

	
	@Autowired
	private SateliteRepository sateliteRepository;
	
	@Override
	@Transactional(readOnly=true)
	public List<SateliteDto> findAll() {
		// TODO Auto-generated method stub
		List<Satelite> sateliteEntity =(List<Satelite>) sateliteRepository.findAll();
		
		return entitytoDto(sateliteEntity);
	}
	
	private List<SateliteDto> entitytoDto(List<Satelite> entity)
	{
		List<SateliteDto> sateliteDto = new ArrayList<>();
		entity.stream().forEach(campo -> {
			SateliteDto dto = new SateliteDto();
			dto.setDistance(campo.getDistance());
			dto.setName(campo.getName());
			sateliteDto.add(dto);
		});
		
		return sateliteDto;
		
	}
	@Override
	public Satelite findById(long id) {
		// TODO Auto-generated method stub
		return sateliteRepository.findById(id).orElse(null);
	}
	
	
	@Transactional(readOnly=true)
	public List<Satelite> findAllAll() {
		// TODO Auto-generated method stub
		
		
		return (List<Satelite>)sateliteRepository.findAll() ;
	}

}
