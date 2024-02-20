@Stack
Feature: Testing Stack features in the DsAlgo Application

@Stackhomepage
Scenario: User navigates to the Stack console page
Given The user is in the Home page after logged in
When The user Clicks the "Getting Started"button in Stack panel or select Stack item from the drop down menu 
Then The user should be directed to "Stack"  page
@Stack
Scenario: User navigates to the Stack console page
Given The User is in the Operational in Stack page
When The User clicks "Try Here" button
Then The User should be redirected to a page having an tryEditor with a Run button to test

@StackValidPythonCode
Scenario: User navigates to the Stack console page
Given The user is on the tryEditor page
When The user writes valid python code
And click Run button
Then User is able to see the output in console

@StackInvalidpythoncode
Scenario: User navigates to the Stack console page
Given The User is on the tryEditor page
When The User writes invalid python code
And click Run button
Then User is able to see the error msg in pop up window

@stackAlertMsg
Scenario: User  navigates to the Stack console page
Given The user is on the editor page with Alert erroe message
When The User click the ok button in the alert window
Then The User is on the same page having Editor and Run button

@StackImplementation
Scenario: User is navigates to the Stack console page
Given The User is in the Stack page after logged in
When The user clicks "implementation"button
Then The user should be directed to "implementation"page

@StackImplementationPage
Scenario: User is navigates to the Stack console page
Given The User is in the implementation page
When The User clicks "Try Here"button
Then The User should be redirected to a page having an tryEditor with a Run button to test

@StackImplementationValidCode
Scenario: User is navigates to the Stack console page
Given The user is on the tryEditor page
When The User writes valid python code
And click Run button
Then User is able to see the output in console

@StackImplementationInvalidCode
Scenario: User is navigates to the Stack console page
Given The User is on the tryEditor page
When The User writes invalid python code
And click run button
Then User is able to see the error msg in pop up window

@StackImplementationAlertWindow
Scenario: User is navigate to the Stack console page
Given The user is on the editor page with Alert error message
When The User click the ok button in the alert window
Then The user is on the same page having Editor and Run button

@StackApplicationPage
Scenario: User is navigate to the stack console page
Given The User is in the Stack page after logged in
When The user clicks "Application"button
Then The user should be directed to "Application page"

@StackApplicatioconsolepage
Scenario: User is navigates to the stack console page
Given The user is in the Applications page
When The user clicks "Try Here" button
Then The user should be redirected to a page having an tryEditor with a Run button to test

@StackApplicationValid
Scenario: User is navigates to the stack console page
Given The User is on the tryEditor page
When The User writes Valid python code
And click Run button
Then User is able to see the output in console

@StackInvalidCode
Scenario: User is navigates to the stack console page
Given The user is on the Try editor page
When the user writes invalid python code
And click Run button
Then User is able to see the error msg in pop up window

@StackAlertWindow
Scenario: User is navigates to the stack console page
Given The user is on the editor page with Alert error message
When The user click the ok button in the alert window
Then The User is on the same page having Editor and Run button

@StackpracticeQuestion
Scenario: User is navigates to the stack console page
Given The User is in the Stack page after logged in
When The user clicks "practice Question"button
Then The user should be redirected to "practice"page  
       









