package com.rgb.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rgb.model.entity.Servicio;
import com.rgb.model.repository.ServicioRepository;
import com.rgb.service.ServicioService;

@Service
public class ServicioServiceImpl implements ServicioService {
	
	@Autowired
	private ServicioRepository ServicioRepository;
	@Override
	public List<Servicio> findAll() throws Exception {
		// TODO Auto-generated method stub
		return ServicioRepository.findAll();
	}

	@Override
	public Optional<Servicio> findById(String  id) throws Exception {
		// TODO Auto-generated method stub
		return ServicioRepository.findById(id);
	}

	@Override
	public Servicio save(Servicio entity) throws Exception {
		// TODO Auto-generated method stub
		return ServicioRepository.save(entity);
	}

	@Override
	public Servicio update(Servicio entity) throws Exception {
		// TODO Auto-generated method stub
		return ServicioRepository.save(entity);
	}
	

	@Override
	public void deleteById(String  id) throws Exception {
		// TODO Auto-generated method stub
		ServicioRepository.deleteById(id);
	}

	@Override
	public void deleteAll() throws Exception {
		// TODO Auto-generated method stub
		ServicioRepository.deleteAll();
	}

}