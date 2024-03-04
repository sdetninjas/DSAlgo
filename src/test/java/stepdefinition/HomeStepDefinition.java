package stepdefinition;

import com.pages.HomePage;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeStepDefinition {
	private HomePage homepage = new HomePage(); 
	
	@Given("user is login to the Dsalgo application")
	public void user_is_login_to_the_dsalgo_application() {
	    
	   homepage.loginNow("sdetninjas", "ninjas@123");
	}

	@When("a user clicks Arrays under the DataStructureDropDown link")
	public void a_user_clicks_arrays_under_the_data_structure_drop_down_link() {
	     
		homepage.datastructureClick();
		homepage.arraysClick();
	}

	@Then("user should land on the Array page")
	public void user_should_land_on_the_array_page() {
	   
		homepage.getArrayInnerText("Array");
	}

	@When("a user clicks LinkedList under the DataStructureDropDown link")
	public void a_user_clicks_linked_list_under_the_data_structure_drop_down_link() {
	   
		homepage.datastructureClick();
		homepage.linkedListClick();
	}

	@Then("user should land on the LinkedList page")
	public void user_should_land_on_the_linked_in_page() {
	   
		homepage.getArrayInnerText("Linked List");
	}

	@When("a user clicks Stack under the DataStructureDropDown link")
	public void a_user_clicks_stack_under_the_data_structure_drop_down_link() {
	    
		homepage.datastructureClick();
		homepage.stack();
	}

	@Then("the user should land on the Stack page")
	public void the_user_should_land_on_the_stack_page() {
	    
		homepage.getArrayInnerText("Stack"); 
	}

	@When("a user clicks Queue under DataStructureDropdown link")
	public void a_user_clicks_queue_under_data_structure_dropdown_link() {
	   
		homepage.datastructureClick();
		homepage.queue();
	}

	@Then("user should land on the Queue page")
	public void user_should_land_on_the_queue_page() {
	   
		homepage.getArrayInnerText("Queue");
	}

	@When("a user clicks Tree under DataStructureDropdown click")
	public void a_user_clicks_tree_under_data_structure_dropdown_click() {
	   
		homepage.datastructureClick();
		homepage.tree();
	}

	@Then("the user should land on the Tree page")
	public void the_user_should_land_on_the_tree_page() {
	   
		homepage.getArrayInnerText("Tree");
	}

	@When("a user clicks Graph under DataStructureDropdown click")
	public void a_user_clicks_graph_under_data_structure_dropdown_click() {
	   
		homepage.datastructureClick();
		homepage.graph();
	}

	@Then("user should land on the Graph page")
	public void user_should_land_on_the_graph_page() {
	   
		homepage.getArrayInnerText("Graph");    	
	}
	

}
