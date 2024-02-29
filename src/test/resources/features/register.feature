@registerScenarios
Feature: Login to DS-Algo application Register 

@negativeScenario @TC_R_01
Scenario Outline: Register Page with empty values using DT
Given User opens Register Page
When User enters username "<username>" in Register page
And User enters password "<password>" in Register page
And User enters confirmPassword "<confirmPassword>" in Register page
And User clicks Register button
Then It should display an error "<errorMessage>" below "<input>" textbox in Register page
Examples:
	|username|password|confirmPassword|errorMessage|input|
	||||Please fill out this field.|Username|
	|sdetninjas|||Please fill out this field.|Password|
	|sdetninjas|password@123||Please fill out this field.|ConfirmPassword|
	|sdetninjas|password@123|password@|password_mismatch:The two password fields didn’t match.|default|


@positiveScenario @TC_R_02
Scenario: Register Page with valid Username and Password
Given User opens Register Page
When User enters username "sdetninjas3" in Register page
And User enters password "ninjas@123" in Register page
And User enters confirmPassword "ninjas@123" in Register page
And User clicks Register button 
#Then User should be redirected to Homepage

 