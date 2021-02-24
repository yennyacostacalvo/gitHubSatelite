package com.app.satelite.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.app.satelite.entity.Ubicacion;
import com.app.satelite.repository.UbicacionRepository;
import com.app.satelite.service.UbicacionService;

@Service
public class UbicacionServiceImpl implements UbicacionService {

	private UbicacionRepository ubicacionrepository;
	
	@Override
	public List<Ubicacion> findAll() {
		// TODO Auto-generated method stub
		return (List<Ubicacion>)ubicacionrepository.findAll();
	}

	@Override
	public Ubicacion findById(long id) {
		// TODO Auto-generated method stub
		return ubicacionrepository.findById(id).orElse(null) ;
	}

}
