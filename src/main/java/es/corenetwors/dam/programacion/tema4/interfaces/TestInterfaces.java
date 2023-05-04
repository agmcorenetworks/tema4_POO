package es.corenetwors.dam.programacion.tema4.interfaces;

import java.util.ArrayList;

public class TestInterfaces {

	public static void main(String[] args) throws CloneNotSupportedException {
				
		Circulo c1=new Circulo(5);
		Figura f1=c1;
	
		Rectangulo r1=new Rectangulo(4,7);
		
		c1.calculaArea();
		c1.calcularDiametro();
				
		r1.calculaArea();
		r1.getColor();
		
		Intfigura if1=c1;
		if1.calculaArea();
		
		Intfigura if2=r1;
		if2.calculaArea();	
		
		//---------------------
		
		Figura fig1=new Figura();
		Figura fig2=new Figura();
		Figura fig3=fig2;
		Figura fig4=(Figura)fig2.clone();
		
	}

}
