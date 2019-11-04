package com.rgb.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rgb.model.entity.Paquete;


@Repository
public interface PaqueteRepository 
	extends JpaRepository<Paquete,Integer>{
}
