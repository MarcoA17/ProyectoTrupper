package com.mast.trupper.sprinboot.service;

import java.util.List;

import com.mast.trupper.sprinboot.model.PedidosW;

public interface IPedidosWService {
	
	List<PedidosW> findAll();
	
	PedidosW findById(Long id);
	
	PedidosW save(PedidosW pedidosw);

}
