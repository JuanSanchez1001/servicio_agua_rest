package com.itq.ServicioAgua.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itq.ServicioAgua.Service.TanqueService;
import com.itq.ServicioAgua.dto.Tanque;

@RestController
@RequestMapping("/tanque")
public class TanqueController {
	
	@Autowired
	TanqueService tanqueService;
	
	@GetMapping()
	public ArrayList<Tanque>obtenerTanques(){
	
		return tanqueService.obtenerTanques();
	}
	
	@PostMapping()
	public Tanque altaTanque(@RequestBody Tanque tanque) {
		return this.tanqueService.altaTanque(tanque);
	}

}
