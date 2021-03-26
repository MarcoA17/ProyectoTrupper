package com.mast.trupper.sprinboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mast.trupper.sprinboot.model.PedidosW;
import com.mast.trupper.sprinboot.repository.IPedidosWRepository;

@Service
public class PedidosWService implements IPedidosWService {

	@Autowired
	private IPedidosWRepository pedidosRepository;

	@Override
	public List<PedidosW> findAll() {

		return (List<PedidosW>) pedidosRepository.findAll();
	}

	@Override
	public PedidosW findById(Long id) {
		return pedidosRepository.findById(id).orElse(null);
	}

	@Override
	public PedidosW save(PedidosW pedidosw) {
		return pedidosRepository.save(pedidosw);
	}

}
