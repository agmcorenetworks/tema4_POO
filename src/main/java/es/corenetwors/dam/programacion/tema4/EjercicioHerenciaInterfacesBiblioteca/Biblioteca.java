package es.corenetwors.dam.programacion.tema4.EjercicioHerenciaInterfacesBiblioteca;

public class Biblioteca {

	protected String titulo;
	protected String codigo;
	protected int anyoPublicacion;
	
	
	public Biblioteca(String titulo, String codigo, int anyoPublicacion) {
		this.titulo = titulo;
		this.codigo = codigo;
		this.anyoPublicacion = anyoPublicacion;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public int getAnyoPublicacion() {
		return anyoPublicacion;
	}
	public void setAnyoPublicacion(int anyoPublicacion) {
		this.anyoPublicacion = anyoPublicacion;
	}
	
	
	
}
