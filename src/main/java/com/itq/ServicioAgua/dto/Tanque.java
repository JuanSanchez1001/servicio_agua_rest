package com.itq.ServicioAgua.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Tanque {
	
	@Id
	private Long IdTanque;
	
	@Column(name="zona", nullable=false)
	private String zona;
	
	@Column(name="capacidad", nullable=false)
	private int capacidad;//Capacidad del tanque
	
	@Column(name="estado", nullable=false)
	private int estado; //Cantidad de agua que tiene actual
	
	@Column(name="hora", nullable=false)
	private String hllenado;

	/**
	 * @return the idTanque
	 */
	public Long getIdTanque() {
		return IdTanque;
	}

	/**
	 * @param idTanque the idTanque to set
	 */
	public void setIdTanque(Long idTanque) {
		IdTanque = idTanque;
	}

	/**
	 * @return the zona
	 */
	public String getZona() {
		return zona;
	}

	/**
	 * @param zona the zona to set
	 */
	public void setZona(String zona) {
		this.zona = zona;
	}

	/**
	 * @return the capacidad
	 */
	public int getCapacidad() {
		return capacidad;
	}

	/**
	 * @param capacidad the capacidad to set
	 */
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	/**
	 * @return the estado
	 */
	public int getEstado() {
		return estado;
	}

	/**
	 * @param estado the estado to set
	 */
	public void setEstado(int estado) {
		this.estado = estado;
	}

	/**
	 * @return the hllenado
	 */
	public String getHllenado() {
		return hllenado;
	}

	/**
	 * @param hllenado the hllenado to set
	 */
	public void setHllenado(String hllenado) {
		this.hllenado = hllenado;
	}

	
}
