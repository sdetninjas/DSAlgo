package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage{
	
	
	@FindBy(id="id_username")
	private WebElement userName;

	
	@FindBy(id="id_password")
	private WebElement passWord;
	
	
	@FindBy(xpath="//input[@value='Login']")
	private WebElement logInBtn;
	
	@FindBy(className = "alert-primary")
	private WebElement errorBox;
	
	@Override
	public void openPage() {
		
		driver.get(BASE_URL + "login");
	}
	public void enterUserNameId(String username) {
		userName.sendKeys(username);
		
	}
	public void enterPassword(String password) {
		passWord.sendKeys(password);
	}
		
	public String getUserNamesValidationMessage() {
			return getValidationMessage(userName);
		}
		
		public String getPasswordsValidationMessage() {
			return getValidationMessage(passWord);
		}	
		
	public void clickOnLogin() {
		logInBtn.click();
		
		
	}
	public String getErrorMessage() {
		return errorBox.getText();
	}
//	public void enterLoginCreds(String username, String password) {
//		userName.sendKeys(username);
//		passWord.sendKeys(password);
//		logInBtn.click();
//
//		
//	}
	
}

