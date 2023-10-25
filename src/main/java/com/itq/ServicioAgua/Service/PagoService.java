package com.itq.ServicioAgua.Service;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itq.ServicioAgua.Controller.PagoController;
import com.itq.ServicioAgua.Repository.PagosRepository;
import com.itq.ServicioAgua.dto.Pago;

@Service
public class PagoService {
	//private static final Logger LOGGER = LoggerFactory.getLogger(PagoController.class);
	
	@Autowired
	PagosRepository pagoRepository;
	
	public ArrayList<Pago> obtenerPago(){
		return (ArrayList<Pago>) pagoRepository.findAll();
	}
	
	public Pago crearPago(Pago pago) {
		return pagoRepository.save(pago);
	}
	
	public Pago obtenerPagoPorId(Long id) {
        return pagoRepository.findById(id).orElse(null);
    }
	
	public void actualizarPago(Pago pagoExistente, Pago pagoActualizado) {
        // Realizar la lógica de actualización necesaria en el objeto "pagoExistente"
        pagoExistente.setMonto(pagoActualizado.getMonto());
        pagoExistente.setEstado(pagoActualizado.getEstado());
        pagoRepository.save(pagoExistente);
    }
}

