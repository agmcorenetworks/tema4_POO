package es.corenetwors.dam.programacion.tema4.object;

/**
 * Clonado básico
 * 
 * @author Programación
 *
 */
public class Animal {

	int edad;
	int numeroDePatas;

	public Animal() {
		this.edad = 0;
		this.numeroDePatas = 4;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Animal a = new Animal();
		a.edad = this.edad;
		a.numeroDePatas = this.numeroDePatas;
		return a;
	}

	public static void main(String[] args) throws CloneNotSupportedException {

		Animal a = new Animal();
		Animal ab = (Animal) a.clone();
		Animal ac = new Animal();
		a.equals(ac);

		Casa c = new Casa();
		Casa c2 = (Casa) c.clone();
		Casa c3 = new Casa();
		c.equals(c3);
		System.out.println("a ver q pasa");

	}

}

class Casa {

	int puertas;
	int ventanas;

	public Casa() {
		this.puertas = 1;
		this.ventanas = 1;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Casa c = new Casa();
		c.puertas = this.puertas;
		c.ventanas = this.ventanas;
		return c;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj != null) {
			if (this != obj) {
				if ((obj instanceof Casa)) {
					// Hacemos un moldeado del Object general a tipo java511
					Casa temp = (Casa) obj;

					// Se realiza la comparacion y se devuelve el resultado
					return (this.puertas == temp.puertas && this.ventanas == temp.ventanas);
				} else {
					// No es del tipo esperado
					return (false);
				}
			} else
				return true;
		}
		return false;

	}

}
