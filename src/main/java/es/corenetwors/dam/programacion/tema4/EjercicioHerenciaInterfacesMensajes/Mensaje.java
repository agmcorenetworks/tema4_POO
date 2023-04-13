package es.corenetwors.dam.programacion.tema4.EjercicioHerenciaInterfacesMensajes;

public class Mensaje implements Logable {
	
	private String mensaje;
	private String prioridad;

	
	public  Mensaje (String mensaje) {
		this.mensaje = mensaje;
		this.prioridad = "media";
	}
	
	public void setMensaje (String mensaje) {
		this.mensaje = mensaje;
	}
	
	public  String getMensaje() {
		return mensaje;
	}
	
	public void setPrioridad (String prioridad) {
		this.prioridad = prioridad;
	}
	
	public String getPrioridad() {
		return prioridad;
	}
	
	public String leerMensaje() {
		return mensaje;
	}

	public void cambiarPrioridadAlta() {
		this.prioridad = "alta";
		
	}

	public void cambiarPrioridadMedia() {
		this.prioridad = "media";
		
	}

	public void cambiarPrioridadBaja() {
		this.prioridad = "baja";
		
	}

	public void cambiarMensaje(String NuevoMensaje) {
		this.mensaje = NuevoMensaje;
		
	}
	
	
}