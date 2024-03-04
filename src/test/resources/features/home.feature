#@homeScenario
Feature: Home Page

@Arrays_In_Home @TC_001 @TC_ALL
Scenario: User navigates to the Array page
Given user is login to the Dsalgo application
When a user clicks Arrays under the DataStructureDropDown link
Then user should land on the Array page


@LinkedList_In_Home @TC_002  @TC_ALL
Scenario: User navigates to the Linked List page
Given user is login to the Dsalgo application
When a user clicks LinkedList under the DataStructureDropDown link
Then user should land on the LinkedList page

@Stack_In_home @TC_003  @TC_ALL
Scenario: User navigates to the Stack page
Given user is login to the Dsalgo application
When a user clicks Stack under the DataStructureDropDown link
Then the user should land on the Stack page

@Queue_In_Home @TC_004  @TC_ALL
Scenario: User navigates to the Queue page
Given user is login to the Dsalgo application
When a user clicks Queue under DataStructureDropdown link
Then user should land on the Queue page

@Tree_In_Home @TC_005  @TC_ALL
Scenario: User navigates to Tree page
Given user is login to the Dsalgo application
When a user clicks Tree under DataStructureDropdown click
Then the user should land on the Tree page

@Graph_In_Home @TC_006  @TC_ALL
Scenario: User navigates to the Graph page
Given user is login to the Dsalgo application
When a user clicks Graph under DataStructureDropdown click
Then user should land on the Graph page  
