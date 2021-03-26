package com.mast.trupper.sprinboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mast.trupper.sprinboot.model.PedidosDetalleW;
import com.mast.trupper.sprinboot.repository.IPedidosDetalleWRepository;

@Service
public class PedidosDetalleWService implements IPedidosDetalleWService {

	@Autowired
	private IPedidosDetalleWRepository pedidosDetalleRepo;

	@Override
	public List<PedidosDetalleW> findAll() {
		// TODO Auto-generated method stub
		return (List<PedidosDetalleW>) pedidosDetalleRepo.findAll();
	}

	@Override
	public PedidosDetalleW save(PedidosDetalleW pedidosDetalleW) {
		// TODO Auto-generated method stub
		return pedidosDetalleRepo.save(pedidosDetalleW);
	}

}
