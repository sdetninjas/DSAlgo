package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
	//	waitFor(run);
		run.click();
		
	}
	
//	public void inputEditor(String code) {
//	//	waitFor(editor);
//		editor.sendKeys(code);
//	}
	
	public String getOutput() {
	//	waitFor(console);
		return console.getText();
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
