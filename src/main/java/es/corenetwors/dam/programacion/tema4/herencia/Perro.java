package es.corenetwors.dam.programacion.tema4.herencia;

public class Perro extends Animal implements Cloneable {

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
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("ha pasado el recolector de basuras");
	}
	 
}
