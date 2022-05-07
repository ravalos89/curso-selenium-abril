package com.java.access;

public class HelloWorld {
	
	public void sayHelloPublic() {
		System.out.println("Hello World, im a public method!");
	}
	
	protected void sayHelloProtected() {
		System.out.println("Hello World, im a protected method!");
	}
	
	void sayHelloDefault() {
		System.out.println("Hello World, im a default method!");
	}
	
	private void sayHelloPrivate() {
		System.out.println("Hello World, im a Private method!");
	}
	
	
	// XPATH ABSOLUTO
//	/html/body/div[1]/div/div[3]/div[1]/img
	
	// XPATH RELATIVO
	//img[contains(@src, 'logo')]

}
