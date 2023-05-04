package es.corenetwors.dam.programacion.tema4.ejercicioRepasoObbject2;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

public class TestRobot {
	@Test
	void test_robot_class() throws CloneNotSupportedException {
		System.out.println("primera linea");
		Robot r1 = new Robot(0, 0, 0);
		System.out.println("segunda linea");
		Robot r2 = new Robot(1, 1, 1);
		Robot r5 = (Robot) r2.clone();
		Robot r3 = r1;
		Robot r4 = (Robot) r1.clone();

		assertTrue(r3 == r1);

		assertFalse(r4 == r1);
		assertTrue(r4.equals(r1));

		assertFalse(r5 == r1);
		assertTrue(r5.equals(r2));

	}

}
