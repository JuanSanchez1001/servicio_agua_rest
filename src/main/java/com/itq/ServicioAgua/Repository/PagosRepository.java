package com.itq.ServicioAgua.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.itq.ServicioAgua.dto.Pago;

@Repository
public interface PagosRepository extends CrudRepository<Pago,Long>{
	
}

