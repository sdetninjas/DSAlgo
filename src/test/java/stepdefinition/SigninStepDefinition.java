package stepdefinition;

import org.junit.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pages.RegisterPage;
import com.pages.SignInPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SigninStepDefinition {
	
	private SignInPage signinPage = new SignInPage(); 


@Given("The user opens Login Page")
public void the_user_opens_login_page() {
	signinPage.openPage();
}
@When("User enters username {string}")
public void user_enters_username(String username) {
	signinPage.enterUserNameId(username);
}
@When("User enters password {string}")
public void user_enters_password(String password) {
	signinPage.enterPassword(password);
}
@When("User clicks {string} button")
public void user_clicks_button(String string) throws InterruptedException {
	signinPage.clickOnLogin();
	Thread.sleep(2000);
}
@Then("It should display an error {string} below {string} textbox")
public void it_should_display_an_error_below_textbox(String errorMsg, String inputField) {
	if("Username".equals(inputField)) {
		  Assert.assertEquals(errorMsg, signinPage.getUserNamesValidationMessage());
	  }else if("Password".equals(inputField)) {
		  Assert.assertEquals(errorMsg, signinPage.getPasswordsValidationMessage());  
	  	  }else if("default".equals(inputField)){
		  Assert.assertEquals(errorMsg, signinPage.getErrorMessage());   
	  }
	}

@Then("The user should be redirected to Homepage")
public void the_user_should_be_redirected_to_homepage() throws InterruptedException {
	Thread.sleep(2000);

	Assert.assertEquals("NumpyNinja",signinPage.getPageTitle());

}

	
}
