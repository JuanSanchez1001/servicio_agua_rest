package com.itq.ServicioAgua.Controller;

import java.util.ArrayList;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.itq.ServicioAgua.Service.SolicitudService;
import com.itq.ServicioAgua.dto.Solicitud;
import com.itq.ServicioAgua.dto.Ack;


@RestController
@RequestMapping("/solicitud")
public class SolicitudController {
	private final Logger logger = LoggerFactory.getLogger(SolicitudController.class);
	
	@Autowired //Auto instancia los metodos
	SolicitudService solicitudService;
	
	@GetMapping()//"/idSolicitud"
	public ArrayList<Solicitud> obetenerSolicitud() {//@RequestParam(value="idSolicitud") int idSolicitud	
		return solicitudService.obtenerSolicitud();
		
	}
	
	@PostMapping()
	public Solicitud crearSolicitud(@RequestBody Solicitud solicitud) {
			return this.solicitudService.crearSolicitud(solicitud);
	}
	
	
}
