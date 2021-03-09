package com.app.satelite.serviceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.app.satelite.entity.Satellite;
import com.app.satelite.entity.SatelliteQuasar;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class SatelliteServiceImpl {

	
	
	ArrayList<String> mensaje = new ArrayList<String>();
	
	List<Satellite>satelite = new ArrayList<>();
	
	SatelliteQuasar ship;
	List<SatelliteQuasar> sateliteQusar = new ArrayList<>();
	
	
	public void inicializarDatos() {
		mensaje.add("este");
		mensaje.add("");
		mensaje.add("");
		mensaje.add("mensaje");
		mensaje.add("");
		
		satelite = new ArrayList<>(Arrays.asList(new Satellite(100.0,"Kenobi",mensaje)));
		
	}
	
	/**
	 * Obtiene los satelites*/	
	public  List<Satellite> getAllSatellites(){
		inicializarDatos();
		return satelite;
	}
	
	public  List<SatelliteQuasar> getAllSatellitesQuasar(){
		inicializarDatos();
		ship.setSatellites(satelite);
		//ship.setPosition([(double) -58.8999999][-69.2222333]);
		sateliteQusar.add(ship);
		return sateliteQusar;
	}
	
	
	
}
