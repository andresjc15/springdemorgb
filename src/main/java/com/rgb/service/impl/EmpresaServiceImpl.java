package com.rgb.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rgb.model.entity.Empresa;
import com.rgb.model.repository.EmpresaRepository;
import com.rgb.service.EmpresaService;

@Service
public class EmpresaServiceImpl implements EmpresaService {
	
	@Autowired
	private EmpresaRepository EmpresaRepository;
	
	@Override
	public List<Empresa> findAll() throws Exception {
		// TODO Auto-generated method stub
		return EmpresaRepository.findAll();
	}

	@Override
	public Optional<Empresa> findById(String id) throws Exception {
		// TODO Auto-generated method stub
		return EmpresaRepository.findById(id);
	}

	@Override
	public Empresa save(Empresa entity) throws Exception {
		// TODO Auto-generated method stub
		return EmpresaRepository.save(entity);
	}

	@Override
	public Empresa update(Empresa entity) throws Exception {
		// TODO Auto-generated method stub
		return EmpresaRepository.save(entity);
	}
	

	@Override
	public void deleteById(String  id) throws Exception {
		// TODO Auto-generated method stub
		EmpresaRepository.deleteById(id);
	}

	@Override
	public void deleteAll() throws Exception {
		// TODO Auto-generated method stub
		EmpresaRepository.deleteAll();
	}

}