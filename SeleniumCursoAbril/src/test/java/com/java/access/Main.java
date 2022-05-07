package com.java.access;

public class Main {

	public static void main(String[] args) {
		
		HelloWorld hello = new HelloWorld();
		hello.sayHelloPublic();
		
		hello.sayHelloProtected();
		
		hello.sayHelloDefault();
		
//		hello.sayHelloPrivate();

	}

}
