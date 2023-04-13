package es.corenetwors.dam.programacion.tema4.ejercicioObjetosComplejosRepaso2;

public class Frigorifico extends Electrodomestico{
	
	//atributo
	private int temperatura;
	
	//constructor parámetros
	public Frigorifico (int temperatura, String marca, String modelo, int consumo) {
		super(marca, modelo, consumo);
		this.temperatura = temperatura;
	}
	
	//constructor copia
	public Frigorifico(Frigorifico f1) {
		super(f1.marca, f1.modelo, f1.consumo);
		this.temperatura = f1.temperatura;
	}

	//get y set
	public int getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Frigorifico: " + super.toString() + " - temperatura: " + this.temperatura;
	}
	
	@Override
	public boolean equals(Object obj) {
		Frigorifico f2 = (Frigorifico) obj;
		if (this == f2)
			return true;
		else {
			if(this.temperatura == f2.temperatura)
				return super.equals(obj);
			return false;
		}
		
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		Electrodomestico padre = (Electrodomestico) super.clone();
	return new Frigorifico (this.temperatura, padre.marca, padre.modelo, padre.consumo); 	
	}
	
	
	

}
