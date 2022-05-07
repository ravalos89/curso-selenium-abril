package com.java.polimorfismo;

public class Main {

	public static void main(String[] args) {
		
		// Polimorfismo
		Animal perro1 = new Perro();
		perro1.speak();
		
		perro1 = new Gato();
		perro1.speak();
		
		perro1 = new Gallo();
		perro1.speak();

	}

}
