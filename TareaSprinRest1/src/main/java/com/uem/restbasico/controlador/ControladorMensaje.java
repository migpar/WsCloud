package com.uem.restbasico.controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uem.restbasico.modelo.entidad.Videojuego;
@RestController
public class ControladorMensaje {

	private Videojuego v1, v2;

	@GetMapping("videojuegos")
	public String videojuegos() {
		Videojuego v1 = new Videojuego();
		v1.setId(1);
		v1.setNombre("Nier Automata");
		v1.setPrecio(69.99);
		v1.setCompañia("Square Enix");
		Videojuego v2 = new Videojuego();
		v2.setId(2);
		v2.setNombre("Hollow Knight: Silksong");
		v2.setPrecio(29.99);
		v2.setCompañia("Team Cherry");
		this.v1 = v1;
		this.v2 = v2;
		StringBuffer buffer = new StringBuffer();
		buffer.append("<!DOCTYPE html>");
		buffer.append("<html>");
		buffer.append("<head>");
		buffer.append("</head>");
		buffer.append("<body>");
		buffer.append("<h1 style='color:red'>LISTA VIDEJUEGOS</h1><p>");
		buffer.append(v1.toString() + "<br>");
		buffer.append(v2.toString());
		buffer.append("</p></body>");
		buffer.append("</html>");
		return buffer.toString();
	}
	
	@PutMapping("videojuegos")
	public String modificarVidejuegos() {
		v1.setPrecio(v1.getPrecio()+10);
		v2.setPrecio(v2.getPrecio()-5);
		return "Precios actualizados\n" + v1.toString() + "\n" + v2.toString();
	}

}
