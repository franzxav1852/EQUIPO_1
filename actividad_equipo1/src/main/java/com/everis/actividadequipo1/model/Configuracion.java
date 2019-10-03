package com.everis.actividadequipo1.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("config")
public class Configuracion {
	
	private Double descuento1;
	private Double descuento2;
	private Double descuento3;
	
	public Double getDescuento1() {
		return descuento1;
	}
	public void setDescuento1(Double descuento1) {
		this.descuento1 = descuento1;
	}
	public Double getDescuento2() {
		return descuento2;
	}
	public void setDescuento2(Double descuento2) {
		this.descuento2 = descuento2;
	}
	public Double getDescuento3() {
		return descuento3;
	}
	public void setDescuento3(Double descuento3) {
		this.descuento3 = descuento3;
	}
	
	
}
