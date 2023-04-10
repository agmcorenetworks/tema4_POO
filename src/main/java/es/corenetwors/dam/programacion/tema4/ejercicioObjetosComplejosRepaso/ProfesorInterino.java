package es.corenetwors.dam.programacion.tema4.ejercicioObjetosComplejosRepaso;

import java.util.Date;

public class ProfesorInterino extends Profesor {
	
	private Date fechaInterinidad;

		
	public ProfesorInterino(Date fechaInterinidad, Profesor profe) {
		super(profe);
		this.fechaInterinidad=fechaInterinidad;
	}

	public ProfesorInterino(Date fechaInterinidad,String idProfesor, String asignatura, Persona p) {
		super(idProfesor, asignatura, p);
		this.fechaInterinidad=fechaInterinidad;
	}

	public ProfesorInterino(Date fechaInterinidad,String idProfesor, String asignatura, String nombre, int edad, String apellidos) {
		super(idProfesor, asignatura, nombre, edad, apellidos);
		this.fechaInterinidad=fechaInterinidad;
	}
		

	@Override
	public Object clone() throws CloneNotSupportedException {				
		Profesor p=(Profesor)super.clone();
		Date fi=(Date)this.fechaInterinidad.clone();
		ProfesorInterino pi=new ProfesorInterino(fi, p);		
		return pi;		
	}

	@Override
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		else
		{
			ProfesorInterino pi=(ProfesorInterino)obj;		
			if(super.equals(pi)) {
				if(this.fechaInterinidad.equals(fechaInterinidad))
					return true;
			}
			return false;				
		}
	}

	@Override
	public String toString() {
		return "ProfesorInterino [fechaInterinidad=" + fechaInterinidad + ", idProfesor=" + idProfesor + ", asignatura="
				+ asignatura + ", nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + "]";
	}

	public Date getFechaInterinidad() {
		return fechaInterinidad;
	}

	public void setFechaInterinidad(Date fechaInterinidad) {
		this.fechaInterinidad = fechaInterinidad;
	}
	
	
	

}
