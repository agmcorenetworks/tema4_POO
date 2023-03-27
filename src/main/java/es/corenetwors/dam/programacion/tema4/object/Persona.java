package es.corenetwors.dam.programacion.tema4.object;

public class Persona {
	
	
	private String nombre;
	private int edad;
	private Direccion direccion;
		

	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public Persona(Persona p) {
		this.nombre = p.nombre;
		this.edad = p.edad;
		this.direccion = p.direccion;
	}	

		
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	@Override
	public boolean equals(Object obj) {
		Persona p=(Persona) obj;
		if(this.nombre==p.nombre && this.edad==p.edad)		
			if(direccion!=null) {
				return this.direccion.equals(p.direccion);
			}else
				return true;
		return false;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Persona p1 = new Persona (this.nombre, this.edad);
		if(direccion!=null)
			p1.direccion=(Direccion) this.direccion.clone();
		return p1;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}

}
