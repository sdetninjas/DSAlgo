package stepdefinition;


import org.junit.Assert;

import com.pages.RegisterPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterStepDefinition {

	private RegisterPage registerPage = new RegisterPage(); 
	//private HomePage homePage = new RegisterPage(); 
	
	@Given("The user opens Register Page")
	public void the_user_opens_register_page() {
		registerPage.openPage();
	}

	@When("User enters username {string}")
	public void user_enters_username(String username) {
		registerPage.enterUserName(username);
	}

	@When("User enters password {string}")
	public void user_enters_password(String password) {
		registerPage.enterPassword(password);
	}

	@When("User enters confirmPassword {string}")
	public void user_enters_confirm_password(String cfmpsw) {
		registerPage.enterConfirmPassword(cfmpsw);
	}

	@When("User clicks {string} button")
	public void user_clicks_button(String string) {
		registerPage.clickOnRegister();
	}

	@Then("It should display an error {string} below {string} textbox")
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

	@Then("The user should be redirected to Homepage")
	public void the_user_should_be_redirected_to_homepage() {
		Assert.assertEquals("NumpyNinja",registerPage.getPageTitle());
	   
	}



	
	
	
	
}
