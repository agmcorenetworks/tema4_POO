package es.corenetwors.dam.programacion.tema4.herencia;

public class Perro extends Animal {

	private String nombre;

	Perro(){
		this.nombre="timo";
	}
	
	Perro(String nombre){
		this.nombre=nombre;
	}
	
	@Override
	public void funcion2() {
		// TODO Auto-generated method stub
		super.funcion2();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "nombre perro: "+nombre;
	}
	 
}
