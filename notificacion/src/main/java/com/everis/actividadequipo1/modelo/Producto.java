package com.everis.actividadequipo1.modelo;
// Generated 3/10/2019 11:53:15 AM by Hibernate Tools 5.2.12.Final

import java.util.HashSet;
import java.util.Set;


/**
 * Producto generated by hbm2java
 */

public class Producto implements java.io.Serializable {

	private int idproducto;
	private String url;
	private String descripcion;
	private double precio;
	private double descuento;
	private int stock;
	
	public Producto() {
	}

	public Producto(int idproducto, String url, String descripcion, double precio, double descuento, int stock) {
		this.idproducto = idproducto;
		this.url = url;
		this.descripcion = descripcion;
		this.precio = precio;
		this.descuento = descuento;
		this.stock = stock;
	}

		
	public int getIdproducto() {
		return this.idproducto;
	}

	public void setIdproducto(int idproducto) {
		this.idproducto = idproducto;
	}

	
	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	//@Column(name = "descripcion", nullable = false, length = 45)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	//@Column(name = "precio", nullable = false, precision = 22, scale = 0)
	public double getPrecio() {
		return this.precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	//@Column(name = "descuento", nullable = false, precision = 22, scale = 0)
	public double getDescuento() {
		return this.descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	//@Column(name = "stock", nullable = false)
	public int getStock() {
		return this.stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

}
