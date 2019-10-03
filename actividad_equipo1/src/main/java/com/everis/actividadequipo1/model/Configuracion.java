package com.everis.actividadequipo1.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("config")
public class Configuracion {
	
	private String descuento1;
	private String descuento2;
	private String descuento3;
	public String getDescuento1() {
		return descuento1;
	}
	public void setDescuento1(String descuento1) {
		this.descuento1 = descuento1;
	}
	public String getDescuento2() {
		return descuento2;
	}
	public void setDescuento2(String descuento2) {
		this.descuento2 = descuento2;
	}
	public String getDescuento3() {
		return descuento3;
	}
	public void setDescuento3(String descuento3) {
		this.descuento3 = descuento3;
	}
	
	
}
