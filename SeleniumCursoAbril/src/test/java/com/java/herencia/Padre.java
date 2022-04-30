package com.java.herencia;

public class Padre {
	
	String tipoSangre;
	
	public Padre(String tipoSangre) {
		this.tipoSangre = tipoSangre;
	}
	
	public void deporte() {
		System.out.println("Jugar Futbol soccer");
	}
	
	public void temperamento() {
		System.out.println("Relajada");
	}

}
