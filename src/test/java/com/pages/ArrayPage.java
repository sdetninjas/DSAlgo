package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ArrayPage extends BasePage{
	
	
	@FindBy (xpath = "//*[@href='array']")
	private WebElement arrayGetStartedBtn;
	@FindBy (xpath= "//*[@href='/tryEditor']")
	private WebElement tryEditorBtn;
	@FindBy (id = "editor")
	private WebElement inputEditor;
	
	@FindBy(xpath="//button")
	private WebElement run; 
	
	@FindBy(className="button")
	private WebElement submit; 
	
	@FindBy(id="output")
	private WebElement console;

	@Override
	public void openPage() {
		driver.get(BASE_URL + "array");
	}

	
	public void openArrayPythonPage() {
		driver.get(BASE_URL + "array/arrays-in-python/");
	}
	
	public void openPracticePage() {
		driver.get(BASE_URL + "array/practice");
	}
	
	public void openAssessmentPage() {
		driver.get(BASE_URL + "question/1");
	}
	public void clickByName(String pagename) {
		//String newName = pagename.toLowerCase().replaceAll(" " , "-");
		//String newXpath = "//*[@href='"+newName	+ "']" ;
		waitFor(1000);
		WebElement pageWe = driver.findElement(By.linkText(pagename));
		
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
	
	public void runBtn() {
		run.click();
		
	}
	
	public void submitBtn() {
		submit.click();
		
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
	
	public String getOutput() {
		return console.getText();
	}


	
	
}
