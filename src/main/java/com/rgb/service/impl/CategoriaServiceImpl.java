package com.rgb.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rgb.model.entity.Categoria;
import com.rgb.model.repository.CategoriaRepository;
import com.rgb.service.CategoriaService;

@Service
public class CategoriaServiceImpl implements CategoriaService {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Override
	public List<Categoria> findAll() throws Exception {
		// TODO Auto-generated method stub
		return categoriaRepository.findAll();
	}

	@Override
	public Optional<Categoria> findById(String  id) throws Exception {
		// TODO Auto-generated method stub
		return categoriaRepository.findById(id);
	}

	@Override
	public Categoria save(Categoria entity) throws Exception {
		// TODO Auto-generated method stub
		return categoriaRepository.save(entity);
	}

	@Override
	public Categoria update(Categoria entity) throws Exception {
		// TODO Auto-generated method stub
		return categoriaRepository.save(entity);
	}
	

	@Override
	public void deleteById(String  id) throws Exception {
		// TODO Auto-generated method stub
		categoriaRepository.deleteById(id);
	}

	@Override
	public void deleteAll() throws Exception {
		// TODO Auto-generated method stub
		categoriaRepository.deleteAll();
	}

}
