package com.itq.ServicioAgua.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.itq.ServicioAgua.dto.Tanque;

@Repository
public interface TanqueRepository extends CrudRepository<Tanque, Long>{

}
