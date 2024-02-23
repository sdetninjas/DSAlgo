package stepdefinition;

import org.junit.Assert;

import com.pages.LinkedListPage;
import com.utility.LoggerLoad;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LinkedListStepDefinition {

private LinkedListPage linkedlistPage = new LinkedListPage();
	
	
	@When("The user clicks a Get Started for Linked List page")
	public void the_user_clicks_a_get_started_for_Linked_List_page() {
		LoggerLoad.info("calling the_user_clicks_a_get_started_for_Linked_List_page");
		linkedlistPage.clickarrayGetStartedBtn();
		LoggerLoad.info("completed the_user_clicks_a_get_started_for_Linked_List_page");
	}

	@Then("The user should be redirected to Linked List page")
	public void the_user_should_be_redirected_to_Linked_List_page() {
		LoggerLoad.info("calling The user should be redirected to Linked_List page");
	  Assert.assertEquals("Linkedlist", linkedlistPage.getPageTitle());
	  LoggerLoad.info("completed The user should be redirected to Linked_List page");
	}

	@Given("The  user is on the Linked List page")
	public void the_user_is_on_the_Linked_List_page() {
		 Assert.assertEquals("Linkedlist", linkedlistPage.getPageTitle());
	}

	@When("The user clicks the link for {string} Linked List page")
	public void the_user_clicks_the_link_for(String pagename) {
		linkedlistPage.clickByName(pagename);
	    
	}

	@Then("The user should be redirected to {string} Linked List page")
	public void the_user_should_be_redirected_to_page(String pagename) {
	   
		Assert.assertEquals(pagename,linkedlistPage.getPageTitle());
	}
	
	@Given("The  user is on the Creating Linked List page")
	public void the_user_is_on_the_creating_linked_list_page() {
		
	}

	@When("The user clicks Try Here Button Linked List page")
	public void the_user_clicks_try_here_button() {
		linkedlistPage.clickTryEditorBtn();
		
	}

	@Then("The user should be redirected to a Python Editor Linked List page")
	public void the_user_should_be_redirected_to_a_python_editor() {
		Assert.assertEquals("Assessment", linkedlistPage.getPageTitle() );
	    
	}
	

	
		
}

	
	
	

