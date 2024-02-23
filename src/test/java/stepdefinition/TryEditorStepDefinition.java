package stepdefinition;

import java.util.Map;

import org.junit.Assert;

import com.pages.TryEditorPage;
import com.utility.ExcelReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class TryEditorStepDefinition {
	
	TryEditorPage tryPage = new  TryEditorPage();
	
	@Then("The user opens the Try Editor page {string}")
	public void the_user_opens_the_try_editor_page(String string) {
		tryPage.openPage();
		
	    
	}

	@Given("User in Try Editor page")
	public void user_in_try_editor_page() {
		
		
		
	   
	}

	@When("User input data from {string} and {int} and click Run button")
	public void user_input_data_from_and_and_click_run_button(String sheetname, Integer rownumber) {
		
		Map<String, String> dataMap = ExcelReader.getTestData(sheetname, rownumber);
		tryPage.inputEditor(dataMap.get("Input"));
		tryPage.runBtn();
		//System.out.println(tryPage.inputEditor(dataMap.get("Output")));
		Assert.assertEquals(dataMap.get("Output"), tryPage.getOutput());
	}

	@Then("The user should able to see output in the console")
	public void the_user_should_able_to_see_output_in_the_console() {
	    
		
	}







}
