package com.app.satelite.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.satelite.dto.MensajeDto;
import com.app.satelite.entity.Mensaje;
import com.app.satelite.repository.MensajeRepository;
import com.app.satelite.service.MensajeService;

import lombok.extern.slf4j.Slf4j;
@Service
@Slf4j
public class MensajeServiceImpl implements MensajeService{
	@Autowired
	private MensajeRepository mensajeRepository;
	
	
	@Transactional(readOnly=true)
	public List<MensajeDto> findAll() {
		// TODO Auto-generated method stub
		List<Mensaje> mensajeEntity = (List<Mensaje>) mensajeRepository.findAll();
			
		return entitytoDto(mensajeEntity);
	}
	
	private List<MensajeDto> entitytoDto(List<Mensaje> entity)
	{
		MensajeDto dto = new MensajeDto();
		List<MensajeDto> mensajeDto = new ArrayList<>();
		entity.stream().forEach(campo -> {
			dto.setMensaje(campo.getMensaje());
			mensajeDto.add(dto);
		});
		
		return mensajeDto;
		
	}
	
	public List<MensajeDto> findById(long id){
	List<Mensaje> mensajeEntity = (List<Mensaje>) mensajeRepository.findAllbysatelite(id);
	return 	entitytoDto(mensajeEntity);
		
	}
}
