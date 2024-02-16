package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.DriverManager.DriverManagerFact;

public class RegisterPage extends BasePage{
	
	private WebDriver driver;
	
	private By usernameTxt = By.id("id_username");
	private By pswTxt = By.id("id_password1");
	private By confirmpswTxt = By.id("id_password2");
	private By register = By.xpath("//input[@value='Register']");
	
	public RegisterPage() {
		this.driver = DriverManagerFact.getDriver();
		
	}
	@Override
	public void openPage() {
		driver.get(BASE_URL + "register");
		
	}
	public String getRegisterPageTitle() {
		return driver.getTitle();
		
	}
	
	public void enterUserName(String username) {
		driver.findElement(usernameTxt).sendKeys(username);
		
	}
	
	public void enterPassword(String password) {
		driver.findElement(pswTxt).sendKeys(password);
		
	}
	
	public void enterConfirmPassword(String Cfmpassword) {
		driver.findElement(confirmpswTxt).sendKeys(Cfmpassword);
		
	}
	
	public String getUserNameValidationMessage() {
		return getValidationMessage(usernameTxt);
	}
	private String getValidationMessage(By we) {
		return driver.findElement(we).getAttribute("validationMessage");
	}
	public String getPasswordValidationMessage() {
		return driver.findElement(pswTxt).getAttribute("validationMessage");
	}
	
	public void clickOnRegister() {
		driver.findElement(register).click();
		
	}
	
}
