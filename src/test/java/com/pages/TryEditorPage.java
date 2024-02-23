package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TryEditorPage extends BasePage{
	@FindBy(xpath="//a[text()='Try here>>>']")
	private WebElement tryHere ;
	
	@FindBy(xpath="//*[@id='answer_form']/button")
	private WebElement run; 
	
	@FindBy(xpath="//form[@id='answer_form']/div/div/div/textarea")
	private WebElement editor;
	
	@FindBy(id="output")
	private WebElement console;

	@Override
	public void openPage() {
		
		driver.get(BASE_URL + "tryEditor");
	}
	
	public void runBtn() {
		run.click();
		
	}
	
	public void inputEditor(String code) {
		
		editor.sendKeys(code);
	}
	
	public String getOutput() {
		return console.getText();
	}

}
