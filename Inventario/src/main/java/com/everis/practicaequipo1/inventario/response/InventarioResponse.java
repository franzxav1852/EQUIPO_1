package com.everis.practicaequipo1.inventario.response;

import com.everis.practicaequipo1.inventario.model.Inventario;

public class InventarioResponse {
	private boolean exito;
	private Inventario inventario;
	private String mensaje;
	public boolean isExito() {
		return exito;
	}
	public void setExito(boolean exito) {
		this.exito = exito;
	}
	public Inventario getInventario() {
		return inventario;
	}
	public void setInventario(Inventario inventario) {
		this.inventario = inventario;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	

}
