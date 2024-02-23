package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LinkedListPage extends BasePage {

	@Override
	public void openPage() {
		driver.get(BASE_URL + "linkedlist");
		
					
	}
	
	@FindBy (xpath = "//*[@href='linkedlist']")
	private WebElement linkedlistGetStartedBtn;
	@FindBy (xpath= "//*[@href='/tryEditor']")
	private WebElement tryEditorBtn;


	public void clickByName(String pagename) {
		String newName = pagename.toLowerCase().replaceAll(" " , "-");
		String newXpath = "//*[@href='"+newName	+ "']" ;
		waitFor(1000);
		WebElement pageWe = driver.findElement(By.xpath(newXpath));
		
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", pageWe);
		waitFor(800);
		pageWe.click();
	}
	
	public void clickarrayGetStartedBtn() {
		linkedlistGetStartedBtn.click();
		
	}
	
	public void clickTryEditorBtn() {
		tryEditorBtn.click();
		
	}


}
