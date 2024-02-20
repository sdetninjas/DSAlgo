package stepdefinition;

import com.pages.SignInPage;

import io.cucumber.java.en.When;

public class BaseStepDefinition {
	
	private SignInPage signinPage = new SignInPage(); 
	
	@When("The user clicks login button after entering valid username {string} and valid password {string}")
	public void the_user_clicks_login_button_after_entering_valid_username_and_valid_password(String username, String password) {
		signinPage.enterUserNameId(username);
		signinPage.enterPassword(password);
		signinPage.clickOnLogin();
		System.out.println(username + " is Logged in");
	}
	
	

}
