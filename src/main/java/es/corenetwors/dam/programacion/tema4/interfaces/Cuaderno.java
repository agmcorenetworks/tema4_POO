package es.corenetwors.dam.programacion.tema4.interfaces;

public class Cuaderno {

	int tipo;
	Rectangulo c;
	
	@Override
	public boolean equals(Object obj) {
		if(obj==null)
			return false;
		if(!(obj instanceof Figura))
			return false;
		if(this==obj)
			return true;
		else {
			Cuaderno cuad=(Cuaderno)obj;
			if(this.tipo==cuad.tipo) {
				return this.c.equals(cuad.c);
			}
			return false;
		}
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Rectangulo clonedCuad=(Rectangulo) c.clone();
		
		Cuaderno cuadernoClonado=new Cuaderno();
		cuadernoClonado.tipo=this.tipo;
		cuadernoClonado.c=clonedCuad;
		return cuadernoClonado;
				
	}
	
	
}
