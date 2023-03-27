package es.corenetwors.dam.programacion.tema4.object;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class TestPersona {

	@Test
	void test_persona_class() {

		// crear una persona p1 llamada pepe de 21 años
		Persona p1 = new Persona("pepe", 21);
		// crear persona p2 jose de 21 años
		Persona p2 = new Persona("jose", 21);
		// crear otra paersona p3 pepe de 21 años
		Persona p3 = new Persona("pepe", 21);
		// crear una persona p4 =p1
		Persona p4 = p1;
		// crear una persona p5 usando
		// el constructor copia de p1
		Persona p5 = new Persona(p1);
		Persona p6 = null;
		// clonamos p1 en p6
		try {
			p6 = (Persona) p1.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// p1==p2? false
		assertFalse("deberia ser false!", p1 == p2);
		// p1==p3? false
		assertFalse("deberia ser false!", p1 == p3);
		// p1==p4? true
		assertTrue("deberia ser false!", p1 == p4);
		// p2==p4? false
		assertFalse("deberia ser false!", p2 == p4);
		// p1==p5? false
		assertFalse("deberia ser false!", p1 == p5);
		// p1==p6? false/true
		assertFalse("deberia ser false!", p1 == p6);

		// p1.equals(p1)? true
		assertTrue("deberia ser false!", p1.equals(p1));
		// p1.equals(p2)? false
		assertFalse("deberia ser false!", p1.equals(p2));
		// p1.equals(p3)? true
		assertTrue("deberia ser false!", p1.equals(p3));
		// p1.equals(p4)? true
		assertTrue("deberia ser false!", p1.equals(p4));
		// p2.equals(p4)? false
		assertTrue("deberia ser false!", p1.equals(p4));
		// p3.equals(p4)? true
		assertTrue("deberia ser false!", p3.equals(p4));
		// p1.equals(p5)? true
		assertTrue("deberia ser false!", p1.equals(p5));
		// p1.equals(p6)? true
		assertTrue("deberia ser false!", p1.equals(p6));
	}

	@Test
	void test_persona_direccion() throws CloneNotSupportedException {
		Direccion d1 = new Direccion("resolana", 1, 41001);
		Direccion d2 = new Direccion("ronda triana", 1, 41005);
		Direccion d3 = new Direccion("castilla", 1, 41003);
		Direccion d4 = (Direccion) d1.clone();
		Direccion d5 = d1;
		
		assertFalse("deberia ser false!", d1 == d2);
		assertFalse("deberia ser false!", d1 == d3);
		assertFalse("deberia ser false!", d1 == d4);
		assertTrue("deberia ser false!", d1 == d5);
		assertFalse("deberia ser false!", d1.equals(d2));
		assertTrue("deberia ser false!", d2.equals(d2));
		assertFalse("deberia ser false!", d1.equals(d3));
		assertTrue("deberia ser false!", d1.equals(d4));

		Persona p1 = new Persona("alex", 22);
		Persona p3 = new Persona("pepe", 22);
		Persona p4 = new Persona("manue", 22);
		Persona p5 = (Persona) p1.clone();
		Persona p6 = (Persona) p1.clone();
		
		p1.setDireccion(d1);
		p5.setDireccion(d2);
		p6.setDireccion(d1);
		
		assertFalse("deberia ser false!", p1.equals(p5));
		assertTrue("deberia ser false!", p1.equals(p6));

		
	}

}
