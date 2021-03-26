package com.mast.trupper.sprinboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mast.trupper.sprinboot.model.PedidosW;
import com.mast.trupper.sprinboot.service.PedidosWService;

@RestController
@RequestMapping("/api/pedidosw")
public class PedidosWController {

	@Autowired
	private PedidosWService pedidosService;

	@GetMapping
	public ResponseEntity<?> listarPediosw() {
		return ResponseEntity.ok().body(pedidosService.findAll());
	}

	@GetMapping("/{id}")
	public ResponseEntity<?> buscarPorId(Long id) {
		PedidosW pedidosw = pedidosService.findById(id);
		if (pedidosw == null) {
			return ResponseEntity.noContent().build();
		}

		return ResponseEntity.ok().body(pedidosw);
	}
	
	@PostMapping
	public ResponseEntity<?> crearPedido(@RequestBody PedidosW pedidosw){
		return ResponseEntity.status(HttpStatus.CREATED).body(pedidosService.save(pedidosw));
	}

}
