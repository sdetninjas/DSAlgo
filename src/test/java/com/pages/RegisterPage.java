package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage{
	
	@FindBy(id="id_username") 
	private WebElement usernameTxt;
	@FindBy(id="id_password1") 
	private WebElement pswTxt;
	@FindBy(id="id_password2")
	private WebElement confirmpswTxt;
	@FindBy(xpath="//input[@value='Register']") 
	private WebElement register;
		
	
	
	
	@Override
	public void openPage() {
		driver.get(BASE_URL + "register");
		
	}
	
	
	public void enterUserName(String username) {
		usernameTxt.sendKeys(username);
		
	}
	
	public void enterPassword(String password) {
		pswTxt.sendKeys(password);
		
	}
	
	public void enterConfirmPassword(String Cfmpassword) {
		confirmpswTxt.sendKeys(Cfmpassword);
		
	}
	
	public String getUserNameValidationMessage() {
		return getValidationMessage(usernameTxt);
	}
	
	public String getPasswordValidationMessage() {
		return getValidationMessage(pswTxt);
	}
	
	public void clickOnRegister() {
		register.click();
		
	}
	
}
