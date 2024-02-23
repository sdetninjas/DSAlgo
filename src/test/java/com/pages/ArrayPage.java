package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ArrayPage extends BasePage{
	
	
	@FindBy (xpath = "//*[@href='array']")
	private WebElement arrayGetStartedBtn;
	@FindBy (xpath= "//*[@href='/tryEditor']")
	private WebElement tryEditorBtn;
	
//	@FindBy(xpath="//a[text()='Try here>>>']")
//	private WebElement tryHere ;
//	
//	@FindBy(xpath="//*[@id='answer_form']/button")
//	private WebElement run; 
//	
//	@FindBy(xpath="//form[@id='answer_form']/div/div/div/textarea")
//	private WebElement editor;

	@Override
	public void openPage() {
		driver.get(BASE_URL + "array");
	}

	
	public void openArrayPythonPage() {
		driver.get(BASE_URL + "array/arrays-in-python/");
	}
	
	public void openPracticePage() {
		driver.get(BASE_URL + "array/practice/");
	}
	
	public void openAssessmentPage() {
		driver.get(BASE_URL + "question/1");
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
	
	public void clickarrayGetStartedBtn() {
		arrayGetStartedBtn.click();
		
	}
	
	public void clickTryEditorBtn() {
		tryEditorBtn.click();
		
	}
	
	
}
