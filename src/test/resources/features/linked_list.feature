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
When The user clicks the link for "<pagelink>" Linked List page
And The user should be redirected to "<pagetitle>" Linked List page
And The user clicks Try Here Button in Linked List page
Then The user should be redirected to a Try Editor in Linked List page


Examples:
|pagelink|pagetitle|
|introduction|Introduction|
|creating-linked-list|Creating Linked LIst| 
|types-of-linked-list|Types of Linked List|
|implement-linked-list-in-python|Implement Linked List in Python|
|traversal|Traversal|
|insertion-in-linked-list|Insertion|
|deletion-in-linked-list|Deletion|


@TC_LL_002
Scenario: Linked List - Practice Questions Page

Given The  user is on the Introduction page
When The user clicks "practice" link in Introduction page
Then The user should be redirected to "Practice Questions" Linked List page








