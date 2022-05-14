package com.orange;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.base.Base;
import com.base.GlobalVariables;
import com.orange.poc.Login;

public class LoginTestsPOM {
	
	WebDriver driver;
	Base base;
	Login login;
	String username,password, invalidPwd;
  
  @BeforeTest
  public void beforeTest() {
	  base = new Base(driver);
	  driver = base.setupChromeDriver();
	  login = new Login(driver);
	  
	  // External files
	  
	  // JSON files
//	  this.username = base.getJSONData(GlobalVariables.JSON_DATA_CREDENTIALS, GlobalVariables.JSON_KEY_USERNAME);
//	  this.password = base.getJSONData(GlobalVariables.JSON_DATA_CREDENTIALS, GlobalVariables.JSON_KEY_PASSWORD);
//	  this.invalidPwd = base.getJSONData(GlobalVariables.JSON_DATA_CREDENTIALS, GlobalVariables.JSON_KEY_INVALIDPWD);
	  
	  // Excel files
	  this.username = base.getCellData(GlobalVariables.JSON_DATA_CREDENTIALS, 1, 0);
	  this.password = base.getCellData(GlobalVariables.JSON_DATA_CREDENTIALS, 1, 1);
	  this.invalidPwd = base.getCellData(GlobalVariables.JSON_DATA_CREDENTIALS, 1, 2);
  }
  
  @Test
  public void tc006POM() {
	  
	  // Step 1 LaunchBrowser
	  base.launchBrowser(GlobalVariables.QA_URL);
	  
	  // Step 2 Enter username and password
	  // Step 3 Click on login button
	  login.loginOrange(username, password);
	  
	  // Step 4 - Validate you are logged successfully
	  Assert.assertTrue(login.userLoggedSuccessfully());
	  
  }
  
  @Test
  public void tc007POM() {
	  
	  // Step 1 LaunchBrowser
	  base.launchBrowser(GlobalVariables.QA_URL);
	  
	  // Step 2 Enter username and invalid password
	  // Step 3 Click on login button
	  login.loginOrange(username, invalidPwd);
	  
	  // Step 4 - Validate you are logged successfully
	  Assert.assertTrue(login.validateInvalidMsg());
	  
  }

  @AfterTest
  public void afterTest() {
	  base.closeDriver();
  }

}
