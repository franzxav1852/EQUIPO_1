package com.everis.actividadequipo1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.actividadequipo1.model.Configuracion;
import com.everis.actividadequipo1.model.Producto;
import com.everis.actividadequipo1.service.ProductoService;

@RestController
@RequestMapping("/productos")
public class ProductoController {
	
	@Autowired
	private Configuracion configuracion;

	@Autowired
	private ProductoService productoService;
	
	@GetMapping("/")
	public List<Producto> listar(){
		return productoService.listar();
	}
	
	@PostMapping("/")
	public Producto insertar(@RequestBody Producto producto) {
		
		if(producto.getPrecio() <= 1000) {
			producto.setDescuento(configuracion.getDescuento1());
		} else if(producto.getPrecio() < 5000 && producto.getPrecio() > 1000) {
			producto.setDescuento(configuracion.getDescuento2());
		} else if(producto.getPrecio() > 5000 ) {
			producto.setDescuento(configuracion.getDescuento3());
		}
		return productoService.insertar(producto);
	}
}
