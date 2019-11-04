package com.rgb.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rgb.model.entity.Paquete;
import com.rgb.model.repository.PaqueteRepository;
import com.rgb.service.PaqueteService;

@Service
public class PaqueteServiceImpl implements PaqueteService {
	
	@Autowired
	private PaqueteRepository PaqueteRepository;
	@Override
	public List<Paquete> findAll() throws Exception {
		// TODO Auto-generated method stub
		return PaqueteRepository.findAll();
	}

	@Override
	public Optional<Paquete> findById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return PaqueteRepository.findById(id);
	}

	@Override
	public Paquete save(Paquete entity) throws Exception {
		// TODO Auto-generated method stub
		return PaqueteRepository.save(entity);
	}

	@Override
	public Paquete update(Paquete entity) throws Exception {
		// TODO Auto-generated method stub
		return PaqueteRepository.save(entity);
	}
	

	@Override
	public void deleteById(Integer  id) throws Exception {
		// TODO Auto-generated method stub
		PaqueteRepository.deleteById(id);
	}

	@Override
	public void deleteAll() throws Exception {
		// TODO Auto-generated method stub
		PaqueteRepository.deleteAll();
	}

}