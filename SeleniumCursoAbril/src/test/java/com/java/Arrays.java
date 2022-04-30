package com.java;

public class Arrays {

	public static void main(String[] args) {
		
		// Arreglos
		
		// Unidimensional (Vector)
		String[] diasSemana = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "domingo"};
		 System.out.println("El dia de la semana es: " + diasSemana[0]);
		 
		 Boolean[] array1 = new Boolean[10];
		 
		 array1[0] = true;
		 array1[9] = false;
		 array1[5] = true;
		 array1[1] = true;
		 
		 System.out.println(array1[1]);
		 
		
		// bidimensional (MAtriz)
		String[][] nombres = new String[2][2];
		
		nombres[0][0] = "ricardo";
		nombres[0][1] = "Avalos";
		nombres[1][0] = "Pedro";
		nombres[1][1] = "avalos";
		
		System.out.println(nombres[0][0] + nombres[0][1]);
		
		// Multidimensional (Solo 3D se puede representar)
		
		String[][][][][] multiarray = new String[3][3][3][3][3];
		
		multiarray[0][0][0][0][0]= "Hello";
		multiarray[0][0][0][0][1]= "Hello";
		multiarray[0][0][0][1][0]= "Hello";
		multiarray[0][0][1][0][0]= "Hello";
		multiarray[0][1][0][0][0]= "Hello";
		
		
		System.out.println();
		
		

	}

}
