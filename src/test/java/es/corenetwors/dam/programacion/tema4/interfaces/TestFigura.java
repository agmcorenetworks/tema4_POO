package es.corenetwors.dam.programacion.tema4.interfaces;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

public class TestFigura {
	@Test
	void test_figura_class() throws CloneNotSupportedException {
		Figura fig1=new Figura();
		fig1.setColor("verde");
		Figura fig2=new Figura();
		fig2.setColor("azul");
		Figura fig3=fig2;
		Figura fig4=(Figura)fig2.clone();
		
		assertTrue(fig1!=fig2);
		assertTrue(!fig1.equals(fig2));

		assertTrue(fig4.equals(fig2));
		assertTrue(fig4!=fig2);
		
		
		Rectangulo r1=new Rectangulo(1, 1);
		Rectangulo r2=new Rectangulo(2, 2);
		Rectangulo r3=(Rectangulo) r1.clone();
		
		assertTrue(r1.equals(r3));
		assertTrue(r1!=r3);
		

	}

}
