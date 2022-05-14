package com.google;

public class Main {
	String berry = "blue";

	public static void main(String[] args) {
		new Main().juicy("straw");
	}

	void juicy(String berry) { this.berry = "rasp"; System.out.println(berry + "berry"); 
	}
	}
