package com.senati.mediateca;

public class Socio {
	int id;
	String nombre;
	String apellidos;
	String distritos;
	public Socio(int id, String nombre, String apellidos, String distritos) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.distritos = distritos;
	}
	public Socio() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getDistritos() {
		return distritos;
	}
	public void setDistritos(String distritos) {
		this.distritos = distritos;
	}
	@Override
	public String toString() {
		return "Socio [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", distritos=" + distritos + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellidos == null) ? 0 : apellidos.hashCode());
		result = prime * result + ((distritos == null) ? 0 : distritos.hashCode());
		result = prime * result + id;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Socio other = (Socio) obj;
		if (apellidos == null) {
			if (other.apellidos != null)
				return false;
		} else if (!apellidos.equals(other.apellidos))
			return false;
		if (distritos == null) {
			if (other.distritos != null)
				return false;
		} else if (!distritos.equals(other.distritos))
			return false;
		if (id != other.id)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
	

}
