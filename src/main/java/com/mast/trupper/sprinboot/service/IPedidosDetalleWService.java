package com.mast.trupper.sprinboot.service;

import java.util.List;

import com.mast.trupper.sprinboot.model.PedidosDetalleW;

public interface IPedidosDetalleWService {

	List<PedidosDetalleW> findAll();

	PedidosDetalleW save(PedidosDetalleW pedidosDetalleW);

}
