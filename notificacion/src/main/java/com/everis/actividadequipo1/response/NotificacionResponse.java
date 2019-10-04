package com.everis.actividadequipo1.response;

import java.util.List;

import com.everis.actividadequipo1.modelo.Producto;

public class NotificacionResponse {
	
	private boolean successful;
	private String email; 
	private List<Producto> productos;
	private String message;
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public boolean isSuccessful() {
		return successful;
	}
	public void setSuccessful(boolean successful) {
		this.successful = successful;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<Producto> getProductos() {
		return productos;
	}
	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	

}
