package com.orange;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class LoginTests {

	@BeforeTest
	public void beforeTest() {

	}

	@Test
	public void tc006() {

// Reglas antes de empezar el desarrollo

//		- entender el script o test case
//		- Correr la prueba manual
//		- Autonomo?
//		- Obtener objetos involucrados
//		- Automatizar!

		// Step 1 - Launch browser app
		ChromeOptions chromeOpt = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOpt);

		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();

		// Step 2 - Enter username and password
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");

		// Step 3 - Click on login button
		driver.findElement(By.id("btnLogin")).click();

		// Step 4 - Validate you are logged successfully
//		boolean welcomeIsDisplayed = driver.findElement(By.id("welcome")).isDisplayed();
		boolean welcomeIsDisplayed = driver.findElement(By.xpath("//*[@id='welcome']")).isDisplayed();
		Assert.assertTrue(welcomeIsDisplayed);

		driver.close();

	}

	@Test
	public void tc007() {

		// Step 1 - Launch browser app
		ChromeOptions chromeOpt = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOpt);

		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();

		// Step 2 - Enter valid Username and invalid password
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("passwordI1233");

		// Step 3 - Click on login button
		driver.findElement(By.id("btnLogin")).click();

//		Step 4 - Validate message invalid password
//				boolean welcomeIsDisplayed = driver.findElement(By.id("welcome")).isDisplayed();
		String actualInvalidMessage = driver.findElement(By.xpath("//*[@id='spanMessage']")).getText();
		Assert.assertEquals(actualInvalidMessage, "Invalid credentials");

		driver.close();

	}

	@Test
	public void tc008() {

	}

	@AfterTest
	public void afterTest() {
	}

}
