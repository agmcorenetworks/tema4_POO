package es.corenetwors.dam.programacion.tema4.interfaces;

public class Circulo extends Figura implements Intfigura{

	
	private int radio;
	private final static double PI=3.14;

	public Circulo(int radio) {
		this.radio=radio;
	}
	
	@Override
	public int calculaArea() {
		// TODO Auto-generated method stub
		return (int) (radio*radio*PI);
	}
	
	int calcularDiametro() {
		return this.radio*2;
	}
	
	
}
