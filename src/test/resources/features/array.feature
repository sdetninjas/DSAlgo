@arrayScenario1
Feature: Array Page 

Background: User is on the login page
Given The user opens Login Page
When User enters username "sdetninjas3"
And User enters password "ninjas@123" 
And User clicks "Login" button
And The user clicks a Get Started for Array page 
Then The user should be redirected to Array page

@scenario1 @TC_A_001
Scenario Outline: Array Page

Given The  user is on the Array page
When The user clicks the link for "<pagename>" 
And The user should be redirected to "<pagename>" Page
And The user clicks Try Here Button
Then The user should be redirected to a Python Editor


Examples:
|pagename|
|Arrays in Python| 
|Arrays Using List|
|Basic Operations in Lists|
|Applications of Array|





#@scenario2 @TC_A_002
#Scenario:
#Given The user is on the Arrays in Python Page
#When The user clicks Try Here button of Array in Python Page
#Then The user should be redirected to a page having an Python Editor with a url "https://dsportalapp.herokuapp.com/tryEditor"
# 
#@scenario2 @TC_A_002
#Scenario: Array Page
#
#Given The  user is on the array page
#When The user clicks a "Arrays in Python" link
#Then The user should be redirected to "Array in Python " Page
#
#@scenario3 @TC_A_003
#Scenario: Array in Python Page
#
#Given The user is on the Array in Python Page
#When The user clicks Try Here button of Array in Python Page
#Then The user should be redirected to a page having an Python Editor with a url "https://dsportalapp.herokuapp.com/tryEditor"
#
#@scenario4 @TC_A_004
#Scenario: Python Editor without code
#
#Given The user is on the Python Editor
#When The user clicks the Run Button without entring the code in the Editor
#Then Nothing happens to the page and no error message is displayed
#
#@scenario4 @TC_A_004
#Scenario: Python Editor with invalid code
#
#Given The user is on the Python Editor
#When The user write the invalid code in Editor
#And Click the Run Button
#Then The user should able to see an error message in alert window
#
#@scenario5 @TC_A_005
#Scenario: Python Editor with valid code
#
#Given The user is on the Python Editor
#When The user write the valid code in Editor
#And Click the Run Button
#Then The user should able to see output in the console
#
#@scenario6 @TC_A_006
#Scenario: Array in Python Page
#
#Given The  user is on the Array  in Python page
#When The user clicks a Arrays Using List link
#Then The user should be redirected to "Array Using List" page
#
#@scenario7 @TC_A_007
#Scenario: Array Using List Page
#
#Given The  user is on the Array  Using List page
#When The user clicks Try Here button of Array Using List Page
#Then The user should be redirected to a page having an Python Editor with a url "https://dsportalapp.herokuapp.com/tryEditor"
#
#@scenario8 @TC_A_008
#Scenario: Python Editor without code
#
#Given The user is on the Python Editor
#When The user clicks the Run Button without entring the code in the Editor
#Then Nothing happens to the page and no error message is displayed
#
#@scenario9 @TC_A_009
#Scenario: Python Editor with invalid code
#
#Given The user is on the Python Editor
#When The user write the invalid code in Editor
#And Click the Run Button
#Then The user should able to see an error message in alert window
#
#@scenario10 @TC_A_0010
#Scenario: Python Editor with valid code
#
#Given The user is on the Python Editor
#When The user write the valid code in Editor
#And Click the Run Button
#Then The user should able to see output in the console
#
#@scenario11 @TC_A_0011
#Scenario: Array Using List Page
#
#Given The  user is on the Array  in Using List page
#When The user clicks a Basic Operations in Lists  link
#Then The user should be redirected to "Basic Operations in Lists" page
#
#@scenario13 @TC_A_0013
#Scenario: Basic operations in Lists page 
#
#Given The  user is on the  Basic Operations in Lists   page
#When The user clicks Try Here button of Operations in Lists
#Then The user should be redirected to a page having an Python Editor with a url "https://dsportalapp.herokuapp.com/tryEditor"
#
#@scenario14 @TC_A_0014
#Scenario: Python Editor without code
#
#Given The user is on the Python Editor
#When The user clicks the Run Button without entring the code in the Editor
#Then Nothing happens to the page and no error message is displayed
#
#@scenario15 @TC_A_0015
#Scenario: Python Editor with Invalid code
#
#Given The user is on the Python Editor
#When The user write the invalid code in Editor
#And Click the Run Button 
#Then The user should able to see an error message in alert window
#
#@scenario16 @TC_A_0016
#Scenario: Python Editor with valid code
#
#Given The user is on the Python Editor
#When The user write the valid code in Editor
#And Click the Run Button
#Then The user should able to see output in the console
#
#@scenario17 @TC_A_0017
#Scenario: Basic operations in Lists page
#
#Given The  user is on the Basic Operations in Lists page
#When The user clicks an Applications of Array link
#Then The user should be redirected to " Applications of Array" AA page
#
#@scenario18 @TC_A_0018
#Scenario: Application of Array page
#
#Given The  user is on the  Applications of Array page
#When The user clicks Try Here button of Application of Array page
#Then The user should be redirected to a page having an Python Editor with a url "https://dsportalapp.herokuapp.com/tryEditor"
#
#@scenario19 @TC_A_0019
#Scenario: Python Editor without code 
#
#Given The user is on the Python Editor
#When The user clicks the Run Button without entering the code in the Editor
#Then Nothing happens to the page and no error message is displayed
#
#@scenario20 @TC_A_0020
#Scenario: Python Editor with Invalid code 
#
#Given The user is on the Python Editor
#When The user write the invalid code in Editor
#And Click the Run Button
#Then The user should able to see an error message in alert window
#
#@scenario21 @TC_A_0021
#Scenario: Python Editor with valid code
#
#Given The user is on the Python Editor
#When The user write the valid code in Editor
#And Click the Run Button
#Then The user should able to see output in the console
#
#@scenario22 @TC_A_0022
#Scenario: Application of Array page
#
#Given The  user is on the Applications of Array page
#When The user clicks Practice Questions link
#Then The user should be redirected to practice page having links like "Search the array." ,"Max Consecutive Ones","Find Numbers with Even Number of Digits" and "Squares of a Sorted Array."
#
#@scenario23 @TC_A_0023
#Scenario: Practice Questions page
#
#Given The user is on Practice page 
#When The user clicks search the array  link
#Then The user should be redirected to "QUESTION" page contains a question,an tryEditor with Run and Submit buttons
#
#@scenario24 @TC_A_0024
#Scenario: Python Editor without code 
#
#Given The user is on the Python Editor
#When The user clicks the Run Button without entring the code in the Editor
#Then Nothing happens to the page and no error message is displayed
#
#@scenario25 @TC_A_0025
#Scenario: Python Editor with Invalid code
#
#Given The user is on the Python Editor
#When The user write the invalid code in Editor
#And Click the Run Button
#Then The user should able to see an error message in alert window
#
#@scenario26 @TC_A_0026
#Scenario: Python Editor with valid code
#
#Given The user is on the Python Editor
#When The user write the valid code in Editor
#And Click the Run Button
#Then The user should able to see output in the console
#
#@scenario27 @TC_A_0027
#Scenario: Python Editor
#
#Given The user is on the Python Editor
#When The user write the valid code in Editor
#And Click the Submit  Button
#Then The user see an error message "Error occurred during submission"
#
#@scenario28 @TC_A_0028
#Scenario: Practice Questions page
#
#Given The user is on Practice page 
#When The user clicks Max consecutive ones link
#Then The user should be redirected to "QUESTION" page contains a question,an tryEditor with Run and Submit buttons 
#
#@scenario29 @TC_A_0029
#Scenario: Python Editor
#
#Given The user is on the Python Editor 
#When The user clicks the Run Button without entring the code in the Editor
#Then Nothing happens to the page and no error message is displayed
#
#@scenario30 @TC_A_0030
#Scenario: Python Editor
#
#Given The user is on the Python Editor
#When The user write the invalid code in Editor
#And Click the Run Button
#Then The user should able to see an error message in alert window
#
#@scenario31 @TC_A_0031
#Scenario: Python Editor
#
#Given The user is on the Python Editor
#When The user write the valid code in Editor
#And Click the Run Button
#Then The user should able to see output in the console
#
#@scenario32 @TC_A_0032
#Scenario: Python Editor
#
#Given The user is on the Python Editor
#When The user write the valid code in Editor
#And Click the Submit  Button
#Then The user see an error message "Error occurred during submission"
#
#@scenario33 @TC_A_0033
#Scenario: Practice Questions page
#
#Given The user is on Practice page 
#When The user clicks Find numbers with even number of digits link
#Then The user should be redirected to "QUESTION" page contains a question,an tryEditor with Run and Submit buttons 
#
#@scenario34 @TC_A_0034
#Scenario: Python Editor 
#
#Given The user is on the Python Editor
#When The user clicks the Run Button without entring the code in the Editor
#Then  d """d
#
#@scenario35 @TC_A_0035
#Scenario: 
#
#
#
#@scenario28 @TC_A_0028
#Scenario: 
#
#
#
#@scenario28 @TC_A_0028
#Scenario: 
#
#Given 
#When 
#Then 
#
#@scenario28 @TC_A_0028
#Scenario: 
#
#Given 
#When 
#Then """
# 
#
#
#
#
