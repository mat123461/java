package com.senati.mediateca;

public class Libros extends Soporte {
	//pra heredar atributos de una clase superior
	//vamos a usar la palabra estends superclase
		int  nropag;
		int  nroisbn;
		//constructores vacios
		public Libros() {
			super();
		}
		//constructor lleno
		public Libros(int id, String titulo, float precio, String autor, int nropag, int nroisbn) {
			super(id, titulo, precio, autor);
			this.nropag = nropag;
			this.nroisbn = nroisbn;
		}
		//get y set
		public int getNropag() {
			return nropag;
		}
		public void setNropag(int nropag) {
			this.nropag = nropag;
		}
		public int getNroisbn() {
			return nroisbn;
		}
		public void setNroisbn(int nroisbn) {
			this.nroisbn = nroisbn;
		}
		//tostring
		@Override
		public String toString() {
			return "Libros [nropag=" + nropag + ", nroisbn=" + nroisbn + "]";
		}
		
		
		

}
