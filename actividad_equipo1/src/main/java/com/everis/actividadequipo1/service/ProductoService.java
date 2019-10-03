package com.everis.actividadequipo1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.actividadequipo1.model.Configuracion;
import com.everis.actividadequipo1.model.Producto;
import com.everis.actividadequipo1.repository.ProductoRepository;

@Service
public class ProductoService {

	@Autowired
	private ProductoRepository productoRepository;
	
	@Autowired
	private Configuracion configuracion;
	
	public List<Producto> listar(){
		return productoRepository.findAll();
	}
	
	public Producto insertar(Producto producto) {
		if(producto.getPrecio() <= 1000) {
			producto.setDescuento(configuracion.getDescuento1());
		} else if(producto.getPrecio() < 5000 && producto.getPrecio() > 1000) {
			producto.setDescuento(configuracion.getDescuento2());
		} else if(producto.getPrecio() > 5000 ) {
			producto.setDescuento(configuracion.getDescuento3());
		}
		return productoRepository.save(producto);
	}
}
