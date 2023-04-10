package es.corenetwors.dam.programacion.tema4.ejercicioObjetosComplejosRepaso;

public class Profesor extends Persona {

	protected String idProfesor;
	protected String asignatura;
	
	public Profesor(String idProfesor, String asignatura, String nombre, int edad, String apellidos) {
		super(nombre, apellidos, edad );
		this.idProfesor=idProfesor;
		this.asignatura=asignatura;
	}
	
	public Profesor(String idProfesor,String asignatura, Persona p) {
		super(p);		
		this.idProfesor=idProfesor;
		this.asignatura=asignatura;		
	}
	
	public Profesor(Profesor profe) {
		super(profe.nombre, profe.apellidos, profe.edad);
		this.idProfesor=profe.idProfesor;
		this.asignatura=profe.asignatura;		
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		Persona p=(Persona)super.clone();
		return new Profesor(this.idProfesor, this.asignatura,p);
	}	
	
			
	@Override
	public String toString() {
		return "Profesor [idProfesor=" + idProfesor + ", asignatura=" + asignatura + ", nombre=" + nombre
				+ ", apellidos=" + apellidos + ", edad=" + edad + "]";
	}

	@Override
	public boolean equals(Object obj) {		
		
		Profesor other = (Profesor) obj;		
		if (this == other)
			return true;	
		
		if (asignatura == null) {
			if (other.asignatura != null)
				return false;
		} else if (!asignatura.equals(other.asignatura))
			return false;
		
		
		if (idProfesor == null) {
			if (other.idProfesor != null)
				return false;
		} else if (!idProfesor.equals(other.idProfesor))
			return false;
		return true;
	}
	public String getIdProfesor() {
		return idProfesor;
	}
	public void setIdProfesor(String idProfesor) {
		this.idProfesor = idProfesor;
	}
	public String getAsignatura() {
		return asignatura;
	}
	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}
	
	
}
