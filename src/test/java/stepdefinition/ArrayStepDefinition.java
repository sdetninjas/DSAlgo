package stepdefinition;

import org.junit.Assert;

import com.pages.ArrayPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ArrayStepDefinition{
	
	private ArrayPage arrayPage = new ArrayPage();
	
	@Given("The  user is on the home page")
	public void the_user_is_on_the_array_page() {
		System.out.println("Iam in array page");
		Assert.assertEquals(arrayPage.getPageTitle(),"NumpyNinja");
	    
	}

	@When("The user clicks a {string} in Array")
	public void the_user_clicks_a_in_array(String string) {
		//arrayPage.clickLink(null);
		
	}
	
	@Then("The user should be redirected to {string} Page")
	public void the_user_should_be_redirected_to_page(String getstarted) {
	   
	}
	
	
	@When("The user clicks a Arrays in Python link")
	public void the_user_clicks_a_arrays_in_python_link() {
		
		
	   
	}

	
	
	@Given("The user is on the Array in Python Page")
	public void the_user_is_on_the_array_in_python_page() {
	    
	}

	@When("The user clicks Try Here button of Array in Python Page")
	public void the_user_clicks_try_here_button_of_array_in_python_page() {
	   
	}

	@Then("The user should be redirected to a page having an Python Editor with a url {string}")
	public void the_user_should_be_redirected_to_a_page_having_an_python_editor_with_a_url(String string) {
	   
	}




	
}
