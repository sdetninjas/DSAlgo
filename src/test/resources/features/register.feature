@registerScenarios
Feature: Login to DS-Algo application Register 

@negativeScenario1 @TC_001
Scenario: Register Page with empty values

Given The user opens Register Page
When The user clicks "Register" button with all fields empty
Then It should display an error "Please fill out this field" below Username textbox

@negativeScenario2 @TC_002
Scenario: Register Page with only Username  
Given The user opens Register Page
When The user clicks "Register" button after entering Username with other fields empty
Then It should display an error "Please fill out this field" below Password textbox

@negativeScenario3 @TC_003
Scenario: Register Page without confirmation password 
Given The user opens Register Page
When The user clicks "Register" button after entering Username and password with Password Confirmation field empty
Then It should display an error "Please fill out this field" below Password Confirmation textbox

@negativeScenario4 @TC_004
Scenario: Register Page with Invalid Username
Given The user opens Register Page
When The user clicks "Register" button after entering invalid username
Then It should display an error message "Please enter a valid username"

@negativeScenario5 @TC_005
Scenario: Register Page with Different Password
Given The user opens Register Page
When The user clicks "Register" button after entering different passwords in Password and Password Confirmation fields
Then It should display an error message "password_mismatch:The two password fields didn�t match."

@negativeScenario6 @TC_006
Scenario: Register Page with less than 8 characters in Password
Given The user opens Register Page
When The user enters a Password with characters less than 8
Then It should display an error message "password_mismatch:The two password fields didn�t match." 

@negativeScenario7 @TC_007
Scenario: Register Page with less than 9 characters in Password 
Given The user opens Register Page
When The user enters a Password with characters less than 9
Then It should display an error message "password_mismatch:The two password fields didn�t match."

@positiveScenario8 @TC_008
Scenario: Register Page with valid Username and Password
Given The user opens Register Page
When It should display an error "Please fill out this field" below Password Confirmation textbox
Then The user should be redirected to Homepage with the message "New Account Created. You are logged in as <username>"





