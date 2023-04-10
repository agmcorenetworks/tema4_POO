package es.corenetwors.dam.programacion.tema4.ejercicioObjetosComplejosRepaso;

public class Persona {
	
	protected String nombre;
	protected String apellidos;
	protected int edad;
	
	public Persona(String nombre,  String apellidos, int edad) {
		this.nombre=nombre;
		this.edad=edad;
		this.apellidos=apellidos;
	}
	
	public Persona(Persona p) {
		this.nombre=p.nombre;
		this.edad=p.edad;
		this.apellidos=p.apellidos;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return new Persona(this.nombre, apellidos, this.edad );
	}
	
	@Override
	public boolean equals(Object obj) {
		Persona p=(Persona)obj;		
		if(this==p)
			return true;
		else {
			if(this.nombre.equals(p.nombre) && this.edad==p.edad &&  this.apellidos.equals(p.apellidos) )
				return true;
			return false;
		}			
	}
	
	@Override
	public String toString() {
		return "[ " +this.nombre + " " + this.apellidos + ""+ this.edad + "] "  ;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	

}
