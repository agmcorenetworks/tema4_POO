package es.corenetwors.dam.programacion.tema4.ejercicioObjetosCompuestos;

public class Direccion {

	private String calle;
	private int numero;
	private Localidad l;
	
	// Constructor
	public Direccion(String calle,int numero, Localidad l) {
		this.calle = calle;
		this.numero = numero;
		this.l = l;
	}
	
	
	// Metodo toString
	@Override
	public String toString() {
		return "Direccion: numero=" + numero ;
	}

	// Metodos Getter y Setters
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
	//Metodo clone
	@Override
	public Object clone() throws CloneNotSupportedException {
		
		Localidad l1 = (Localidad) this.l.clone();
		
		Direccion d1 = new Direccion(this.calle, this.numero, l1);
		return d1;
	}
	
	// Metodo equals
	@Override
	public boolean equals(Object obj) {

		Direccion d1 = (Direccion) obj;
		
		if (obj == this) {
			return true;
		}else {
			if(this.calle.equals(d1.calle) && this.numero == d1.numero)
			
				return true;
				
			return false;	
		}
	}
	
	
}
