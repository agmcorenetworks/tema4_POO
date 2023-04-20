package es.corenetwors.dam.programacion.tema4.usothis;

public class Rectangulo {

	private int ancho;
	private int alto;
	
	Rectangulo(int an, int al){	
		
		ancho=an;
		this.ancho=an;
		this.alto=al;
	}
	
	public Rectangulo incrementarAlto(){
		this.alto++;
		return this;
	}
	
	public Rectangulo incrementarAncho(){
		ancho++;
		return this;
	}
	
	public int getAncho() {
		return ancho;
	}
	public void setAncho(int ancho) {
		this.ancho = ancho;
	}
	public int getAlto() {
		return alto;
	}
	public void setAlto(int alto) {
		this.alto = alto;
	}
	
	public static void main(String [] args) {
		Rectangulo c=new Rectangulo(5, 5);
		Rectangulo c1=new Rectangulo(50, 50);
		Rectangulo c2=c.incrementarAlto();
		if(c2==c) {
			System.out.println("son iguales, son el mismo objeto");
		}
	}
	
	
}
