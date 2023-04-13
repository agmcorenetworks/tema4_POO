package es.corenetwors.dam.programacion.tema4.ejercicioObjetosCompuestos;

public class Persona {
	int edad;
	String nombre;
	String dni;
	Direccion dir;
	Mascota m;
	
	public Persona(int edad, String nombre, String dni, Direccion dir, Mascota m) {
		this.edad = edad;
		this.nombre = nombre;
		this.dni = dni;
		this.dir = dir;
		this.m = m;
	}
	
	// Metodo Clone
	@Override
	public Object clone() throws CloneNotSupportedException {

		Direccion d1 = (Direccion) this.dir.clone();
		
		Mascota m = (Mascota) this.m.clone();
		
		return new Persona(this.edad, this.nombre, this.dni, d1, m);
		
		
	}
	
	
	// Metodo toString
	@Override
	public String toString() {
		return "Persona [edad=" + edad + ", nombre=" + nombre + ", dni=" + dni + ", dir=" + dir + "]";
	}



	// Metodo Getter y Setters
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public Direccion getDir() {
		return dir;
	}
	public void setDir(Direccion dir) {
		this.dir = dir;
	}
	
	

}
