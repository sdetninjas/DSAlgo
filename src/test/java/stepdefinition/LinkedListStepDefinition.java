package stepdefinition;

import org.junit.Assert;

import com.pages.LinkedListPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LinkedListStepDefinition {

private LinkedListPage linkedlistPage = new LinkedListPage();
	
	
	@When("The user clicks a Get Started for Linked List page")
	public void the_user_clicks_a_get_started_for_Linked_List_page() {
		
		linkedlistPage.clickarrayGetStartedBtn();		
	}

	@Then("The user should be redirected to Linked List page")
	public void the_user_should_be_redirected_to_Linked_List_page() {
		
	  Assert.assertEquals("Linked List", linkedlistPage.getPageTitle());	  
	}

	@Given("The  user is on the Linked List page")
	public void the_user_is_on_the_Linked_List_page() {
		 Assert.assertEquals("Linked List", linkedlistPage.getPageTitle());
	}

	@When("The user clicks the link for {string} Linked List page")
	public void the_user_clicks_the_link_for(String pagename) {
		linkedlistPage.clickByName(pagename);
	    
	}
	
	@When("The user clicks {string} link in Introduction page")
	public void the_user_clicks_link_in_introduction_page(String string) {
	   
		linkedlistPage.clickPractice();
	}

	@Then("The user should be redirected to {string} Linked List page")
	public void the_user_should_be_redirected_to_page(String pagename) {
	   
		Assert.assertEquals(pagename,linkedlistPage.getPageTitle());
	}
	
	@Given("The  user is on the Introduction page")
	public void the_user_is_on_the_Introduction_page() {
		
		linkedlistPage.openIntroPage();
	}

	@When("The user clicks Try Here Button in Linked List page")
	public void the_user_clicks_try_here_button_in_Linked_List_page() {
		linkedlistPage.clickTryEditorBtn();
		
	}

	@Then("The user should be redirected to a Try Editor in Linked List page")
	public void the_user_should_be_redirected_to_a_Try_Editor_in_Linked_List_page() {
		Assert.assertEquals("Assessment", linkedlistPage.getPageTitle() );
	    
	}
	

	
		
}

	
	
	

