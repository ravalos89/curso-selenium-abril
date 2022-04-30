package com.java.herencia;

public class Main {

	public static void main(String[] args) {
		 
		Padre juan = new Padre("0+");
		System.out.println("Juan tiene el tipo de Sangre "+ juan.tipoSangre);
		
		Hijo ricardo = new Hijo("0+");
		System.out.println("Ricardo tiene el tipo de Sangre "+ ricardo.tipoSangre);
		
		Nieto ricardito = new Nieto("0+");
		ricardito.deporte();
		ricardito.temperamento();
		ricardito.enfermedades();
	}

}
