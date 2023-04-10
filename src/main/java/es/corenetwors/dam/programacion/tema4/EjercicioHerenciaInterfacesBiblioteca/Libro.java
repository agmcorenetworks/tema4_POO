package es.corenetwors.dam.programacion.tema4.EjercicioHerenciaInterfacesBiblioteca;

public class Libro extends Biblioteca implements Prestable {

	
	private boolean prestado;
	
	public Libro(String titulo, String codigo, int anyoPublicacion) {
		super(titulo,  codigo,  anyoPublicacion);
		this.prestado=false;
	}

	public void prestar() {
		this.prestado=true;		
	}

	public void devolver() {		
		this.prestado=true;	
	}

	public boolean isPrestado() {
		//return this.prestado;
		return this.isPrestado();
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}
	
	
	
	
}
