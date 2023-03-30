package es.corenetwors.dam.programacion.tema4.ejercicioObjetosComplejos;

public class Empleado {
	public int idEmpleado;
	private String departamento;
	private Persona persona;
	
	// Constructor con tres parametros
	public Empleado (int idEmpleado,String departamento,Persona persona) {
		this.idEmpleado = idEmpleado;
		this.departamento = departamento;
		this.persona = persona;
	}
	
	// Constructor copia
	public Empleado (Empleado e) {
		this.idEmpleado = e.idEmpleado;
		this.departamento = e.departamento;
		this.persona = e.persona;
	}
	
	public int getIdEmpleado() {
		return idEmpleado;
	}
	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	
	// Metodo equals
	@Override
	public boolean equals(Object obj) {
		Empleado e = (Empleado) obj;
		if (this.idEmpleado == e.idEmpleado && this.departamento == e.departamento)
			if (persona != null)
				return persona.equals(e.persona);

		return false;
	}
	
	// Metodo clone
	@Override
	public Object clone() throws CloneNotSupportedException {
		Persona pc=(Persona) this.persona.clone();
		return new Empleado(this.idEmpleado,this.departamento,pc);
	}
	
	// Metodo toString
	@Override
	public String toString() {
		return "Empleado [idEmpleado = " + idEmpleado + ", departamento = " + departamento + ", persona = " + persona.toString() + "]";
	}
	
}
