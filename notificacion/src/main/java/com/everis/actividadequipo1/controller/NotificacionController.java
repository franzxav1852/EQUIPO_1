package com.everis.actividadequipo1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.actividadequipo1.component.NotificacionComponent;
import com.everis.actividadequipo1.modelo.Producto;
import com.everis.actividadequipo1.response.NotificacionResponse;
import com.everis.actividadequipo1.service.EmailService;
import com.everis.actividadequipo1.utils.Constans;

@RestController
@RequestMapping("/notificacion")
public class NotificacionController {
	
	@Autowired
	private EmailService correoService;
	
	@Autowired
	private Producto producto;
	
	@Autowired
	private NotificacionComponent notificacionComponent;
	
	@PostMapping("/producto")
	public NotificacionResponse enviaConfirmacion(@RequestBody Producto productoRecibido) {
		NotificacionResponse response = new NotificacionResponse();
		response.setSuccessful(false);
		
		if (Constans.EMAILDESTINO.isEmpty()){	
			boolean correo2=correoService.enviarCorreo(Constans.EMAILDESTINO, "Costo y descripcion de " + producto.getIdproducto(), productoRecibido.toString());
			if(correo2) {
				response.setSuccessful(true);
				response.setEmail("email");
				response.setMessage("Correo enviado con exito");
				response.setProducto(productoRecibido);
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