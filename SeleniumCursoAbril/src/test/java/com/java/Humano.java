package com.java;

public class Humano {
	
	// State
	double altura;
	String sexo;
	int numBrazos;
	String colorCabello;
	
	// Constructor
	public Humano(double altura, String sexo, int numBrazos, String colorCabello) {
		this.altura = altura;
		this.sexo = sexo;
		this.numBrazos = numBrazos;
		this.colorCabello = colorCabello;
	}
	
	public Humano() {
		
	}
	
	public Humano(double altura, String sexo, String colorCabello) {
		this.altura = altura;
		this.sexo = sexo;
		this.numBrazos = 2;
		this.colorCabello = colorCabello;
	}
	
	
	// Behavior - Comportamiento
	public void caminar() {
		System.out.println("La persona esta caminando");
	}

	
}
