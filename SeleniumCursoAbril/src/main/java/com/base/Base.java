package com.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	private WebDriver driver;
	
	/* HEADER
	 * Constructor principal
	 * @author ricardo.avalos
	 * @param 
	 * @throws
	 * @return
	 * @date
	 */
	public Base(WebDriver driver) {
		this.driver = driver;
	}
	
	/*
	 * Chrome driver set up
	 * 
	 */
	public WebDriver setupChromeDriver() {
		ChromeOptions chromeOpt = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(chromeOpt);
		return driver;
	}
	
	/*
	 * Launch browser
	 */
	public void launchBrowser(String url) {
		try {
			driver.get(url);
			driver.manage().window().maximize();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * Type
	 */
	public void type(By locator, String inputText) {
		driver.findElement(locator).sendKeys(inputText);
	}
	
	/*
	 * Click object
	 */
	public void click(By locator) {
		driver.findElement(locator).click();
		// add code
		// add action
		// add screenshot
		// add code
	}
	
	/*
	 * is displayed object?
	 */
	public boolean isDisplayed(By locator) {
		return driver.findElement(locator).isDisplayed();
	}
	
	/*
	 * driver close
	 */
	public void closeDriver() {
		driver.close();
	}
	
	/*
	 * Get Text
	 */
	public String getText(By locator) {
		return driver.findElement(locator).getText();
	}
	
	/**
	 * Get Data from JSON file (Directly)
	 * 
	 * @author Ricardo Avalos
	 * @param jsonFile, jsonKey
	 * @return jsonValue
	 * @throws NA
	 */
	public String getJSONData(String jsonFileObj, String jsonKey){
		try {

			// JSON Data
			InputStream inputStream = new FileInputStream(GlobalVariables.PATH_JSON_DATA + jsonFileObj + ".json");
			JSONObject jsonObject = new JSONObject(new JSONTokener(inputStream));

			// Get Data
			String jsonValue = (String) jsonObject.get(jsonKey);
			return jsonValue;

		} catch (FileNotFoundException e) {
			Assert.fail("JSON file is not found");
			return null;
		}
	}
	
	/*
	 * Get Value from Excel
	 * @author Ricardo Avalos 
	 * @date 02/18/2019
	 */
	public String getCellData(String excelName, int row, int column) {
		try {
			// Reading Data
			FileInputStream fis = new FileInputStream(GlobalVariables.PATH_EXCEL_DATA+excelName+".xlsx");
			// Constructs an XSSFWorkbook object
			@SuppressWarnings("resource")
			Workbook wb = new XSSFWorkbook(fis);
			Sheet sheet = wb.getSheetAt(0);
			Row rowObj = sheet.getRow(row);
			Cell cell = rowObj.getCell(column);
			String value = cell.getStringCellValue();
			return value;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return null;
		} catch (IOException e1) {
			e1.printStackTrace();
			return null;
		}
	}
	

}
