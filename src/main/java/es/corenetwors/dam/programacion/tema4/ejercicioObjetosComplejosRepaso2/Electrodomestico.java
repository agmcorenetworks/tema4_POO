package es.corenetwors.dam.programacion.tema4.ejercicioObjetosComplejosRepaso2;

public class Electrodomestico {
	//atributos
	protected String marca;
	protected String modelo;
	protected int consumo;
	
	//constructor parámetros
	public Electrodomestico (String marca, String modelo, int consumo) {
		this.marca = marca;
		this.modelo = modelo;
		this.consumo = consumo;
	}
	
	//constructor copia
	public Electrodomestico (Electrodomestico e) {
		this.marca = e.marca;
		this.modelo = e.modelo;
		this.consumo = e.consumo;
	}

	//setters y getters
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getConsumo() {
		return consumo;
	}

	public void setConsumo(int consumo) {
		this.consumo = consumo;
	}

	@Override
	public String toString() {
		return "Electrodomestico [marca=" + marca + ", modelo=" + modelo + ", consumo=" + consumo + "]";
	}
	
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Electrodomestico e1 = (Electrodomestico) obj;
		if(this == e1)
			return true;
		else{
			if (this.marca.equals(e1.marca) && this.modelo.equals(e1.modelo) && this.consumo == e1.consumo)
				return true;
			return false;
		}
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return new Electrodomestico(this.marca, this.modelo, this.consumo);
	}

}
