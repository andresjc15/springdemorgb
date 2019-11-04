package com.rgb.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rgb.model.entity.Categoria;


@Repository
public interface CategoriaRepository 
	extends JpaRepository<Categoria,String>{
}
