package com.mast.trupper.sprinboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mast.trupper.sprinboot.model.PedidosDetalleW;
import com.mast.trupper.sprinboot.service.PedidosDetalleWService;

@RestController
@RequestMapping("/api/detalle")
public class PedidosDetalleWController {

	@Autowired
	private PedidosDetalleWService pedidosDetalleService;

	@GetMapping
	public ResponseEntity<?> listar() {
		return ResponseEntity.ok().body(pedidosDetalleService.findAll());
	}

	@PostMapping
	public ResponseEntity<?> crear(@RequestBody PedidosDetalleW pedidosDetalleW) {
		return ResponseEntity.status(HttpStatus.CREATED).body(pedidosDetalleService.save(pedidosDetalleW));
	}

}
