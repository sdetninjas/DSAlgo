package stepdefinition;

import java.util.Map;

import org.junit.Assert;

import com.pages.TryEditorPage;
import com.utility.ExcelReader;
import com.utility.LoggerLoad;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class TryEditorStepDefinition {
	
	TryEditorPage tryPage = new  TryEditorPage();
	
	Map<String, String> dataMap = null;
	
	@And("The user opens the Try Editor page")
	public void the_user_opens_the_try_editor_page() {
		tryPage.openPage();
		
	    
	}

	@Given("User in Try Editor page")
	public void user_in_try_editor_page() {
		
		Assert.assertEquals("Assessment",tryPage.getPageTitle());		
	   
	}

	@When("User inputs data from {string} and {int} and click Run button")
	public void user_inputs_data_from_and_and_click_run_button(String sheetname, Integer rownumber) {
		
		dataMap = ExcelReader.getTestData(sheetname, rownumber);
		tryPage.waitFor();
		tryPage.inputEditor(dataMap.get("Input"));
		tryPage.runBtn();
		
	}

	@Then("The user should be able to see the output in the console")
	public void the_user_should_be_able_to_see_the_output_in_the_console() {
		
		String expInput = dataMap.get("Input");
		String expOutput = dataMap.get("Output");
		
		LoggerLoad.info("Expected Input: "+expInput+" Expected Output: "+expOutput);
		
		if (expInput.equals(" ")){
			
			Assert.assertEquals(expOutput, tryPage.getOutput());
			
		}else if(expInput=="abcd") {
			
			Assert.assertEquals(expOutput, tryPage.getAlertText());
			tryPage.acceptAlertText();
			
		}else if(expInput=="print\"hi\"") {
			
			Assert.assertEquals(expOutput, tryPage.getOutput());
		
		}
		   
		
	}







}
