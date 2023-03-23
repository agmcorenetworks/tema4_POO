package es.corenetwors.dam.programacion.tema4.testing;

import es.corenetwors.dam.programacion.tema4.herencia.Animal;
import es.corenetwors.dam.programacion.tema4.herencia.Perro;

public class Testing {

	public static void main(String[] args) {

		Animal a1=new Animal("");
		a1.patas=5;
		a1.funcion2();
		
		Perro p1=new Perro();
		p1.patas=4;
		p1.funcion2();
		
		p1.funcion1();
		
		
		
		
	}

}
