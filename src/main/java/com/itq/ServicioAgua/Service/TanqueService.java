package com.itq.ServicioAgua.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import com.itq.ServicioAgua.Repository.TanqueRepository;
import com.itq.ServicioAgua.dto.Tanque;

@Service
public class TanqueService {
	
	@Autowired
	TanqueRepository tanqueRepository;
    //Metodo GET visualiza tanques
	public ArrayList<Tanque> obtenerTanques(){
		return (ArrayList<Tanque>) tanqueRepository.findAll();
	}
	
	
	//Metodo POST da de alta Tanque
	public Tanque altaTanque(Tanque tanque) {
		return tanqueRepository.save(tanque);
	}
}