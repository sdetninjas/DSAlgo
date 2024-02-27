Feature: Testing Data-Structures Introduction features in the DsAlgo Application

@DataStructureIntro 
Scenario: User navigates to the Data-Structure Introduction page
Given The user is on the DS Algo Home Page
When The user clicks  Get Started button below the "Data Structures-Introduction"
Then The user should land in "Data Structures-Introduction" page 

@DataStructureTCpage
Scenario: User navigates to the Data-Structure Introduction time complexity page
Given The user is on the "Data Structures-Introduction" Page
When The user clicks "Time Complexity" link
Then The user should be redirected to "Time Complexity" page

@pythoncode
Scenario: User navigates to pythoncode
Given The user is on the "Time Complexity" paragraph Page of "Data Structures-Introduction"
When The user clicks Try Here  button of "Time Complexity" page
Then The user should be redirected to a page having an Python Editor with a url "https://dsportalapp.herokuapp.com/tryEditor"

#
@practicequestionpage
Scenario: User redirected to the blank page 
Given The user is on the "Time Complexity" paragraph Page of "Data Structures-Introduction"
When The user clicks "Practice Questions" link of "Data Structures-Introduction"
Then The user redirected to the blank page of the practice Questions
#
@practiceproblem
Scenario: User doesn't find any practice problem 
Given  The user is on the "Time Complexity" paragraph Page of "Data Structures-Introduction"
When The user clicks "Practice Questions" link of "Data Structures-Introduction"
Then The user doesn't find any practice problems and the page is blank
#

