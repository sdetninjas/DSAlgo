package com.pages;

import org.openqa.selenium.WebDriver;

import com.drivermanager.DriverManagerFact;
import com.utility.ConfigReader;

public class BasePage {
	
	
		protected static WebDriver driver = DriverManagerFact.getDriver();
		protected String BASE_URL=ConfigReader.getProperty("BASE_URL");
		
		
		
		public void openPage() {
			driver.get(BASE_URL);
			
		}
		
		protected void waitFor() {
			waitFor(ConfigReader.getPropertyInt("default_wait_time"));
			
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
