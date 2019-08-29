package com.senati.mediateca;

public class Cintaaudio extends Soporte{
	//atributos de la clase cinta audio
	String lugar;
	int duracion;
	//constructores llenos
	public Cintaaudio(int id, String titulo, float precio, String autor, String lugar, int duracion) {
		super(id, titulo, precio, autor);
		this.lugar = lugar;
		this.duracion = duracion;
	}
	//constructores vacios
	public Cintaaudio() {
		super();
	}
    //get set
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	//tostring
	@Override
	public String toString() {
		return "Cintaaudio [lugar=" + lugar + ", duracion=" + duracion + ", id=" + id + ", titulo=" + titulo
				+ ", precio=" + precio + ", autor=" + autor + "]";
	}
	
	
}
