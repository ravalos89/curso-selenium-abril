package com.java;

public class Condicionales {

	public static void main(String[] args) {
		
		// Exceso de velocidad
		
		int velocidad = 90; // km/h
		int limiteVelocidad = 60;
		boolean isCarretera = false;
		
		if(isCarretera) {
			limiteVelocidad=110;
			
			if(velocidad>limiteVelocidad) {
				System.out.println("Multa -- Carretera");
			}else {
				System.out.println("Descuento -- Carretera");
			}
		}else {
			if(velocidad>limiteVelocidad) {
				System.out.println("Multa -- Calle");
			}else {
				System.out.println("Descuento -- Calle");
			}
		}
		
		// Represenatr un valor numerico a texto
		int numero = 3; 
		
		switch(numero) {
		
		case 1:
			System.out.println("Uno");
			break;
			
		case 2: 
			System.out.println("Dos");
			break;
			
		case 3:
			System.out.println("Tres");
			break;
			
		case 100:
			System.out.println("cien");
			break;
			
			default:
				System.out.println("Numero no existe en los cases");
				break;
		
		}
		
		
		
		

	}

}
