	package com.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.drivermanager.DriverManagerFact;
import com.utility.ConfigReader;
import com.utility.LoggerLoad;

public abstract class BasePage {
	
	
		protected WebDriver driver = DriverManagerFact.getDriver();
		protected String BASE_URL=ConfigReader.getProperty("BASE_URL");
		
		public BasePage() {
			
			PageFactory.initElements(driver, this);
			LoggerLoad.info("Creating Object " + this + "for the driver " +  driver);
		}
		
		
		public abstract void openPage();
		
		public String getPageTitle() {
			return driver.getTitle();
			
		}
		
		public void waitFor() {
			waitFor(ConfigReader.getPropertyInt("default_wait_time"));
			
		}
		
		protected String getValidationMessage(By we) {
			return driver.findElement(we).getAttribute("validationMessage");
		}
		
		protected String getValidationMessage(WebElement we) {
			return we.getAttribute("validationMessage");
		}
		
		public void navigateBack() {
			driver.navigate().back();
			
		}
		
		public String getAlertText() {
			return driver.switchTo().alert().getText();
			
		}
		
		public void acceptAlertText() {
			driver.switchTo().alert().accept();
			
		}
//		public void waitFor(WebElement we) {
//		
//			
//			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//			wait.until(ExpectedConditions.elementToBeClickable(we));
//			
//		
//		}
		
		public void waitFor(long milliseconds ) {
			try {
				Thread.sleep(milliseconds);
			} catch (InterruptedException e) {
			
				e.printStackTrace();
				
			}
		}
		
	

		
}