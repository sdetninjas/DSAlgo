package com.drivermanager;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManagerFact {

	//public WebDriver driver;
	
	private static ThreadLocal<WebDriver> localDriver = new ThreadLocal<>();
	
	
	public static WebDriver intializeDriver(String browser) {
		System.out.println("Browser is : "+ browser);
		
		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			localDriver.set(new ChromeDriver());
		} else if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			localDriver.set(new FirefoxDriver());
		} else if (browser.equals("safari")) {
			WebDriverManager.safaridriver().setup();
			localDriver.set(new SafariDriver());
		} else if (browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			localDriver.set(new EdgeDriver()); 
		} else {
			System.out.println("Please enter correct browser: " + browser);
		}
	getDriver().manage().deleteAllCookies();
	getDriver().manage().window().maximize();
	getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	return getDriver();
	
	
	}
	
	public static synchronized WebDriver getDriver() {
		return localDriver.get();
		
	}
}