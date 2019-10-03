package com.everis.actividadequipo1.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.actividadequipo1.model.Inventario;
import com.everis.actividadequipo1.service.InventarioService;

@RestController
@RequestMapping("/inventarios")
public class InventarioController {
	
	@Autowired
	private InventarioService inventarioService;
	
	@PostMapping("/")
	public Inventario insertar(@RequestBody Inventario inventario) {
		
		inventario.setFechahora(new Date());
		return inventarioService.insertar(inventario);
	}

}
