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

	@Given("The user is on the DS Algo Sign in Page")
	public void the_user_is_on_the_ds_algo_sign_in_page() {
		
		signinPage.openPage();

	}

	@When("The user clicks login button after leaving the {string} text box and {string}  text box blank")
	public void the_user_clicks_login_button_after_leaving_the_text_box_and_text_box_blank(String username, String password) {

		signinPage.enterUserNameId(username);
		signinPage.enterPassword(password);
		signinPage.clickOnLogin();
		
	}

	@Then("The error message {string} appears below Username  text box")
	public void the_error_message_appears_below_username_text_box(String string) {
	 
		System.out.println("Error Msg" + signinPage.getUserNamesValidationMessage());
		  Assert.assertEquals(string, signinPage.getUserNamesValidationMessage());
	   
	}

	@When("The user clicks login button after entering the {string} and leaves {string} text box blank")
	public void the_user_clicks_login_button_after_entering_the_and_leaves_text_box_blank(String username, String password) {


		signinPage.enterUserNameId(username);
		signinPage.enterPassword(password);
		signinPage.clickOnLogin();
}

	@Then("The error message {string} appears below Pwd text box")
	public void the_error_message_appears_below_pwd_text_box(String string) {
		System.out.println("Error Msg" + signinPage.getUserNamesValidationMessage());
		  Assert.assertEquals(string, signinPage.getUserNamesValidationMessage());
	   	}

	@When("The user clicks login button after entering the {string} only")
	public void the_user_clicks_login_button_after_entering_the_only(String username,String password) {
	signinPage.enterUserNameId(username);
	signinPage.enterPassword(password);
	signinPage.clickOnLogin();
	}


	@Then("The error message {string} appears below Username text box alone")
	public void the_error_message_appears_below_username_text_box_alone(String string) {
		System.out.println("Error Msg" + signinPage.getUserNamesValidationMessage());
		  Assert.assertEquals(string, signinPage.getUserNamesValidationMessage());}


	@When("The user clicks login button after entering invalid username and invalid password")
	public void the_user_clicks_login_button_after_entering_invalid_username_and_invalid_password(String username,String password) {
	signinPage.enterUserNameId(username);
	signinPage.enterPassword(password);
	signinPage.clickOnLogin();
	}

	@Then("The user should able to see an error message {string}")
	public void the_user_should_able_to_see_an_error_message(String string) {
	System.out.println("Error Msg" + signinPage.getUserNamesValidationMessage());
	  Assert.assertEquals(string, signinPage.getUserNamesValidationMessage());
	  }
	

	@When("The user clicks login button after entering valid username and invalid password")
	public void the_user_clicks_login_button_after_entering_valid_username_and_invalid_password(String username,String password) {
	signinPage.enterUserNameId(username);
	signinPage.enterPassword(password);
	signinPage.clickOnLogin();
	}

	@When("The user clicks login button after entering valid username and valid password")
	public void the_user_clicks_login_button_after_entering_valid_username_and_valid_password(String username,String password ) {

		signinPage.enterUserNameId(username);
		signinPage.enterPassword(password);
		signinPage.clickOnLogin();
	}

	@Then("The user should land in Data Structure Home Page")
	public void the_user_should_land_in_data_structure_home_page() {
	    		Assert.assertEquals("NumpyNinja",signinPage.getPageTitle());

		
	}

	
}
