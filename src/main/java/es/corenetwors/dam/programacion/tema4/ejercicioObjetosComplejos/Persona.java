package es.corenetwors.dam.programacion.tema4.ejercicioObjetosComplejos;

public class Persona {

	protected String nombre;
	protected String apellidos;
	protected int anyoDeNacimiento;
	private String apodo;

	public Persona() {
		System.out.println("Constructor sin parámetros");
	}

	// constructor con todos los parámetros

	public Persona(String nombre, String apellidos, int anyoDeNacimiento, String apodo) {
		this(nombre, apellidos);
		this.apodo = apodo;
		this.anyoDeNacimiento = anyoDeNacimiento;
	}

	// constructor copia

	public Persona(Persona p) {
		this.nombre = p.nombre;
		this.apellidos = p.apellidos;
		this.apodo = p.apodo;
		this.anyoDeNacimiento = p.anyoDeNacimiento;
	}

	public Persona(String nombre, String apellidos) {
		this.nombre = nombre;
		this.apellidos = apellidos;
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

	public int getAnyoDeNacimiento() {
		return anyoDeNacimiento;
	}

	public void setAnyoDeNacimiento(int anyoDeNacimiento) {
		this.anyoDeNacimiento = anyoDeNacimiento;
	}

	public String getApodo() {
		return apodo;
	}

	public void setApodo(String apodo) {
		this.apodo = apodo;
	}

	@Override
	public boolean equals(Object obj) {
		Persona p = (Persona) obj;
		if (this.nombre == p.nombre && this.apellidos == p.apellidos && this.anyoDeNacimiento == p.anyoDeNacimiento
				&& this.apodo == p.apodo)
			return true;
		else
			return false;
	}

	@Override
	public Object clone() {
		Persona p1 = new Persona(this.nombre, this.apellidos, this.anyoDeNacimiento, this.apodo);
		return p1;
	}

	@Override
	public String toString() {
		return "Persona de nombre " + nombre + ", con apellidos " + apellidos + ", nacida en el año "
					+ anyoDeNacimiento + " conocida como " + apodo;
	}

	public static void main(String[] args) {
		Persona p1 = new Persona("manolito", "gafotas", 1995, "manolete");
		System.out.println(p1.toString());
	}
}
