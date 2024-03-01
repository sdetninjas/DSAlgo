@Stack
Feature: Testing Stack features in the DsAlgo Application

@Stackhomepage
Scenario: User navigates to the Stack page
Given The user is on the DS Algo Home Page
When The user clicks  Get Started button below the "Stack"
Then The user should land in "Stack" page 

@StackOperationsInStack
Scenario: User navigates to the Stack Operations in Stack page
Given The user is on the "Stack" Page
When The user clicks "Operations in Stack" link
Then The user should be redirected to "Operations in Stack" page


@StackImplementation
Scenario: User navigates to the Stack Operations in Stack page
Given The user is on the "Stack" Page
When The user clicks "Implementation" link
Then The user should be redirected to "Implementation" page


@StackApplications
Scenario: User navigates to the Stack Operations in Stack page
Given The user is on the "Stack" Page
When The user clicks "Applications" link
Then The user should be redirected to "Applications" page

@StackOperationsInStackTryme
Scenario: User navigates to pythoncode in StackOperationsInStack
Given The user is on the "Operations in Stack" paragraph Page of "Stack"
When The user clicks Try Here  button of "Operations in Stack" page
Then The user should be redirected to a page having an Python Editor with a url "https://dsportalapp.herokuapp.com/tryEditor"


@StackImplementationsTryme
Scenario: User navigates to pythoncode in StackImplementationsTryme
Given The user is on the "Implementation" paragraph Page of "Stack"
When The user clicks Try Here  button of "Implementation" page
Then The user should be redirected to a page having an Python Editor with a url "https://dsportalapp.herokuapp.com/tryEditor"


@StackApplicationsTryme
Scenario: User navigates to pythoncode in StackApplicationsTryme
Given The user is on the "Applications" paragraph Page of "Stack"
When The user clicks Try Here  button of "Applications" page
Then The user should be redirected to a page having an Python Editor with a url "https://dsportalapp.herokuapp.com/tryEditor"

@StackOperationsInStackParcticeQuestions
Scenario: User redirected to the blank page of StackOperationsInStackParcticeQuestions
Given The user is on the "Operations in Stack" paragraph Page of "Stack"
When The user clicks "Practice Questions" link of "Stack"
Then The user redirected to the blank page of the practice Questions


@StackImplementationInStackParcticeQuestions
Scenario:  User redirected to the blank page of StackImplementationInStackParcticeQuestions
Given The user is on the "Implementation" paragraph Page of "Stack"
When The user clicks "Practice Questions" link of "Stack"
Then The user redirected to the blank page of the practice Questions

@StackApplicationsInStackParcticeQuestions
Scenario:  User redirected to the blank page of StackApplicationsInStackParcticeQuestions
Given The user is on the "Applications" paragraph Page of "Stack"
When The user clicks "Practice Questions" link of "Stack"
Then The user redirected to the blank page of the practice Questions
       









