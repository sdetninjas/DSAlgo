@GraphScenario
Feature: Testing graph features in the DsAlgo Application

@Graphhomepage
Scenario: User navigates to the graph console page
Given The user comes back to the Ds_algo home page to select or start DS Graph
When The user select "Graph"from the Data Structure dropdown menu or clicks the "Get Started" button in Graoh panel 
Then The user should be redirected to "Graph" home page

@Graphhomepage 
Scenario: User navigates to the graph console page 
Given The user is on the "Graph" page 
When The user clicks "Graph"link
Then The user should be redirected to "Graph" page

@Graphpage 
Scenario: User navigates to the graph console page 
Given The user is on the "Graph"page
When The user clicks "Graph Representation"link
Then The user should be redirected to "Graph Representation"page

@GraphRepresentation
Scenario: User navigates to the graph console page 
Given The user is on the "Graph Representation"page
When The user clicks "Try Here"button
Then The user should be redirected to a page having Editor and run button

@pythonEditorpagewithoutdata
Scenario: User navigates to the graph console page 
Given The user is on the python Editor1
When The user clicks the Run Button without entering the code in the Editor1
Then Nothing happens to the page and no error message is displayed1

@pythonEditorpagewithvaliddata
Scenario: User navigates to the graph console page 
Given The user is on the editor page1
When The user writes the valid python code and click run button1
Then The user is able to see the output inside the console1

@pythonEditorpagewithinvaliddata
Scenario: User navigates to the graph console page 
Given The user is onthe editor page1
When The user writes the invalid python code and click run button1
Then The user see error msg in alert window1

@pythonEditorpagewithalertmessage
Scenario: User navigates to the graph console page
Given The user is on the editor page with Alert Error message1
When The user click the ok button in the alert window1
Then The user is on the same page having Editor and Run button1  





