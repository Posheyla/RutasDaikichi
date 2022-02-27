package com.codingdojo.ControladorRutas;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorRutas {
	
	@RequestMapping(value="/daikichi",method=RequestMethod.GET)
	public String paginaInicio() {
		return "Welcome!";
	}
	
	@RequestMapping(value="/daikichi/travel/{nombre}", method=RequestMethod.GET)
	public String paginaTravel(@PathVariable("nombre") String nombre) {
		String respuesta = "";
		respuesta += "<div>"+ "¡Felicidades!, pronto viajrás a "+ nombre + "</div>";
		return respuesta;
	}

	@RequestMapping(value="/daikichi/lotto/{numero}", method=RequestMethod.GET)
	public String paginaTravel(@PathVariable("numero") int numero) {
		String respuesta = "";
		if (numero % 2 == 0) {
			respuesta += "<div>Harás un gran viaje en un futuro cercano, pero ten cuidado con las ofertas tentadoras</div>";
		}
		else {
			respuesta += "<div>Has disfrutado de los frutos de tu trabajo, pero ahora es un buen momento para pasar tiempo con familiares y amigos</div>";
		}
		
		return respuesta;
	}
}
