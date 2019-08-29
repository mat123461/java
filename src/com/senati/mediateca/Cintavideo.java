package com.senati.mediateca;

public class Cintavideo extends Soporte {
	//pra heredar atributos de una clase superior
	//vamos a usar la palabra estends superclase
	    public static String actor;
		int duracion;
	
		/// constructor lleno
		public Cintavideo(int id, String titulo, float precio, String autor, String actor, String director,
				int duracion) {
			super(id, titulo, precio, autor);
			Cintavideo.actor = actor;
		
			this.duracion = duracion;
		}	
    // constructor vacio
		public Cintavideo() {
			super();
		}
	//get y set
		public String getActor() {
			return actor;
		}
		public void setActor(String actor) {
			Cintavideo.actor = actor;
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
			return "Cintavideo [actor=" + actor + ", duracion=" + duracion + ", id=" + id + ", titulo=" + titulo
					+ ", precio=" + precio + ", autor=" + autor + "]";
		}
		public Cintavideo(int id, String titulo, float precio, String autor) {
			super(id, titulo, precio, autor);
			// TODO Auto-generated constructor stub
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((actor == null) ? 0 : actor.hashCode());
			result = prime * result + duracion;
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
			Cintavideo other = (Cintavideo) obj;
			if (actor == null) {
				if (Cintavideo.actor != null)
					return false;
			} else if (!actor.equals(Cintavideo.actor))
				return false;
			if (duracion != other.duracion)
				return false;
			return true;
		}
		
		
		
	
		
		

}
