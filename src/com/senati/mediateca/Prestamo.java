package com.senati.mediateca;

public class Prestamo {
	int idprestamo;
	int idsocio;
	int idsoporte;
	int cantidad;
	public float precio;
	public Prestamo(int idprestamo, int idsocio, int idsoporte, int cantidad, float precio) {
		super();
		this.idprestamo = idprestamo;
		this.idsocio = idsocio;
		this.idsoporte = idsoporte;
		this.cantidad = cantidad;
		this.precio = precio;
	}
	public Prestamo() {
		super();
	}
	public int getIdprestamo() {
		return idprestamo;
	}
	public void setIdprestamo(int idprestamo) {
		this.idprestamo = idprestamo;
	}
	public int getIdsocio() {
		return idsocio;
	}
	public void setIdsocio(int idsocio) {
		this.idsocio = idsocio;
	}
	public int getIdsoporte() {
		return idsoporte;
	}
	public void setIdsoporte(int idsoporte) {
		this.idsoporte = idsoporte;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	

}
