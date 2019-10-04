package com.everis.actividadequipo1.request;

import java.util.List;

import com.everis.actividadequipo1.modelo.Producto;

public class ProductoRequest {
	
	private String correo;
	private List<Producto> productos;
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public List<Producto> getProductos() {
		return productos;
	}
	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	
	
}
