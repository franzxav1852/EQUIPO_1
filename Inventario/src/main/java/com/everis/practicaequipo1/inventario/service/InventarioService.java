package com.everis.practicaequipo1.inventario.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.practicaequipo1.inventario.model.Inventario;
import com.everis.practicaequipo1.inventario.repository.InventarioRepository;

@Service
public class InventarioService {
	
	@Autowired
	private InventarioRepository inventarioRepository;
	
	public int consultarStock(int id) {
		int stock = 0;
		List<Inventario> inventarios = inventarioRepository.findByidproducto(id);
		for(Inventario inventario : inventarios) {
			stock += inventario.getCantidad();
		}
		return stock;
	}
	
	public Inventario insertar(Inventario inventario) {
		int stock = consultarStock(inventario.getProducto().getIdproducto());
		if(inventario.getCantidad() < 0) {
			if(inventario.getCantidad() > stock) {
				return inventarioRepository.save(inventario);
			} else {
			return null;
			}
		}
		return inventarioRepository.save(inventario);
	}
	
	public List<Inventario> listar(){
		return inventarioRepository.findAll();
	}
	
	public Inventario actualizar(Inventario inventario) {
		return inventarioRepository.save(inventario);
	}

}
