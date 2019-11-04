package com.rgb.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rgb.model.entity.Evento;
import com.rgb.model.repository.EventoRepository;
import com.rgb.service.EventoService;

@Service
public class EventoServiceImpl implements EventoService {
	
	@Autowired
	private EventoRepository EventoRepository;
	
	@Override
	public List<Evento> findAll() throws Exception {
		// TODO Auto-generated method stub
		return EventoRepository.findAll();
	}

	@Override
	public Optional<Evento> findById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return EventoRepository.findById(id);
	}

	@Override
	public Evento save(Evento entity) throws Exception {
		// TODO Auto-generated method stub
		return EventoRepository.save(entity);
	}

	@Override
	public Evento update(Evento entity) throws Exception {
		// TODO Auto-generated method stub
		return EventoRepository.save(entity);
	}
	

	@Override
	public void deleteById(Integer  id) throws Exception {
		// TODO Auto-generated method stub
		EventoRepository.deleteById(id);
	}

	@Override
	public void deleteAll() throws Exception {
		// TODO Auto-generated method stub
		EventoRepository.deleteAll();
	}

}