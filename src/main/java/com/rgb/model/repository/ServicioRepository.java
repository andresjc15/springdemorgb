package com.rgb.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rgb.model.entity.Servicio;


@Repository
public interface ServicioRepository 
	extends JpaRepository<Servicio,String>{
}
