package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StackStepDefinition {
//	@Given("The user is in the Home page after logged in")
//	public void the_user_is_in_the_home_page_after_logged_in() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("The user Clicks the \"Getting Started\"button in Stack panel or select Stack item from the drop down menu")
//	public void the_user_clicks_the_getting_started_button_in_stack_panel_or_select_stack_item_from_the_drop_down_menu() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("The user should be directed to {string}  page")
//	public void the_user_should_be_directed_to_page(String string) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Given("The User is in the Operational in Stack page")
//	public void the_user_is_in_the_operational_in_stack_page() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("The User clicks {string} button")
//	public void the_user_clicks_button(String string) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("The User should be redirected to a page having an tryEditor with a Run button to test")
//	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Given("The user is on the tryEditor page")
//	public void the_user_is_on_the_try_editor_page() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("The user writes valid python code")
//	public void the_user_writes_valid_python_code() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("click Run button")
//	public void click_run_button() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("User is able to see the output in console")
//	public void user_is_able_to_see_the_output_in_console() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Given("The User is on the tryEditor page")
//	public void the_user_is_on_the_try_editor_page() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("The User writes invalid python code")
//	public void the_user_writes_invalid_python_code() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("User is able to see the error msg in pop up window")
//	public void user_is_able_to_see_the_error_msg_in_pop_up_window() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Given("The user is on the editor page with Alert erroe message")
//	public void the_user_is_on_the_editor_page_with_alert_erroe_message() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("The User click the ok button in the alert window")
//	public void the_user_click_the_ok_button_in_the_alert_window() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("The User is on the same page having Editor and Run button")
//	public void the_user_is_on_the_same_page_having_editor_and_run_button() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Given("The User is in the Stack page after logged in")
//	public void the_user_is_in_the_stack_page_after_logged_in() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("The user clicks \"implementation\"button")
//	public void the_user_clicks_implementation_button() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("The user should be directed to \"implementation\"page")
//	public void the_user_should_be_directed_to_implementation_page() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Given("The User is in the implementation page")
//	public void the_user_is_in_the_implementation_page() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("The User clicks \"Try Here\"button")
//	public void the_user_clicks_try_here_button() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("The User writes valid python code")
//	public void the_user_writes_valid_python_code() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("click run button")
//	public void click_run_button() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Given("The user is on the editor page with Alert error message")
//	public void the_user_is_on_the_editor_page_with_alert_error_message() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("The user is on the same page having Editor and Run button")
//	public void the_user_is_on_the_same_page_having_editor_and_run_button() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("The user clicks \"Application\"button")
//	public void the_user_clicks_application_button() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("The user should be directed to {string}")
//	public void the_user_should_be_directed_to(String string) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Given("The user is in the Applications page")
//	public void the_user_is_in_the_applications_page() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("The user clicks {string} button")
//	public void the_user_clicks_button(String string) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("The user should be redirected to a page having an tryEditor with a Run button to test")
//	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("The User writes Valid python code")
//	public void the_user_writes_valid_python_code() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Given("The user is on the Try editor page")
//	public void the_user_is_on_the_try_editor_page() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("the user writes invalid python code")
//	public void the_user_writes_invalid_python_code() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("The user click the ok button in the alert window")
//	public void the_user_click_the_ok_button_in_the_alert_window() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("The user clicks \"practice Question\"button")
//	public void the_user_clicks_practice_question_button() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("The user should be redirected to \"practice\"page")
//	public void the_user_should_be_redirected_to_practice_page() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}



}
