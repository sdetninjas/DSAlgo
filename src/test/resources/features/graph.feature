@GraphScenario
Feature: Testing graph features in the DsAlgo Application

@Graphhomepage
Scenario: User navigates to the Graph page
Given The user is on the DS Algo Home Page
When The user clicks  Get Started button below the "Graph"
Then The user should land in "Graph" page 

#@Graphhomepage 
#Scenario: User navigates to the graph console page 
#Given The user is on the "Graph" page 
#When The user clicks "Graph"link
#Then The user should be redirected to "Graph" page
#
#@Graphpage 
#Scenario: User navigates to the graph console page 
#Given The user is on the "Graph"page
#When The user clicks "Graph Representation"link
#Then The user should be redirected to "Graph Representation"page
#
#@GraphRepresentation
#Scenario: User navigates to the graph console page 
#Given The user is on the "Graph Representation"page
#When The user clicks "Try Here"button
#Then The user should be redirected to a page having Editor and run button
#
#@pythonEditorpagewithoutdata
#Scenario: User navigates to the graph console page 
#Given The user is on the python Editor
#When The user clicks the Run Button without entering the code in the Editor
#Then Nothing happens to the page and no error message is displayed
#
#@pythonEditorpagewithvaliddata
#Scenario: User navigates to the graph console page 
#Given The user is on the editor page
#When The user writes the valid python code and click run button
#Then The user is able to see the output inside the console
#
#@pythonEditorpagewithinvaliddata
#Scenario: User navigates to the graph console page 
#Given The user is onthe editor page
#When The user writes the invalid python code and click run button
#Then The user see error msg in alert window
#
#@pythonEditorpagewithalertmessage
#Scenario: User navigates to the graph console page
#Given The user is on the editor page with Alert Error message
#When The user click the ok button in the alert window
#Then The user is on the same page having Editor and Run button  





