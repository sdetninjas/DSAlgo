package stepdefinition;

import java.util.Map;

import org.junit.Assert;

import com.pages.ArrayPage;
import com.utility.ExcelReader;
import com.utility.LoggerLoad;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ArrayStepDefinition{
	
	private ArrayPage arrayPage = new ArrayPage();
	
	Map<String,String> ioMap = null;
	
	@When("The user clicks a Get Started for Array page")
	public void the_user_clicks_a_get_started_for_array_page() {
	//	LoggerLoad.info("calling the_user_clicks_a_get_started_for_array_page");
		arrayPage.clickarrayGetStartedBtn();
	//	LoggerLoad.info("completed the_user_clicks_a_get_started_for_array_page");
	}

	@Then("The user should be redirected to Array page")
	public void the_user_should_be_redirected_to_array_page() {
	//  LoggerLoad.info("calling The user should be redirected to Array page");
	  Assert.assertEquals("Array", arrayPage.getPageTitle());
	//  LoggerLoad.info("completed The user should be redirected to Array page");
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

	
	@Then("The user should be redirected to a Try Editor")
	public void the_user_should_be_redirected_to_a_python_editor() {
		Assert.assertEquals("Assessment", arrayPage.getPageTitle() );
	    
	}
	
	@Given("The  user is on the Arrays in Python page")
	public void the_user_is_on_the_arrays_in_python_page() {
		arrayPage.openArrayPythonPage();
		
	}

	@Given("The  user is on the practice page")
	public void the_user_is_on_the_practice_page() {
		
		arrayPage.openPracticePage();
		Assert.assertEquals("Practice Questions", arrayPage.getPageTitle() );
	    
	}
	
	@Given("The  user is on the Assessment page")
	public void the_user_is_on_the_assessment_page() {
		arrayPage.openAssessmentPage();
	   
	}
	
	
	@When("The User gives the input from sheetname {string} and {int}")
	public void the_user_gives_the_input_from_sheetname_and(String sheetname, int rowNum) {
	    
		
		ioMap = ExcelReader.getTestData(sheetname, rowNum);
		String expInput = ioMap.get("Input");
		arrayPage.inputEditor(expInput);
		
	}

	@When("The user clicks Run button")
	public void the_user_clicks_run_button() {
		
		String type = ioMap.get("Type");
		String runOutput = ioMap.get("RunOutput");
		
		arrayPage.runBtn();
				 
		if (type.equals("Empty")){
			
			Assert.assertEquals(runOutput, arrayPage.getOutput());
			
		}else if(type.equals("Invaild")) {
			
			Assert.assertEquals(runOutput, arrayPage.getAlertText());
			arrayPage.acceptAlertText();
			
			
		}else if(type.equals("Vaild")) {
			
			Assert.assertEquals(runOutput, arrayPage.getOutput());
			
		
		}
	   
	}

	@Then("The user should be able to submit")
	public void The_user_should_be_able_to_submit(){
		
		String type = ioMap.get("Type");
		if (type.equals("Vaild")) {
			String submitOutput = ioMap.get("SubmitOutput");
			arrayPage.submitBtn();
			Assert.assertEquals(submitOutput, arrayPage.getOutput());
		}
	   
	}


	

	

	
	
	
	

	
		
}
