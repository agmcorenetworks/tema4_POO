package es.corenetwors.dam.programacion.tema4.objetosComplejos;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Date;

import org.junit.Test;

import es.corenetwors.dam.programacion.tema4.ejercicioObjetosComplejosRepaso.Persona;
import es.corenetwors.dam.programacion.tema4.ejercicioObjetosComplejosRepaso.Profesor;
import es.corenetwors.dam.programacion.tema4.ejercicioObjetosComplejosRepaso.ProfesorInterino;

public class TestPersonaEmpleados {
	
	@Test
	public void test_persona_profesores() throws CloneNotSupportedException {
		Persona p1 = new Persona("alex", "garcia", 25);
		Persona p2 = new Persona("paco", "garcia", 25);
		Persona p3 = new Persona("paco", "gracia", 25);
		Persona p4 = new Persona("alex", "garcia", 25);
		Persona p5=p1;
		
		assertFalse(p1==p2);
		assertFalse(p2==p3);
		assertFalse(p4==p3);
		assertFalse(p1==p3);
		assertTrue(p5==p1);
		
		assertFalse(p1.equals(p2));
		assertTrue((p1.equals(p4)));
		assertTrue((p1.equals(p5)));
		assertFalse((p2.equals(p3)));
		
		Profesor pf1=new Profesor("0001","programacion",p1);
		Profesor pf2=new Profesor("0002","programacion",p2);
		Profesor pf4=(Profesor)pf1.clone();			
		
		assertFalse(pf1==pf2);
		assertFalse(pf1.equals(pf2));
		assertFalse(pf1==pf4);
		assertTrue(pf1.equals(pf4));
		
		Profesor pf3=new Profesor("0003","programacion",p1);
		assertFalse(pf1==pf3);
		
		Date d=new Date();
		ProfesorInterino pfi1=new ProfesorInterino(d,pf1);		
		ProfesorInterino pfi2=new ProfesorInterino(d,pf1);
		assertFalse(pfi1==pfi2);
		assertTrue(pfi1.equals(pfi2));

		
		
		

	}
	
	
	
}
