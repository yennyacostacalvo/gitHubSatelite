package com.app.satelite.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



import lombok.Data;

@Data
@Entity
@Table(name = "mensajes")
public class Mensaje {

	@Id
	@Column(name="id")
	private long id;
	@Column(name="mensaje")
	private String mensaje;
	
	@ManyToOne
	@JoinColumn(name="id_satelite")
	private Satelite satelite;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public Satelite getSatelite() {
		return satelite;
	}

	public void setSatelite(Satelite satelite) {
		this.satelite = satelite;
	}
	
	
}
