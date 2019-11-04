package com.rgb.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rgb.model.entity.Usuario;
import com.rgb.model.repository.UsuarioRepository;
import com.rgb.service.UsuarioService;
@Service
public class UsuarioServiceImpl implements UsuarioService {
	
	@Autowired
	private UsuarioRepository UsuarioRepository;
	
	@Override
	public List<Usuario> findAll() throws Exception {
		// TODO Auto-generated method stub
		return UsuarioRepository.findAll();
	}

	@Override
	public Optional<Usuario> findById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return UsuarioRepository.findById(id);
	}

	@Override
	public Usuario save(Usuario entity) throws Exception {
		// TODO Auto-generated method stub
		return UsuarioRepository.save(entity);
	}

	@Override
	public Usuario update(Usuario entity) throws Exception {
		// TODO Auto-generated method stub
		return UsuarioRepository.save(entity);
	}
	

	@Override
	public void deleteById(Integer  id) throws Exception {
		// TODO Auto-generated method stub
		UsuarioRepository.deleteById(id);
	}

	@Override
	public void deleteAll() throws Exception {
		// TODO Auto-generated method stub
		UsuarioRepository.deleteAll();
	}

}