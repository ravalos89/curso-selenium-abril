package com.java;

public class Main {

	public static void main(String[] args) {
		
		Humano ricardo = new Humano();
		ricardo.altura = 1.75;
		ricardo.colorCabello = "Cafe";
		ricardo.numBrazos = 2;
		ricardo.sexo = "Male";
		
		System.out.println("La altura de Ricardo es: " + ricardo.altura + " mts");
		
		Humano erik = new Humano(1.70, "Male", "Negro");
		System.out.println("La altura de Erik es: " + erik.altura + " mts");
		System.out.println("El color de cabello de Erik es: " + erik.colorCabello);
		
		Humano dani = new Humano(1.80, "Male", "Negro");
		System.out.println("Dani tiene "+ dani.numBrazos + " brazos");
		
		dani.caminar();
		
	}

}
