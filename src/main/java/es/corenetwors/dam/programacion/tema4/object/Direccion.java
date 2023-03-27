package es.corenetwors.dam.programacion.tema4.object;

public class Direccion {

	String calle;
	int numero;
	int cp;

	public Direccion(String calle, int numero, int cp) {
		this.calle = calle;
		this.numero = numero;
		this.cp = cp;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getCp() {
		return cp;
	}

	public void setCp(int cp) {
		this.cp = cp;
	}

	@Override
	public boolean equals(Object obj) {
		Direccion d = (Direccion) obj;
		return (this.calle == d.calle && this.numero == d.numero && this.cp == d.cp);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Direccion d1 = new Direccion(this.calle, 
				this.numero, 
				this.getCp());
		return d1;
	}

}
