package com.senati.mediateca;

public class Soporte {
	//atributos de la clase soporte
	public int id;
	public String titulo;
	public static float precio;
	public static String autor;
	///contructores fdr la clase
	public Soporte(int id, String titulo, float precio, String autor) {
		super();
		this.id = id;
		this.titulo = titulo;
		Soporte.precio = precio;
		Soporte.autor = autor;
	}
	//constructor sinatributos
	public Soporte() {
		super();
	}
	//Getters y setters --->obtener y modificar
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		Soporte.precio = precio;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		Soporte.autor = autor;
	}
	// metodo tustring
	@Override
	public String toString() {
		return "Soporte [id=" + id + ", titulo=" + titulo + ", precio=" + precio + ", autor=" + autor + "]";
	}
	
	
}
