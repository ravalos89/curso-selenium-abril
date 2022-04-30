package com.java.herencia;

public class Hijo extends Padre{

	public Hijo(String tipoSangre) {
		super(tipoSangre);
	}
	
	public void enfermedades() {
		System.out.println("diabetes");
	}

}
