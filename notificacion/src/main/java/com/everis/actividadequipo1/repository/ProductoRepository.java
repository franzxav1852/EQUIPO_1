package com.everis.actividadequipo1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.everis.actividadequipo1.modelo.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer>{
	
	

}
