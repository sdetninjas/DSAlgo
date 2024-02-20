package stepdefinition;

import org.junit.Assert;

import com.pages.ArrayPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ArrayStepDefinition{
	
	private ArrayPage arrayPage = new ArrayPage();
	
	@When("The user clicks a Get Started for Array page")
	public void the_user_clicks_a_get_started_for_array_page() {
		arrayPage.clickarrayGetStartedBtn();
	}

	@Then("The user should be redirected to Array page")
	public void the_user_should_be_redirected_to_array_page() {
	  Assert.assertEquals("Array", arrayPage.getPageTitle());
	}

	@Given("The  user is on the Array page")
	public void the_user_is_on_the_Array_page() {
		 Assert.assertEquals("Array", arrayPage.getPageTitle());
	}

	@When("The user clicks the link for {string}")
	public void the_user_clicks_the_link_for(String pagename) {
		arrayPage.clickByName(pagename);
	    
	}

	@Then("The user should be redirected to {string} Page")
	public void the_user_should_be_redirected_to_page(String pagename) {
	   
		Assert.assertEquals(pagename,arrayPage.getPageTitle());
	}

	@When("The user clicks Try Here Button")
	public void the_user_clicks_try_here_button() {
	    arrayPage.clickTryEditorBtn();
		
	}

	@Then("The user should be redirected to a Python Editor")
	public void the_user_should_be_redirected_to_a_python_editor() {
		Assert.assertEquals("Assessment", arrayPage.getPageTitle());
	    
	}

	
		
}
