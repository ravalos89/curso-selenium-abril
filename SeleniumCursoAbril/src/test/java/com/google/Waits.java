package com.google;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Waits {
	@Test
	public void f() {
		ChromeOptions chromeOpt = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOpt);

		driver.get("https://computer-database.gatling.io/computers");
		
		// Implicit wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		// Explicit wait
		WebDriverWait explicitWait = new WebDriverWait(driver, 15);
		explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("add")));
		
		driver.findElement(By.id("searchbox")).sendKeys("Computer");
		
		boolean isDisplayed = driver.findElement(By.id("searchsubmit")).isDisplayed();
		boolean isDisplayed2 = driver.findElement(By.id("add")).isDisplayed();
		
		isDisplayed = false;
		isDisplayed2 = false;
		
//		// Validacion - HARD ASSERTION
//		Assert.assertTrue(isDisplayed, "Displayed filter by name");
		
		
//		SOFT ASSERTION
		SoftAssert softAssert = new SoftAssert();
		
//		Validation #1
		softAssert.assertTrue(isDisplayed, "Displayed filter by name");
//		Validation #2		
		softAssert.assertTrue(isDisplayed2, "Displayed Add new computer");
		
		
		String actualHEader = driver.findElement(By.xpath("//section/h1")).getText();
		
		softAssert.assertEquals(actualHEader, "575 computers found");
		
		
		softAssert.assertAll();
		
		

		driver.close();
	}
}
