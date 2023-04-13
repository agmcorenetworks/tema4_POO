package es.corenetwors.dam.programacion.tema4.ejercicioObjetosCompuestos;

public class Mascota {

	String nombre;
	
	public Mascota(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {

		return new Mascota(this.nombre);
		
	}
}
