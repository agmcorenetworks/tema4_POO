package es.corenetwors.dam.programacion.tema4.pasoDeParametros;

public class PasoDeParametros {

	public static void main(String[] args) {		
		int a=5;
		System.out.println("a: "+a);
		a		=cambiaValor(a);
		System.out.println("a: "+a);
		
		Test t=new Test();
		System.out.println("t.a: "+t.a);
		cambiaReferencia(t);
		System.out.println("t.a: "+t.a);
	}
	
	static int cambiaValor(int a){
		a = 9;
		return a;
	}
	
	static void cambiaReferencia(Test t){
		t.a = 9;
	}
}

class Test{
	int a=5;
}
