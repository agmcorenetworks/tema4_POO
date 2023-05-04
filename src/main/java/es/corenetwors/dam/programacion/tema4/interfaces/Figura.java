package es.corenetwors.dam.programacion.tema4.interfaces;

public class Figura implements Cloneable{

	protected String color;
	
	public void setColor(String color) {
		this.color=color;		
	}
	
	public String getColor() {
		return color;
	}	
	
	
	@Override
	public boolean equals(Object obj) {
		if(obj==null)
			return false;
		if(!(obj instanceof Figura))
			return false;
		if(this==obj)
			return true;
		else {
			Figura f=(Figura)obj;
			if(this.color==null && f.getColor()==null)
				return true;
			return this.color.equals(f.getColor());
		}
	}
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {

		return super.clone();
	}
}
