package com.everis.actividadequipo1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
	private ProductoService productoService;
	
	@Autowired
	private Configuracion configuracion;
	
//	@Value("${config.descuento1}")
//	private String descuento1;
//	
//	@Value("${config.descuento2}")
//	private String descuento2;
//	
//	@Value("${config.descuento3}")
//	private String descuento3;
	
	
	@GetMapping("/")
	public List<Producto> listar(){
		return productoService.listar();
	}
	
	@PostMapping("/")
	public Producto insertar(@RequestBody Producto producto) {
		
		if(producto.getPrecio() <= 1000) {
			producto.setDescuento(Double.parseDouble(configuracion.getDescuento1()));
		} else if(producto.getPrecio() < 5000 && producto.getPrecio() > 1000) {
			producto.setDescuento(Double.parseDouble(configuracion.getDescuento2()));
		} else if(producto.getPrecio() > 5000 ) {
			producto.setDescuento(Double.parseDouble(configuracion.getDescuento3()));
		}
		
		return productoService.insertar(producto);
	}
}
