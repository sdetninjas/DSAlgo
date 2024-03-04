@GraphScenario
Feature: Graph Page

@Graphhomepage 
Scenario: User navigates to the Graph page
Given The user is on the DS Algo Home Page
When The user clicks  Get Started button below the "Graph"
Then The user should land in "Graph" page 


@GraphInGraph
Scenario: User navigates to the Graph Implementation of Graph in Python page
Given The user is on the "Graph" Page
When The user clicks "Graph" link
Then The user should be redirected to "Graph" page


@GraphImplementation
Scenario: User navigates to the Graph Implementation of Graph in Python page
Given The user is on the "Graph" Page
When The user clicks "Graph Representations" link
Then The user should be redirected to "Graph Representations" page


@GraphInGraphTryme
Scenario: User navigates to pythoncode in GraphOperationsInGraph
Given The user is on the "Graph" paragraph Page of "Graph"
When The user clicks Try Here  button of "Graph" page
Then The user should be redirected to a page having an Python Editor with a url "https://dsportalapp.herokuapp.com/tryEditor"


@GraphRepresentationsTryme
Scenario: User navigates to pythoncode in GraphImplementationsTryme
Given The user is on the "Graph Representations" paragraph Page of "Graph"
When The user clicks Try Here  button of "Graph Representations" page
Then The user should be redirected to a page having an Python Editor with a url "https://dsportalapp.herokuapp.com/tryEditor"



@GraphInGraphPracticeQuestions
Scenario: User redirected to the blank page of GraphOperationsInGraphParcticeQuestions
Given The user is on the "Graph" paragraph Page of "Graph"
When The user clicks "Practice Questions" link of "Graph"
Then The user redirected to the blank page of the practice Questions


@GraphGraphRepresentationsPracticeQuestions
Scenario:  User redirected to the blank page of GraphImplementationInGraphParcticeQuestions
Given The user is on the "Graph Representations" paragraph Page of "Graph"
When The user clicks "Practice Questions" link of "Graph"
Then The user redirected to the blank page of the practice Questions













