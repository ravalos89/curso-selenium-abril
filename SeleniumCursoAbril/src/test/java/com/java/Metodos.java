package com.java;

public class Metodos {
	
	// Ejecutar mi codigo
	public static void main(String[] args) {
		suma(10,2);
		suma(1,2);
		suma(0,2);
		suma(3,2);
		suma(10,1000);
	}
	
	public static void suma(int x, int y) {
		int sumaNum = x + y;
		sayHello("Spanish");
		System.out.println("Esta es la suma: " + sumaNum);
	}
	
	public static void sayHello() {
		System.out.println("Hello");
	}
	
	public static void sayHello(String lang) {
		
//		String languague = lang;
//		switch(languague) {
//		case "Spanish":
//			System.out.println("Hola");
//			break;
//		case "English":
//			System.out.println("Hello");
//			break;
//		}
	}
	
	public static int returnNum(int numero) {
		return numero;
	}

}
