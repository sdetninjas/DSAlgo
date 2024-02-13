@tag1
Feature: Sign In to website
In order to login to the website
As a user I want to give username and password to login

@username_and_password_blank
Scenario: Please fill out this field should be displayed if username and password is blank
Given The user is on the DS Algo Sign in Page
When The user clicks login button after leaving the "<username>" text box and "<password>"  text box blank
Then The error message "Please fill out this field." appears below Username  text box

@username_entered_pw_blank
Scenario: Please fill out this field should be displayed if username is entered and password is blank
Given The user is on the DS Algo Sign in Page
When The user clicks login button after entering the "<username>" and leaves "<password>" text box blank
Then The error message "Please fill out this field." appears below Pwd text box

@username_blank_pw_entered
Scenario: Please fill out this field should be displayed if username is blank and password is entered
Given The user is on the DS Algo Sign in Page
When The user clicks login button after entering the "<password>" only
Then The error message "Please fill out this field." appears below Username text box alone

@username_and_pw_invalid
Scenario: Invalid username and password should be displayed if username and password is invalid
Given The user is on the DS Algo Sign in Page
When The user clicks login button after entering invalid username and invalid password
Then The user should able to see an error message "Invalid username and password"

@valid_username_invalid_pw
Scenario: Invalid username and password should be displayed if username is valid and password is invalid
Given The user is on the DS Algo Sign in Page
When The user clicks login button after entering valid username and invalid password
Then The user should able to see an error message "Invalid username and password"

@valid_username_pw
Scenario: The user should land in Data Structure Home Page when valid username and password is entered
Given The user is on the DS Algo Sign in Page
When The user clicks login button after entering valid username and valid password
Then The user should land in Data Structure Home Page