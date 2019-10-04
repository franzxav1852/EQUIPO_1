package com.everis.actividadequipo1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.everis.actividadequipo1.modelo.Producto;
import com.everis.actividadequipo1.request.ProductoRequest;
import com.everis.actividadequipo1.response.NotificacionResponse;
import com.everis.actividadequipo1.service.EmailService;


@RestController
@RequestMapping("/notificacion")
public class NotificacionController {
	
	@Autowired
	private EmailService correoService;
	

	
	@PostMapping("/producto")
	public NotificacionResponse enviaConfirmacion(@RequestBody ProductoRequest productoRequest) {
		NotificacionResponse response = new NotificacionResponse();
		response.setSuccessful(false);
		List<Producto> productos = productoRequest.getProductos();
		String infoProducto = "";
		for (Producto productoObtenido : productos) {
			infoProducto = infoProducto+"<h1>idProducto: "+productoObtenido.getIdproducto()+"</h1></br>"
					+"<h2>Precio: "+productoObtenido.getPrecio()+"</h2></br>"
					+"<h2>Descuento: "+productoObtenido.getDescuento()+"</h2></br>"
					+"<h3>Descripcion: "+productoObtenido.getDescripcion()+"</h3></br>"
					+"<img src=\""+productoObtenido.getUrl() +"\">";
			}
		
		if (productoRequest.getCorreo().isEmpty()){	
			boolean correo2=correoService.enviarCorreo(productoRequest.getCorreo(), "catalogo", infoProducto);
			if(correo2) {
				response.setSuccessful(true);
				response.setEmail("email");
				response.setMessage("Correo enviado con exito a: "+productoRequest.getCorreo());
				response.setProductos(productos);
				return response;	
			}
			else {
				response.setSuccessful(false);
				response.setEmail("Imposible enviar email");
				return response;	
			}	
	
		}
		return response;
	}
}