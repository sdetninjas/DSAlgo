package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ArrayPage extends BasePage{
	
	
	@FindBy (xpath = "//*[@href='array']")
	WebElement arrayGetStartedBtn;

	@Override
	public void openPage() {
		driver.get(BASE_URL + "array");
	}
	
//	public void clickLink(WebElement we) {
//		we.click();
//		
//	}
	
	public void clickarrayGetStartedBtn() {
		arrayGetStartedBtn.click();
		
	}

}
