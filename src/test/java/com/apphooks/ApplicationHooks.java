package com.apphooks;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.drivermanager.DriverManagerFact;
import com.utility.ConfigReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class ApplicationHooks {

	private  DriverManagerFact driverFactory;
	private WebDriver driver;
	Properties prop;
	
	@Before(order=0)
	public void getProperty() {
		prop = ConfigReader.loadProperty();
	}
	
	@Before(order=1)
	public void launchBrowser() {
		String browserName = prop.getProperty("browser");
		driverFactory = new DriverManagerFact();
		driver = driverFactory.intializeDriver(browserName);
		
	}
	
	@After(order=0)
	public void quitBrowser() {
		driver.quit();
	}
	
	@After(order=1)
	public void tearDown(Scenario scenario) {
		
		if (scenario.isFailed()) {
			
			String screenshotName = scenario.getName().replaceAll(" "," _" );
			byte[] sourcePath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(sourcePath, "image/png", screenshotName);
		}
		
		
		
		
	}
	
}
