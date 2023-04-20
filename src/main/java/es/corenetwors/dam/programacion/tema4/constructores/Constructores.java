package es.corenetwors.dam.programacion.tema4.constructores;

public class Constructores {

	private int numero;
	private int hora;

	//constructor sin parametros
	public Constructores() {
		this.hora = 5;
	}

	//constructor con un parametro
	public Constructores(int h) {
		//llamada al constructor sin parametros
		this();
		this.hora = h;
	}

	//constructor con varios parametros
	public Constructores(int h, String p) {
		//lamada al constructor con un parametro
		this(h);
		System.out.println(p);
	}

	public static void main(String[] args) {
		// llamamos al constructor definido sin parametros
		Constructores c1 = new Constructores(4, "hola");

	}

}
