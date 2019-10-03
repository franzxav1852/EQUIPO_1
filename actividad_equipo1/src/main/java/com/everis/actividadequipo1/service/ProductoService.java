package com.everis.actividadequipo1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.actividadequipo1.model.Producto;
import com.everis.actividadequipo1.repository.ProductoRepository;

@Service
public class ProductoService {

	@Autowired
	private ProductoRepository productoRepository;
	
	public List<Producto> listar(){
		return productoRepository.findAll();
	}
	
	public Producto insertar(Producto producto) {
		return productoRepository.save(producto);
	}
}
