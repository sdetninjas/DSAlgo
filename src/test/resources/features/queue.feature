@QueueScenario
Feature: Testing queue features in the DsAlgo Application

@Queuehomepage 
Scenario: User navigates to the Queue page
Given The user is on the DS Algo Home Page
When The user clicks  Get Started button below the "Queue"
Then The user should land in "Queue" page 


@QueueOperationsInQueue
Scenario: User navigates to the Queue Implementation of Queue in Python page
Given The user is on the "Queue" Page
When The user clicks "Implementation of Queue in Python" link
Then The user should be redirected to "Implementation of Queue in Python" page


@QueueImplementation
Scenario: User navigates to the Queue Implementation of Queue in Python page
Given The user is on the "Queue" Page
When The user clicks "Implementation using collections.deque" link
Then The user should be redirected to "Implementation using collections.deque" page


#@QueueApplications
#Scenario: User navigates to the Queue Implementation of Queue in Python page
#Given The user is on the "Queue" Page
#When The user clicks "Implementation using array" link
#Then The user should be redirected to "Implementation using array" page
#
@QueueOperations
Scenario: User navigates to the Queue Implementation of Queue in Python page
Given The user is on the "Queue" Page
When The user clicks "Queue Operations" link
Then The user should be redirected to "Queue Operations" page

@QueueOperationsInQueueTryme
Scenario: User navigates to pythoncode in QueueOperationsInQueue
Given The user is on the "Implementation of Queue in Python" paragraph Page of "Queue"
When The user clicks Try Here  button of "Implementation of Queue in Python" page
Then The user should be redirected to a page having an Python Editor with a url "https://dsportalapp.herokuapp.com/tryEditor"


@QueueImplementationsTryme
Scenario: User navigates to pythoncode in QueueImplementationsTryme
Given The user is on the "Implementation using collections.deque" paragraph Page of "Queue"
When The user clicks Try Here  button of "Implementation using collections.deque" page
Then The user should be redirected to a page having an Python Editor with a url "https://dsportalapp.herokuapp.com/tryEditor"


@QueueApplicationsTryme
Scenario: User navigates to pythoncode in QueueApplicationsTryme
Given The user is on the "Implementation using array" paragraph Page of "Queue"
When The user clicks Try Here  button of "Implementation using array" page
Then The user should be redirected to a page having an Python Editor with a url "https://dsportalapp.herokuapp.com/tryEditor"

@QueueOperationsTryme
Scenario: User navigates to pythoncode in QueueApplicationsTryme
Given The user is on the "Queue Operations" paragraph Page of "Queue"
When The user clicks Try Here  button of "Queue Operations" page
Then The user should be redirected to a page having an Python Editor with a url "https://dsportalapp.herokuapp.com/tryEditor"


@QueueOperationsInQueueParcticeQuestions
Scenario: User redirected to the blank page of QueueOperationsInQueueParcticeQuestions
Given The user is on the "Implementation of Queue in Python" paragraph Page of "Queue"
When The user clicks "Practice Questions" link of "Queue"
Then The user redirected to the blank page of the practice Questions


@QueueImplementationInQueueParcticeQuestions
Scenario:  User redirected to the blank page of QueueImplementationInQueueParcticeQuestions
Given The user is on the "Implementation using collections.deque" paragraph Page of "Queue"
When The user clicks "Practice Questions" link of "Queue"
Then The user redirected to the blank page of the practice Questions

@QueueApplicationsInQueueParcticeQuestions
Scenario:  User redirected to the blank page of QueueApplicationsInQueueParcticeQuestions
Given The user is on the "Implementation using array" paragraph Page of "Queue"
When The user clicks "Practice Questions" link of "Queue"
Then The user redirected to the blank page of the practice Questions
       

@QueueOpearionsInQueueParcticeQuestions
Scenario:  User redirected to the blank page of QueueApplicationsInQueueParcticeQuestions
Given The user is on the "Queue Operations" paragraph Page of "Queue"
When The user clicks "Practice Questions" link of "Queue"
Then The user redirected to the blank page of the practice Questions














