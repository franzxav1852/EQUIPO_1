package com.everis.practicaequipo1.inventario.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.everis.practicaequipo1.inventario.model.Inventario;

@Repository
public interface InventarioRepository extends JpaRepository<Inventario, Integer>{
	
	//Consulta personalziada, busca por id de producto
	 List<Inventario> findByproducto_idproducto(Integer producto_idproducto);

}
