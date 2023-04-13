package es.corenetwors.dam.programacion.tema4.ejercicioObjetosCompuestos;

public class Localidad {
	
	String nombre;
	int cp;
	
	
	public Localidad(String nombre, int cp) {
		
		this.nombre = nombre;
		this.cp = cp;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return new Localidad(this.nombre, this.cp);
	}
	
	
	

}
