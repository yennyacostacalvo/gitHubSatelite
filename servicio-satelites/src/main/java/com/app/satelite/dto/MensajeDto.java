package com.app.satelite.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class MensajeDto implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String mensaje;

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}



}
