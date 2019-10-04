package com.everis.actividadequipo1.modelo;
// Generated 3/10/2019 11:53:15 AM by Hibernate Tools 5.2.12.Final

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Inventario implements java.io.Serializable {

	private Integer id;
	@JsonIgnore
	private Producto producto;
	private Date fechahora;
	private int cantidad;

	public Inventario() {
	}

	public Inventario(Producto producto, Date fechahora, int cantidad) {
		this.producto = producto;
		this.fechahora = fechahora;
		this.cantidad = cantidad;
	}
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Producto getProducto() {
		return this.producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Date getFechahora() {
		return this.fechahora;
	}

	public void setFechahora(Date fechahora) {
		this.fechahora = fechahora;
	}

	public int getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

}
