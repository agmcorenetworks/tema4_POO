package es.corenetwors.dam.programacion.tema4.EjercicioHerenciaInterfacesMensaje;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

import es.corenetwors.dam.programacion.tema4.EjercicioHerenciaInterfacesMensajes.Mensaje;

public class TestInterfazMensaje {
	
	@Test
	public void TestInterfazMensaje() {
		
		Mensaje m = new Mensaje("Mensaje1");
		
		assertTrue(m.getPrioridad().equals("media"));
		m.cambiarPrioridadAlta();
		assertTrue(m.getPrioridad().equals("alta"));
		
	}
	
	
	
	
}
