package com.itq.ServicioAgua.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "solicitud")
public class Solicitud {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idSolicitud;
	
	@Column(name="idCliente")
	private int idCliente; 
	
	@Column(name="idTanque")
	private int idTanque;
	
	@Column(name="estado")
	private String estado;
	
	@Column(name="descripcion")
	private String descripcion;
	
	@Column(name="litros")
	private int litros;

	/**
	 * @return the idSolicitud
	 */
	public Long getIdSolicitud() {
		return idSolicitud;
	}

	/**
	 * @param idSolicitud the idSolicitud to set
	 */
	public void setIdSolicitud(Long idSolicitud) {
		this.idSolicitud = idSolicitud;
	}

	/**
	 * @return the idCliente
	 */
	public int getIdCliente() {
		return idCliente;
	}

	/**
	 * @param idCliente the idCliente to set
	 */
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	/**
	 * @return the idTanque
	 */
	public int getIdTanque() {
		return idTanque;
	}

	/**
	 * @param idTanque the idTanque to set
	 */
	public void setIdTanque(int idTanque) {
		this.idTanque = idTanque;
	}

	/**
	 * @return the estado
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * @param estado the estado to set
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @return the litros
	 */
	public int getLitros() {
		return litros;
	}

	/**
	 * @param litros the litros to set
	 */
	public void setLitros(int litros) {
		this.litros = litros;
	}
	
}

