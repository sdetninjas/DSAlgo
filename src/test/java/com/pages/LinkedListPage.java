package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LinkedListPage extends BasePage {

		
	@FindBy (xpath = "//*[@href='linked-list']")
	private WebElement linkedlistGetStartedBtn;
	@FindBy (xpath= "//*[@href='/tryEditor']")
	private WebElement tryEditorBtn;
	@FindBy (xpath= "//*[@href='/linked-list/practice']")//*[@id="content"]/a
	private WebElement practice;
	
	@Override
	public void openPage() {
		driver.get(BASE_URL + "linkedlist");
		
					
	}
	
	public void openIntroPage() {
		driver.get(BASE_URL + "linked-list/introduction/");		
					
	}

	public void clickByName(String pagename) {
		String newName = pagename.toLowerCase().replaceAll(" " , "-");
		String newXpath = "//*[@href='"+newName	+ "']" ;
		waitFor(1000);
		WebElement pageWe = driver.findElement(By.xpath(newXpath));
		
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", pageWe);
		waitFor(800);
		pageWe.click();
	}
	
	public void clickPractice() {
		
		practice.click();
	}
	public void clickarrayGetStartedBtn() {
		linkedlistGetStartedBtn.click();
		
	}
	
	public void clickTryEditorBtn() {
		tryEditorBtn.click();
		
	}


}
