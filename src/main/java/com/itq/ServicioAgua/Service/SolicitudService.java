package com.itq.ServicioAgua.Service;

import java.util.ArrayList;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itq.ServicioAgua.Controller.SolicitudController;
import com.itq.ServicioAgua.Repository.SolicitudRepository;
import com.itq.ServicioAgua.dto.Solicitud;

@Service
public class SolicitudService {
	private final Logger logger = LoggerFactory.getLogger(SolicitudController.class);

	@Autowired
	SolicitudRepository solicitudRepository;
	
	public ArrayList<Solicitud> obtenerSolicitud(){
		return (ArrayList<Solicitud>) solicitudRepository.findAll();
		
	}
	
	public Solicitud crearSolicitud(Solicitud solicitud) {
		return solicitudRepository.save(solicitud);
	}
	
}
