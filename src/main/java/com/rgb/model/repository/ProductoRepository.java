package com.rgb.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rgb.model.entity.Producto;


@Repository
public interface ProductoRepository 
	extends JpaRepository<Producto,Integer>{
}
