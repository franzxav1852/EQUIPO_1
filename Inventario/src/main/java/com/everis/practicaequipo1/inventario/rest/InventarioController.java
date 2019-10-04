package com.everis.practicaequipo1.inventario.rest;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.everis.practicaequipo1.inventario.model.Inventario;
import com.everis.practicaequipo1.inventario.response.InventarioResponse;
import com.everis.practicaequipo1.inventario.service.InventarioService;

@RestController
@RequestMapping("/inventarios")
public class InventarioController {
	
	@Autowired
	private InventarioService inventarioService;
	
	@GetMapping("/")
	public List<Inventario> listar(){
		return inventarioService.listar();
	}
	
	@GetMapping("/stock/{id}")
	public int stock(@PathVariable int id) {
		return inventarioService.consultarStock(id);
	}
	
	@PostMapping("/")
	@ResponseBody
	public Inventario insertar(@RequestBody Inventario inventario) {
		//InventarioResponse response = new InventarioResponse();
		inventario.setFechahora(new Date());
		return inventarioService.insertar(inventario);
	}

}
