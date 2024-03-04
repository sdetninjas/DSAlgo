@arrayScenarios
Feature: Array Page 

Background: User is on the login page
Given The user opens Login Page
When User enters username "sdetninjas"
And User enters password "ninjas@123" 
And User clicks "Login" button
And The user clicks a Get Started for Array page 
Then The user should be redirected to Array page

@TC_A_001
Scenario Outline: Array Page - Links Test

Given The  user is on the Array page
When The user clicks the link for "<pagename>" 
And The user should be redirected to "<pagename>" Page
And The user clicks Try Here Button
Then The user should be redirected to a Try Editor


Examples:
|pagename|
|Arrays in Python| 
|Arrays Using List|
|Basic Operations in Lists|
|Applications of Array|


@TC_A_002
Scenario: Array Page - Practice Questions Page Test

Given The  user is on the Arrays in Python page
When The user clicks the link for "Practice Questions"
Then The user should be redirected to "Practice Questions" Page

@TC_A_003
Scenario Outline: Array Page - Assessment Links Test

Given The  user is on the practice page
When The user clicks the link for "<practicepage>" 
And The user should be redirected to "Assessment" Page

Examples:
|practicepage|
|Search the array|
|Max Consecutive Ones|
|Find Numbers with Even Number of Digits|
|Squares of a Sorted Array|

@TC_A_004
Scenario Outline: Array Page - Assessment Test

Given The  user is on the Assessment page
When The User gives the input from sheetname "<SheetName>" and <RowNumber> 
And The user clicks Run button
Then The user should be able to submit


Examples:
|SheetName|RowNumber|
|Python_Code|1|
|Python_Code|2|
|Python_Code|3|



