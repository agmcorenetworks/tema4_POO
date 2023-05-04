package es.corenetwors.dam.programacion.tema4.ejercicioRepasoObbject2;

public class Robot implements Cloneable {

	private int name;
	private int model;
	private int clase;

	private static int numeroDeRobots = 0;
	
	static {
		System.out.println("numero de robots: "+numeroDeRobots);
		numeroDeRobots=5;
		System.out.println("numero de robots: "+numeroDeRobots);
	}

	public Robot(int name, int model, int clase) {
		this.name = name;
		this.model = model;
		this.clase = clase;
		numeroDeRobots++;
	}
	
	public Robot(Robot nuevo) {		
		this(nuevo.name,nuevo.model,nuevo.clase);
	}

	public int getName() {
		return name;
	}

	public void setName(int name) {
		this.name = name;
	}

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}

	public int getClase() {
		return clase;
	}

	public void setClase(int clase) {
		this.clase = clase;
	}

	// metodos de la clase object
	@Override
	public String toString() {
		return "[ Robot: name: " + name + " model: " + model + " clase: " + clase + "]";
	}

	@Override
	public boolean equals(Object obj) {	
		if(obj==null)
			return false;
		else if(this==obj){
			return true;
		}
		else if( !(obj instanceof Robot)){
			return false;
		}
		else {
			Robot temp=(Robot) obj;
			return this.getClase()==temp.getClase() && this.getModel()==temp.getModel() && this.getName()==temp.getName();
		}
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return new Robot(this.name, this.model, this.clase);
	}
	

}
