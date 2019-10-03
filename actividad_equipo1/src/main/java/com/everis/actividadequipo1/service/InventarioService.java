package com.everis.actividadequipo1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.actividadequipo1.model.Inventario;
import com.everis.actividadequipo1.repository.InventarioRepository;

@Service
public class InventarioService {
	
	@Autowired
	private InventarioRepository inventarioRepository;
	
	public Inventario insertar(Inventario inventario) {
		return inventarioRepository.save(inventario);
	}

}
