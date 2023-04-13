package es.corenetwors.dam.programacion.tema4.objetosCompuestos;

import org.junit.Test;

import es.corenetwors.dam.programacion.tema4.ejercicioObjetosCompuestos.Persona;
import es.corenetwors.dam.programacion.tema4.ejercicioObjetosCompuestos.Direccion;
import es.corenetwors.dam.programacion.tema4.ejercicioObjetosCompuestos.Localidad;
import es.corenetwors.dam.programacion.tema4.ejercicioObjetosCompuestos.Mascota;

public class TestObjetosCompuestos {
	
	@Test
	public void test_persona_Complejos() throws CloneNotSupportedException {
		
		Mascota m = new Mascota("Toby");
		Localidad l = new Localidad("Sevilla", 41001);
		Direccion d = new Direccion("Calle1", 1, l);
		Persona p = new Persona(20, "Alex", "11111D",d,m);
		
		
		Persona pclone =  (Persona) p.clone();
		

	}
	
	
	
}
