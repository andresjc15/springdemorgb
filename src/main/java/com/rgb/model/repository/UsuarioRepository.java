package com.rgb.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rgb.model.entity.Usuario;


@Repository
public interface UsuarioRepository 
	extends JpaRepository<Usuario,Integer>{
}
