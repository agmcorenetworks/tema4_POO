package es.corenetwors.dam.programacion.tema4.EjercicioHerenciaInterfacesMensajes;

public interface Logable {
	
	String leerMensaje();
	void cambiarPrioridadAlta();
	void cambiarPrioridadMedia();
	void cambiarPrioridadBaja();
	void cambiarMensaje (String NuevoMensaje);
}
