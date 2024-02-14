package com.DriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManagerFact {

	public WebDriver driver;
	
	public static ThreadLocal<WebDriver> localDriver = new ThreadLocal<>();
	
	public WebDriver intializeDriver(String browser) {
		System.out.println("Browser is : "+ browser);
		
		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			localDriver.set( new ChromeDriver());
	
	}
		else if (browser.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			localDriver.set( new FirefoxDriver());
	}
		else if (browser.equals("Safari")) {
			WebDriverManager.safaridriver().setup();
			localDriver.set( new SafariDriver());
	}
		else {
			System.out.println("Please enter correct browser: "+ browser);
		}
	getDriver().manage().deleteAllCookies();
	getDriver().manage().window().maximize();
	return getDriver();
	
	
	}
	
	public static synchronized WebDriver getDriver() {
		return localDriver.get();
		
	}
}