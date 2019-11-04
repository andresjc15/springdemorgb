package com.rgb.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rgb.model.entity.Pedido;
import com.rgb.model.repository.PedidoRepository;
import com.rgb.service.PedidoService;

@Service
public class PedidoServiceImpl implements PedidoService {
	
	@Autowired
	private PedidoRepository CotizacionRepository;
	@Transactional(readOnly = true)
	@Override
	public List<Pedido> findAll() throws Exception {
		// TODO Auto-generated method stub
		return CotizacionRepository.findAll();
	}
	@Transactional(readOnly = true)
	@Override
	public Optional<Pedido> findById(Integer  id) throws Exception {
		// TODO Auto-generated method stub
		return CotizacionRepository.findById(id);
	}
	@Transactional
	@Override
	public Pedido save(Pedido entity) throws Exception {
		// TODO Auto-generated method stub
		return CotizacionRepository.save(entity);
	}
	@Transactional
	@Override
	public Pedido update(Pedido entity) throws Exception {
		// TODO Auto-generated method stub
		return CotizacionRepository.save(entity);
	}
	
	@Transactional
	@Override
	public void deleteById(Integer  id) throws Exception {
		// TODO Auto-generated method stub
		CotizacionRepository.deleteById(id);
	}
	@Transactional
	@Override
	public void deleteAll() throws Exception {
		// TODO Auto-generated method stub
		CotizacionRepository.deleteAll();
	}

}