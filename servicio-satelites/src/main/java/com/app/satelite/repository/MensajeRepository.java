package com.app.satelite.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.app.satelite.entity.Mensaje;


public interface MensajeRepository extends CrudRepository<Mensaje,Long>{

	@Query(value ="select * from mensajes m where m.id_satelite = :idP",nativeQuery = true)
	public List<Mensaje>findAllbysatelite(@Param ("idP")long idP);
	
}
