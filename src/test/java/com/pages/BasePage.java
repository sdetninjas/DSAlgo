	package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.drivermanager.DriverManagerFact;
import com.utility.ConfigReader;

public abstract class BasePage {
	
	
		protected static WebDriver driver = DriverManagerFact.getDriver();
		protected String BASE_URL=ConfigReader.getProperty("BASE_URL");
		
		public BasePage() {
			driver = DriverManagerFact.getDriver();
			PageFactory.initElements(driver, this);
		}
		
		
		public abstract void openPage();
		
		public String getPageTitle() {
			return driver.getTitle();
			
		}
		
		protected void waitFor() {
			waitFor(ConfigReader.getPropertyInt("default_wait_time"));
			
		}
		
		protected String getValidationMessage(By we) {
			return driver.findElement(we).getAttribute("validationMessage");
		}
		
		protected String getValidationMessage(WebElement we) {
			return we.getAttribute("validationMessage");
		}
		
		protected void waitFor(long milliseconds ) {
			try {
				Thread.sleep(milliseconds);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}
		}

	

}
