package com.apphooks;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.drivermanager.DriverManagerFact;
import com.utility.ConfigReader;
import com.utility.LoggerLoad;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class ApplicationHooks {

	private WebDriver driver;
	Properties prop;
	
	private static String browserName;
	
	public static void setBrowserName(String browser) {
		browserName = browser;
	}
	
	public static String getBrowserName(String browser) {
		
		return browserName;
	}
	
	@Before(order=0)
	public void getProperty() {
		prop = ConfigReader.loadProperty();
	}
	
	
	@Before(order=1)
	public void launchBrowser() {
		driver = DriverManagerFact.intializeDriver(browserName);
	}
	
	@BeforeStep
	public void beforeStepLog(Scenario sc) {
		LoggerLoad.info("Before Step : " + sc.getName() +" " + sc.getLine());
		
	}
	
	@AfterStep
	public void afterStepLog(Scenario sc) {
		LoggerLoad.info("After Step : " + sc.getName() +" " + sc.getLine());
		//sc.getSourceTagNames().stream().forEach(a -> LoggerLoad.info("SourceTagName " + a));
		
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
