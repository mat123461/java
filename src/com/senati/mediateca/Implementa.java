package com.senati.mediateca;

import java.util.HashSet;//Java colecciones matrices lista array
import java.util.Set;

public class Implementa {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//añadir nuevos socios
		//clase objeto =new class()
		Socio socio1=new Socio();
		socio1.id=100;
		socio1.nombre="Jorge Antonio";
		socio1.apellidos="Luque Chambi";
		socio1.distritos="Los Olivos";
		
		
		Socio socio2=new Socio();//constructor vacio
		socio2.id=100;
		socio2.nombre="Esther";
		socio2.apellidos="Aquino Alvarez";
		socio2.distritos="Vellavistas";
		
		System.out.println(socio1.toString());
		System.out.println(socio2.toString());
		
		Socio socio3=new Socio(103,"Alicia","Gomez","Comas");//constructor lleno
		System.out.println(socio3.toString());
		
		
		///cintadeaudio
		
		Cintaaudio cintaaudio1=new Cintaaudio(12345," La niña de la lampara azul", 120, "Jose Maria Eguren"," Pro", 10);
		System.out.println(cintaaudio1.toString());
		
		Cintaaudio cintaaudio2=new Cintaaudio(435435,"La ciudad de los perros", 120, "Mario Vargas Llosa"," Pro", 10);
		System.out.println(cintaaudio2.toString());
		
		
		///cintadevideo
		
		Cintavideo cintavideo1=new Cintavideo(3423544,"La divina comedia", 200, "Dante", "Dante",null ,20);
		System.out.println(cintavideo1.toString());
		
		Cintavideo cintavideo2=new Cintavideo(56546567,"Inborrable", 120, "Dante"," Pro", null, 10);
		System.out.println(cintavideo2.toString());
		
	
		
		
		////7//Socio
		
        System.out.println("lista de socios");
        Socio cl1 = new Socio(104,"Jorge"," Luque","comas");
		Socio cl2 = new Socio(105,"Maria"," Luna","comas");
		Socio cl3 = new Socio(106,"Gerardo","Luque","comas");
		Socio cl4 = new Socio(108,"Alex"," Lopez","comas");
		Socio cl5 = new Socio(109,"Alex"," Lopez","comas");
		
        Set <Socio> sociosinscritos = new HashSet<Socio>();
        
        sociosinscritos.add(cl1);
        sociosinscritos.add(cl2);
        sociosinscritos.add(cl3);
        sociosinscritos.add(cl4);
        sociosinscritos.add(cl5);
        
        for (Socio socio:sociosinscritos) {
        	System.out.println(socio.id+" "+socio.nombre +" "+socio.apellidos+" "+socio.distritos);
        }
        ////cinta e video
        
        System.out.println("lista de videos");
        Cintavideo cl11 = new Cintavideo(3423544,"pacojunque", 100, "cv", "Dante",null ,20);
        Cintavideo cl22 = new Cintavideo(3423544,"pacojunque", 100, "vc", "Dante",null ,20);
        Cintavideo cl33 = new Cintavideo(3423544,"pacojunque", 100, "vc", "Dante",null ,20);
        Cintavideo cl44 = new Cintavideo(3423544,"pacojunque", 100, "cv", "Dante",null ,20);
        Cintavideo cl55 = new Cintavideo(3423544,"pacojunque", 100, "cv", "Dante",null ,20);
		
        Set <Cintavideo> Cintavideoinscritos = new HashSet<Cintavideo>();
        
        Cintavideoinscritos.add(cl11);
        Cintavideoinscritos.add(cl22);
        Cintavideoinscritos.add(cl33);
        Cintavideoinscritos.add(cl44);
        Cintavideoinscritos.add(cl55);
        
        for (Cintavideo cintavideo:Cintavideoinscritos) {
        	System.out.println(cintavideo.id+" "+cintavideo.titulo +" "+cintavideo.precio+ " "+cintavideo.autor+" " +cintavideo.actor+" ");
        }
        ///cinta audio
        
        System.out.println("lista de audios");
        Cintaaudio aud1 = new Cintaaudio(12345,"lago de los cisnes", 120, "mario vargas llosa"," Pro", 10);
        Cintaaudio aud2 = new Cintaaudio(12345,"lago de los cisne", 120, "mario vargas llosa"," Pro", 10);
        Cintaaudio aud3 = new Cintaaudio(12345,"lago de los cisne", 120, "mario vargas llosa"," Pro", 10);
        Cintaaudio aud4 = new Cintaaudio(12345,"lago de los cisne", 120, "mario vargas llosa"," Pro", 10);
        Cintaaudio aud5 = new Cintaaudio(12345,"lago de los cisne", 120, "mario vargas llosa"," Pro", 10);
		
        Set <Cintaaudio> Cintaaudioinscritos = new HashSet<Cintaaudio>();
        
        Cintaaudioinscritos.add(aud1);
        Cintaaudioinscritos.add(aud2);
        Cintaaudioinscritos.add(aud3);
        Cintaaudioinscritos.add(aud4);
        Cintaaudioinscritos.add(aud5);
        
        for (Cintaaudio Cintaaudio:Cintaaudioinscritos) {
        	System.out.println(Cintaaudio.id+" "+Cintaaudio.titulo +" "+Soporte.precio+" "+Cintaaudio.autor+" ");
        }
        
        
        
        
        
      ///cinta libro
        
        System.out.println("lista de libros");
        Libros li1 = new Libros(12213214,"troya", 20, "eugenio", 17, 12);
        Libros li2 = new Libros(14323434,"troya", 20, "eugenio", 17, 12);
        Libros li3 = new Libros(12213214,"troya", 20, "eugenio", 17, 12);
        Libros li4 = new Libros(13132124,"troya", 20, "eugenio", 17, 12);
        Libros li5 = new Libros(12232214,"troya", 20, "eugenio", 17, 12);
		
        Set <Libros>Librosinscritos = new HashSet<Libros>();
        
        Librosinscritos.add(li1);
        Librosinscritos.add(li2);
        Librosinscritos.add(li3);
        Librosinscritos.add(li4);
        Librosinscritos.add(li5);
        
        byte contador=0;
        float preciototal=0;
        for (Libros Libros: Librosinscritos) {
        	System.out.println(Libros.id+" "+Libros.titulo +" "+Libros.precio+" "+Libros.autor+" "+Libros.nropag+" ");
        	contador++;
        	preciototal=preciototal + Libros.precio;
        }
        System.out.println("libros prestados" + contador);
        System.out.println("libros prestados" + preciototal);
        
	}

}
