package com.everis.actividadequipo1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.everis.actividadequipo1.model.Inventario;

@Repository
public interface InventarioRepository extends JpaRepository<Inventario, Integer>{

}
