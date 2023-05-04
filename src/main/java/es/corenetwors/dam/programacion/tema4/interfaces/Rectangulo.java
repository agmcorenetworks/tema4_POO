package es.corenetwors.dam.programacion.tema4.interfaces;

public class Rectangulo extends Figura implements Intfigura{

	private int ancho;
	private int alto;
		
	public Rectangulo(int alto, int ancho){
		this.alto=alto;
		this.ancho=ancho;
	}
	
	@Override
	public int calculaArea() {
		// TODO Auto-generated method stub
		return ancho*alto;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj==null)
			return false;
		if(!(obj instanceof Rectangulo))
			return false;
		if(this==obj)
			return true;
		else {
			Rectangulo f=(Rectangulo)obj;
			if(super.equals(f)) {
				return this.ancho==f.ancho && this.alto == f.alto;
			}
			return false;
		}
	}
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub				
		Rectangulo fig= new Rectangulo(this.alto,this.ancho);
		fig.setColor(this.color);
		return fig;		
	}

}
