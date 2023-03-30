package es.corenetwors.dam.programacion.tema4.objetosComplejos;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

import es.corenetwors.dam.programacion.tema4.ejercicioObjetosComplejos.Empleado;
import es.corenetwors.dam.programacion.tema4.ejercicioObjetosComplejos.Persona;

public class TestPersonaEmpleados {
	
	@Test
	public void test_persona_class() throws CloneNotSupportedException {
		Persona p1 = new Persona("Pepe","Pepe Pepe",1974,"Chema");
		Persona p2 = new Persona("Maria","Maria Maria",1975,"Maria");
		Persona p3 = new Persona("Juan","Juan Juan",1976,"Juan");
		Persona p4 = p1;
		Persona p5 = (Persona) p1.clone();
		
		Empleado e1 = new Empleado(1234,"ventas",p1);
		Empleado e2 = (Empleado) e1.clone();
		Empleado e3 = new Empleado(1234,"ventas",p2);
		
		System.out.println("objeto e1: "+e1 + "\nobjeto e2: "+e2);
		assertFalse(e1.getPersona() == e2.getPersona(),"deberia ser false");
		
		// e1 != e2
		assertFalse(e1 == e2,"deberia ser false");
		// e1 equals e2
		assertTrue(e1.equals(e2),"deberia ser true");
		// e1 == e3
		assertFalse(e1 == e3,"deberia ser false");
		// e1 equals e3
		assertFalse(e1.equals(e3),"deberia ser false");
	}
	
	
	
}
