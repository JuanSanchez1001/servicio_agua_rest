package com.itq.ServicioAgua.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Pago")
public class Pago {
	@Id
	private Long idPago;
	
	@Column(name = "monto", nullable=false,length = 5)
	private int monto;
	
	@Column(name="fecha", nullable = false, length = 10)
	private String fechaPago;
	
	@Column(name="estado", nullable=false, length=50)
	private String estado;
	
	@Column(name = "tipoPago", nullable=false, length=10)
	private String tipoPago;
	/**
	 * @return the idPago
	 */
	public Long getIdPago() {
		return idPago;
	}
	/**
	 * @param idPago the idPago to set
	 */
	public void setIdPago(Long idPago) {
		this.idPago = idPago;
	}
	/**
	 * @return the monto
	 */
	public int getMonto() {
		return monto;
	}
	/**
	 * @param monto the monto to set
	 */
	public void setMonto(int monto) {
		this.monto = monto;
	}
	/**
	 * @return the fechaPago
	 */
	public String getFechaPago() {
		return fechaPago;
	}
	/**
	 * @param fechaPago the fechaPago to set
	 */
	public void setFechaPago(String fechaPago) {
		this.fechaPago = fechaPago;
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
	 * @return the tipoPago
	 */
	public String getTipoPago() {
		return tipoPago;
	}
	/**
	 * @param tipoPago the tipoPago to set
	 */
	public void setTipoPago(String tipoPago) {
		this.tipoPago = tipoPago;
	}
	
}

