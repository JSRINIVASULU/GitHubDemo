package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerDemo {
	WebDriver driver;
	String url = "https://www.demoqa.com";
	
	@BeforeMethod
	public void setup() {

		ChromeOptions chromeOptions = new ChromeOptions();
		 WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(chromeOptions);
		 
		driver.manage().window().maximize();
	}

	@Test
	public void webDriverManagerTest() {

		driver.get(url);
		String titleString = driver.getTitle();
		System.out.println("Page Title is: " + titleString);

	}
	
	@Test
	public void webDriverManagerTest1() {

		driver.get(url);
		String titleString = driver.getTitle();
		System.out.println("Page Title is: " + titleString);

	}
	
	@Test
	public void webDriverManagerTest3() {

		driver.get(url);
		String titleString = driver.getTitle();
		System.out.println("Page Title is: " + titleString);

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
