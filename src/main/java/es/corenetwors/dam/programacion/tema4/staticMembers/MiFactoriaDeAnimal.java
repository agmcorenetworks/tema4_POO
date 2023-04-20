package es.corenetwors.dam.programacion.tema4.staticMembers;

import es.corenetwors.dam.programacion.tema4.object.Animal;

public class MiFactoriaDeAnimal {
	
	private static Animal animal;
	public static int contadorAnimales=0;
	
	public static Animal getAnimal() {
		if(animal == null) {
			animal=new Animal();
			return animal;
		}
		contadorAnimales++;

		return animal;
	}
	
	public static void main (String [] args) {
		Animal a1=new Animal();
		Animal a2=new Animal();
		System.out.println(a1==a2);
						
		MiFactoriaDeAnimal mf1=new MiFactoriaDeAnimal();
		Animal a6 =mf1.getAnimal();
		System.out.println(MiFactoriaDeAnimal.contadorAnimales);
		Animal a3=MiFactoriaDeAnimal.getAnimal();
		System.out.println(MiFactoriaDeAnimal.contadorAnimales);
		
		Animal a4=MiFactoriaDeAnimal.getAnimal();
		System.out.println(MiFactoriaDeAnimal.contadorAnimales);
		Animal a5=MiFactoriaDeAnimal.getAnimal();
		System.out.println(MiFactoriaDeAnimal.contadorAnimales);
		
		System.out.println(a3==a4);
		System.out.println(a3==a5);
		System.out.println(a4==a5);

		


	}
	

}
