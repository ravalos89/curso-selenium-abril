package com.orange.poc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.base.Base;
import com.base.GlobalVariables;

public class Login extends Base{

	public Login(WebDriver driver) {
		super(driver);
	}
	
	// Objects
	By txtUsername = By.id("txtUsername");
	By txtPassword = By.id("txtPassword");
	By btnLogin = By.id("btnLogin");
	By lnkWelcome = By.xpath("//*[@id='welcome']");
	By lblInvalidCredential = By.xpath("//*[@id='spanMessage']");
	
	// Custom methods
	
	/*
	 * Login orange
	 */
	public void loginOrange(String username, String password) {
		type(txtUsername, username);
		type(txtPassword, password);
		click(btnLogin);		
	}
	
	/*
	 * Validate user is logged successfully
	 */
	public boolean userLoggedSuccessfully() {
		return isDisplayed(lnkWelcome);
	}
	
	/*
	 * Validate invalid message
	 */
	public boolean validateInvalidMsg() {
		String actualMsg = getText(lblInvalidCredential);
		if(actualMsg.equals(GlobalVariables.INVALID_CRED_MSG)) {
			return true;
		}else {
			return false;
		}	
	}

}
