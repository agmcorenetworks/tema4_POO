package es.corenetwors.dam.programacion.tema4.herencia;

public class Granja {

	Animal a;
	Perro p;
	
	Granja(Animal a, Perro p){
		this.a=a;
		this.p=p;
	}
	
	void setAnimales(Animal a, Perro p){
		this.a=a;
		this.p=p;
	}
	
	Animal getAnimal(){
		return this.a;
	}
}
