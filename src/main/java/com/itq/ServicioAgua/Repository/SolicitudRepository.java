/*Programa: SolicitudRepository.java
 * Funcion: Es el repositorio para la funcionalidad de solicitud
 *  El repositorio es el que enviara los datos a la BD
 * */

package com.itq.ServicioAgua.Repository;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.itq.ServicioAgua.dto.Solicitud;

@Repository
public interface SolicitudRepository extends CrudRepository<Solicitud, Long>{
	public abstract ArrayList<Solicitud> buscarId(int idCliente);
	
}
