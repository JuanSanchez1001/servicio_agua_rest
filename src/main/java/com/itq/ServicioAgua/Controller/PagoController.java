package com.itq.ServicioAgua.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itq.ServicioAgua.Service.PagoService;
import com.itq.ServicioAgua.dto.Pago;

@RestController
@RequestMapping("/pagos")
public class PagoController {
	@Autowired
	PagoService pagoService;
	//Mostrar todos los pagos existentes
	@GetMapping()
	public ArrayList<Pago> obtenerPagos(){
		return pagoService.obtenerPago();
	}
	//Mostrar un pago por id
	@GetMapping(path = "/{id}")
	public Pago obtenerPagosPorId(@PathVariable("id") Long id){
		return this.pagoService.obtenerPagoPorId(id);
	}
	//Agregar un nuevo Pago
	@PostMapping(value="/pagos", consumes="application/json", produces = "application/json")
	public Pago crearPago(@RequestBody Pago pago) {
		return this.pagoService.crearPago(pago);
	}
	//Actualizar pago
	@PutMapping("/pagos/{id}")
    public ResponseEntity<String> actualizarPago(@PathVariable("id") Long id, @RequestBody Pago pagoActualizado) {
        Pago pagoExistente = pagoService.obtenerPagoPorId(id);
        if (pagoExistente == null) {
            return new ResponseEntity<>("El pago con el ID " + id + " no existe.", HttpStatus.NOT_FOUND);
        }
        pagoService.actualizarPago(pagoExistente, pagoActualizado);
        return new ResponseEntity<>("El pago con el ID " + id + " ha sido actualizado correctamente.", HttpStatus.OK);
    }
}
