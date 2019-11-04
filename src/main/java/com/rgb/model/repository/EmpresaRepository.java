package com.rgb.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rgb.model.entity.Empresa;


@Repository
public interface EmpresaRepository 
	extends JpaRepository<Empresa,String>{
}
