package runner;


import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
	

	@CucumberOptions(
			plugin = {"pretty", "html:target/cucumber-reports.html",
					//"json:target/cucumber-reports/Cucumber.json",
					//"junit:targe/cucumber-reports/Cucumber.xml",
					"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
					"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
					"rerun:target/failedtc.txt"}, //reporting purpose
					
			monochrome=false,  //console output colour


		//	tags = "@TC_TE_001", //tags from feature file
			features = {"src/test/resources/features"}, //location of feature files
				//features = {"@target/failedtc.txt"},
			glue= {"stepdefinition","com.apphooks"}) //location of step definition files


	public class TestRunner extends AbstractTestNGCucumberTests{
		
		@Override
	    @DataProvider(parallel = true)
	    public Object[][] scenarios() {
					
			return super.scenarios();	
	    }

	
}