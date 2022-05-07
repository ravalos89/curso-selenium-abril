package com.java.encapsulation;

public class Gato {
	
	private String color;
	private int numPatas, edad;
	private String raza;
	
	//Encapsulation (Getter & Setter)
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public int getNumPatas() {
		return numPatas;
	}
	
	public void setNumPatas(int numPatas) {
		if(numPatas > 10) {
			this.numPatas = -1;
		}else {
			this.numPatas = numPatas;
		}		
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String getRaza() {
		return raza;
	}
	
	public void setRaza(String raza) {
		this.raza = raza;
	}
	

	
	

}
