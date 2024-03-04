@tag
Feature: Sign In to website
In order to login to the website
As a user I want to give username and password to login


@negativeScenario1 @TC_01
Scenario Outline: Login Page with empty values using DT
Given The user opens Login Page
When User enters username "<username>"
And User enters password "<password>"
And User clicks "Login" button
Then It should display an error "<errorMessage>" below "<input>" textbox
Examples:
	|username|password|errorMessage|input|
	|         |        |Please fill out this field.|Username|
	|sdetninjas|			|Please fill out this field.|Password|
	|			|sdetninjas|Please fill out this field.|Username|
	|sdet|ninja|Invalid Username and Password|default|
	


@positiveScenario1 @TC_02
Scenario: Login Page with valid Username and Password
Given The user opens Login Page
When User enters username "sdetninjas3"
And User enters password "ninjas@123" 
And User clicks "Login" button 
Then The user should be redirected to Homepage
