	package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

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
		
		public void inputEditor(String code) {
			
			WebElement codeMirror = driver.findElement(By.className("CodeMirror"));

			/* getting the first line of code inside codemirror and clicking it to bring it in focus */
			WebElement codeLine = codeMirror.findElements(By.className("CodeMirror-line")).get(0);
			codeLine.click();

			/* sending keystokes to textarea once codemirror is in focus */
			WebElement txtbx = codeMirror.findElement(By.cssSelector("textarea"));
			txtbx.sendKeys(Keys.CONTROL + "a" + Keys.DELETE);
			txtbx.sendKeys(code);
			
			
		}

		
	

		
}