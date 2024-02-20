package stepdefinition;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pages.DataStructurePage;
import com.pages.HomePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DatastructoreStepDefinition {
	DataStructurePage dataPage = new DataStructurePage();
	@Given("The user is on the DS Algo Home Page")
	public void the_user_is_on_the_ds_algo_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		dataPage.loginNow("sdetninjas", "ninjas@123");
	}

	@When("The user clicks  Get Started button below the Data structures-Introduction")
	public void the_user_clicks_get_started_button_below_the_data_structures_introduction() {
	    // Write code here that turns the phrase above into concrete actions
	    dataPage.getStartedClick();
	}

	@Then("The user should land in {string} page")
	public void the_user_should_land_in_page(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    dataPage.getStartedPageText("h4", string);
	}

	@Given("The user is on the Data Structure Introduction Page")
	public void the_user_is_on_the_data_structure_introduction_page() {
	    // Write code here that turns the phrase above into concrete actions
		dataPage.loginNow("sdetninjas", "ninjas@123");
		dataPage.getStartedClick();
		dataPage.getStartedPageText("h4", "Data Structures-Introduction");
	}

	@When("The user clicks Time Complexity link")
	public void the_user_clicks_time_complexity_link() {
	    // Write code here that turns the phrase above into concrete actions
	    dataPage.timeComplexityClick();
	}

	@Then("The user should be redirected to {string} page")
	public void the_user_should_be_redirected_to_time_complexity_tc_page(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    dataPage.findElementWithRoleName("p", string);
	}

	@Given("The user is on the Time Complexity Page")
	public void the_user_is_on_the_time_complexity_page() {
	    // Write code here that turns the phrase above into concrete actions
		dataPage.loginNow("sdetninjas", "ninjas@123");
		dataPage.getStartedClick();
	    dataPage.timeComplexityClick();	 
	    dataPage.findElementWithRoleName("p", "Time Complexity");
	}

	@When("The user clicks Try Here  button of Time Complexity page")
	public void the_user_clicks_try_here_button_of_time_complexity_page() {
	    // Write code here that turns the phrase above into concrete actions
		dataPage.tryHereClick();
	}

	@Then("The user should be redirected to a page having an Python Editor with a url {string}")
	public void the_user_should_be_redirected_to_a_page_having_an_python_editor_with_a_url(String string) {
	    // Write code here that turns the phrase above into concrete actions
		dataPage.findElementWithRoleName("button", "Run");
	}

	@Given("The user is on the Python Editor")
	public void the_user_is_on_the_python_editor() {
	    // Write code here that turns the phrase above into concrete actions
		dataPage.loginNow("sdetninjas", "ninjas@123");
		dataPage.getStartedClick();
	    dataPage.timeComplexityClick();	 
	    dataPage.findElementWithRoleName("p", "Time Complexity");
		dataPage.tryHereClick();
		dataPage.findElementWithRoleName("button", "Run");
	    
	}

	@When("The user clicks the Run Button without entring the code in the Editor")
	public void the_user_clicks_the_run_button_without_entring_the_code_in_the_editor() {
	    // Write code here that turns the phrase above into concrete actions
	    dataPage.runClick();
	}

	@Then("Nothing happens to the page and no error message is displayed")
	public void nothing_happens_to_the_page_and_no_error_message_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		dataPage.checkNoAlert();
	}

	@When("The user write the invalid code in Editor")
	public void the_user_write_the_invalid_code_in_editor() {
	    // Write code here that turns the phrase above into concrete actions
	   dataPage.enterPythonCode("aaaa");
	}

	@When("Click the Run Button")
	public void click_the_run_button() {
	    // Write code here that turns the phrase above into concrete actions
		dataPage.runClick();
	}

	@Then("The user should able to see an error message in alert window")
	public void the_user_should_able_to_see_an_error_message_in_alert_window() {
	    // Write code here that turns the phrase above into concrete actions
	    dataPage.checkAlertError();
	}

	@When("The user write the valid code in Editor")
	public void the_user_write_the_valid_code_in_editor() {
	    // Write code here that turns the phrase above into concrete actions
		   dataPage.enterPythonCode("print(\"Hello world!\")");
	}

	@Then("The user should able to see output in the console")
	public void the_user_should_able_to_see_output_in_the_console() {
	    // Write code here that turns the phrase above into concrete actions
	    dataPage.validatePythonResponse();
	}

	@Given("The user is on the Time Complexity Data Structure Home Page")
	public void the_user_is_on_the_time_complexity_data_structure_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("The user clicks Practice Questions link")
	public void the_user_clicks_practice_questions_link() {
	    // Write code here that turns the phrase above into concrete actions
		dataPage.practiceQuestionClick();
	}

	@Then("The user redirected to the blank page of the practice Questions")
	public void the_user_redirected_to_the_blank_page_of_the_practice_questions() {
	    // Write code here that turns the phrase above into concrete actions
	    dataPage.checkBlankPage();
	}

	@Then("The user doesn't find any practice problems and the page is blank")
	public void the_user_doesn_t_find_any_practice_problems_and_the_page_is_blank() {
	    // Write code here that turns the phrase above into concrete actions
		dataPage.checkBlankPage();
	}

}
