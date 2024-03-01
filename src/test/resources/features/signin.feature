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


#@username_and_password_blank
#Scenario Outline: Please fill out this field should be displayed if username and password is blank
#Given The user is on the DS Algo Sign in Page
#When The user clicks login button after leaving the "<username>" text box and "<password>"  text box blank
#Then It should display an error "<errorMessage>" below "<input>" textbox
#Examples:
#	|username|password|errorMessage|input|
#	|[blank]|[blank]|Please Fill Out This Field|Username|
#	
#@username_entered_pw_blank
#Scenario Outline: Please fill out this field should be displayed if username is entered and password is blank
#Given The user is on the DS Algo Sign in Page
#When The user clicks login button after entering the "<username>" and leaves "<password>" text box blank
#Then The error message "Please fill out this field." appears below Pwd text box
#Examples:
#	|username|password|errorMessage|input|
#	|[sdetninjas|[blank]|Please Fill Out This Field|Password|
#
#@username_blank_pw_entered
#Scenario Outline: Please fill out this field should be displayed if username is blank and password is entered
#Given The user is on the DS Algo Sign in Page
#When The user clicks login button after entering the "<password>" only
#Then The error message "Please fill out this field." appears below Username text box alone
#Examples:
#	|username|password|errorMessage|input|
#	|[blank]|sdetninjas|Please Fill Out This Field|Username|
#
#@username_and_pw_invalid
#Scenario Outline: Invalid username and password should be displayed if username and password is invalid
#Given The user is on the DS Algo Sign in Page
#When The user clicks login button after entering the "<username>" and "<password>" invalid
#Then The user should able to see an error message "Invalid username and password"
#Examples:
#	|username|password|errorMessage|
#	|sdet|sdetninjas|Invalid username and password |
#
#@valid_username_invalid_pw
#Scenario Outline: Invalid username and password should be displayed if username is valid and password is invalid
#Given The user is on the DS Algo Sign in Page
#When The user clicks login button after entering valid "<username >"and invalid "<password>"
#Then The user should able to see an error message "Invalid username and password"
#Examples:
#	|username|password|errorMessage|
#	|sdetninjas|sdetninjas|Invalid username and password |
#
#
#@valid_username_pw
#Scenario Outline: The user should land in Data Structure Home Page when valid username and password is entered
#Given The user is on the DS Algo Sign in Page
#When The user clicks login button after entering valid "sdetninjas" and valid "ninjas@123"
#Then The user should land in Data Structure Home Page
#
