package com.java.encapsulation;

public class Main {

	public static void main(String[] args) {
		
		Gato gato1 = new Gato();
//		gato1.color = "Cafe";
//		gato1.edad = 4;
//		gato1.numPatas = 100000000;
//		gato1.raza = "Egipcio";
		
		gato1.setColor("Cafe");
		gato1.setEdad(4);
		gato1.setNumPatas(9);
		gato1.setRaza("Egipcio");
		
		System.out.println("Mi Gato tiene "+ gato1.getNumPatas() + " patas");

	}

}
