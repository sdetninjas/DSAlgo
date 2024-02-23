Feature: Testing Data-Structures Introduction features in the DsAlgo Application

@DataStructureIntro 
Scenario: User navigates to the Data-Structure Introduction page
Given The user is on the DS Algo Home Page
When The user clicks  Get Started button below the Data structures-Introduction
Then The user should land in "Data Structures-Introduction" page 

@DataStructureTCpage
Scenario: User navigates to the Data-Structure Introduction time complexity page
Given The user is on the Data Structure Introduction Page
When The user clicks Time Complexity link
Then The user should be redirected to "Time Complexity" page

@pythoncode
Scenario: User navigates to pythoncode
Given The user is on the Time Complexity Page
When The user clicks Try Here  button of Time Complexity page
Then The user should be redirected to a page having an Python Editor with a url "https://dsportalapp.herokuapp.com/tryEditor"

@pythoncodesamemsg
Scenario: User able to see nothing happens the page
Given The user is on the Python Editor
When The user clicks the Run Button without entring the code in the Editor
Then Nothing happens to the page and no error message is displayed1


@phythoncodeerrormsg
Scenario: User should able to see an error message
Given The user is on the Python Editor1
When The user write the invalid code in Editor1
And Click the Run Button1
Then The user should able to see an error message in alert window1


@pythoncodeoutput
Scenario: User should able to see the output 
Given The user is on the Python Editor1
When The user write the valid code in Editor1
And Click the Run Button1
Then The user should able to see output in the console1

#
@practicequestionpage
Scenario: User redirected to the blank page 
Given The user is on the Time Complexity Page1
When The user clicks Practice Questions link1
Then The user redirected to the blank page of the practice Questions1
#
@practiceproblem
Scenario: User doesn't find any practice problem 
Given The user is on the Time Complexity Page1
When The user clicks Practice Questions link1
Then The user doesn't find any practice problems and the page is blank1



