@linkedlistScenarios
Feature: Linked List Page 

Background: User is on the login page
Given The user opens Login Page
When User enters username "sdetninjas"
And User enters password "ninjas@123" 
And User clicks "Login" button
And The user clicks a Get Started for Linked List page 
Then The user should be redirected to Linked List page

@TC_LL_001
Scenario Outline: Linked List Page

Given The  user is on the Linked List page
When The user clicks the link for "<pagename>" Linked List page
And The user should be redirected to "<pagename>" Linked List page
And The user clicks Try Here Button Linked List page
Then The user should be redirected to a Python Editor Linked List page


Examples:
|pagename|
|Creating Linked List| 
|Types of Linked List|
|Implement Linked List in Python|
|Traversal|
|Insertion|
|Deletion|


@TC_LL_002
Scenario: Linked List - Practice Questions Page

Given The  user is on the Creating Linked List page
When The user clicks the link for "practice" Linked List page
Then The user should be redirected to "practice" Linked List page








