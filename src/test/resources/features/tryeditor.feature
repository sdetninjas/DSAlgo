@tryEditorScenarios
Feature: Try Editor 

Background: User is on the login page
Given The user opens Login Page
When User enters username "sdetninjas"
And User enters password "ninjas@123" 
And User clicks "Login" button
And The user opens the Try Editor page 


@TC_TE_001
Scenario Outline: Try Editor Page
Given User in Try Editor page
When User inputs data from "<SheetName>" and <RowNumber> and click Run button
Then The user should be able to see the output in the console

Examples:
|SheetName|RowNumber|
|TryEditor|1|
|TryEditor|2|
|TryEditor|3|

