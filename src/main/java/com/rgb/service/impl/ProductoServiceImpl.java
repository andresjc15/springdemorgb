package com.rgb.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rgb.model.entity.Producto;
import com.rgb.model.repository.ProductoRepository;
import com.rgb.service.ProductoService;

@Service
public class ProductoServiceImpl implements ProductoService {
	
	@Autowired
	private ProductoRepository ProductoRepository;
	
	@Override
	public List<Producto> findAll() throws Exception {
		// TODO Auto-generated method stub
		return ProductoRepository.findAll();
	}

	@Override
	public Optional<Producto> findById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return ProductoRepository.findById(id);
	}

	@Override
	public Producto save(Producto entity) throws Exception {
		// TODO Auto-generated method stub
		return ProductoRepository.save(entity);
	}

	@Override
	public Producto update(Producto entity) throws Exception {
		// TODO Auto-generated method stub
		return ProductoRepository.save(entity);
	}
	

	@Override
	public void deleteById(Integer  id) throws Exception {
		// TODO Auto-generated method stub
		ProductoRepository.deleteById(id);
	}

	@Override
	public void deleteAll() throws Exception {
		// TODO Auto-generated method stub
		ProductoRepository.deleteAll();
	}

}