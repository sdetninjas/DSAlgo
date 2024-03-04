package stepdefinition;


import org.junit.Assert;

import com.pages.RegisterPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterStepDefinition {

	private RegisterPage registerPage = new RegisterPage(); 
	 
	
	@Given("User opens Register Page")
	public void the_user_opens_register_page() {
		registerPage.openPage();
	}

	@When("User enters username {string} in Register page")
	public void user_enters_username_in_Register_page(String username) {
		registerPage.enterUserName(username);
	}

	@When("User enters password {string} in Register page")
	public void user_enters_password_in_Register_page(String password) {
		registerPage.enterPassword(password);
	}

	@When("User enters confirmPassword {string} in Register page")
	public void user_enters_confirm_password_in_Register_page(String cfmpsw) {
		registerPage.enterConfirmPassword(cfmpsw);
	}

	@When("User clicks Register button")
	public void user_clicks_button() {
		registerPage.clickOnRegister();
	}

	@Then("It should display an error {string} below {string} textbox in Register page")
	public void it_should_display_an_error_below_textbox(String errorMsg, String inputField) {
	  if("Username".equals(inputField)) {
		  Assert.assertEquals(errorMsg, registerPage.getUserNameValidationMessage());
	  }else if("Password".equals(inputField)) {
		  Assert.assertEquals(errorMsg, registerPage.getPasswordValidationMessage());  
	  }else if("ConfirmPassword".equals(inputField)) {
		  Assert.assertEquals(errorMsg, registerPage.getPasswordConfirmationValidationMessage());  
	  }else if("default".equals(inputField)){
		  Assert.assertEquals(errorMsg, registerPage.getErrorMessage());   
	  }
	}

	@Then("User should be redirected to Homepage")
	public void the_user_should_be_redirected_to_homepage() {
		Assert.assertEquals("NumpyNinja",registerPage.getPageTitle());
		
	}



	
	
	
	
}
