@tryEditorScenarios
Feature: Try Editor 

Background: User is on the login page
Given The user opens Login Page
When User enters username "sdetninjas"
And User enters password "ninjas@123" 
And User clicks "Login" button
Then The user opens the Try Editor page "https://dsportalapp.herokuapp.com/tryEditor" 


@TC_TE_001
Scenario Outline: Try Editor Page
Given User in Try Editor page
When User input data from "<SheetName>" and <RowNumber> and click Run button
Then The user should able to see output in the console

Examples:
|SheetName|RowNumber|
|TryEditor|1|


