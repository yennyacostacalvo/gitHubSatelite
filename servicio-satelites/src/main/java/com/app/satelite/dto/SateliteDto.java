package com.app.satelite.dto;



import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class SateliteDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2537121327285613355L;
	private Double distance;
	private String name;
	private List<MensajeDto> mensaje;
	
	public Double getDistance() {
		return distance;
	}
	public void setDistance(Double distance) {
		this.distance = distance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void setMensaje(List<MensajeDto> mensaje) {
		this.mensaje = mensaje;
	}
	public List<MensajeDto> getMensaje() {
		return mensaje;
	}
}
