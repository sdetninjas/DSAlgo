@tagTree
Feature: Checking DS also tree

  Background: 
    Given User logged in
      | username   | password   |
      | sdetninjas | ninjas@123 |

  #When The user clicks login button after entering valid "sdetninjas" and valid "ninjas@123"
  #Then The user should land in Data Structure Home Page
  @tag1
  Scenario: DS_algo Home page
    Given The user comes back to the DS_algo home page to select or start DS Tree
    When The user select ""Tree"" from the Data Structure dropdown menu clicks the ""Get Started"" button in Tree Panel"
    Then The user should be redirected to ""Tree"" page."

  @tag2
  Scenario: Tree home page
    Given The user is on the ""Tree"" page
    When The user clicks ""Overview of Trees"" link
    Then The user should be redirected to ""Overview of Trees"" page."

  @tag3
  Scenario: Overview of Trees
    Given The user is on the ""Overview of Trees"" page
    When The user clicks ""Try Here"" button
    Then The user should be redirected to a page having Editor and run button

  @tag4
  Scenario: Python Editor page without data
    Given The user is on the Python Editor
    When The user clicks the Run Button without entering the code in the Editor
    Then Nothing happens to the page and no error message is displayed

  @tag5
  Scenario: Python Editor page with valid data
    Given The user is on the editor page
    When The user writes the valid python code	and click run button
    Then The user is able to see the output inside the console.

  @tag6
  Scenario: Python Editor page with invalid data
    Given The user is on the editor page
    When The user writes the invalid python code and click run button
    Then The user see error msg in alert window

  @tag7
  Scenario: Python Editor page with alert message
    Given The user is on the editor page with Alert error message
    When The user click the ok button in the alert window
    Then The user is on the same page having Editor and Run button

  @tag8
  Scenario: Overview of Trees
    Given The user go back and is on the ""Overview of Trees"" page
    When The user clicks ""Terminologies"" link"
    Then The user should be redirected to ""Terminologies"" page."

  @tag9
  Scenario: Terminologies
    Given The user is on the "Terminologies" page"
    When The user clicks "Try Here" button
    Then The user should be redirected to a page having Editor and run button

  @tag10
  Scenario: Python Editor page without data
    Given The user is on the Python Editor
    When The user clicks the Run Button without entring the code in the Editor
    Then Nothing happens to the page and no error message is displayed

  @tag11
  Scenario: Python Editor page with valid data
    Given The user is on the editor page
    When The user writes the valid python code	click run button
    Then The user is able to see the output inside the console.

  @tag12
  Scenario: Python Editor page with invalid data
    Given The user is on the editor page
    When The user writes the invalid python code and click run button
    Then The user see error msg in alert window

  @tag13
  Scenario: Python Editor page with alert message
    Given The user is on the editor page with Alert error message
    When The user click the ok button in the alert window
    Then The user is on the same page having Editor and Run button

  @tag14
  Scenario: Terminologies
    Given The user is on the ""Terminologies"" page"
    When The user clicks ""Types of Trees"" link"
    Then The user should be redirected to ""Types of Trees"" page."

  @tag15
  Scenario: Types of Trees
    Given The user is on the ""Types of Trees"" page"
    When The user clicks ""Try Here"" button"
    Then The user should be redirected to a page having Editor and run button

  @tag16
  Scenario: Python Editor page without data
    Given The user is on the Python Editor
    When The user clicks the Run Button without entring the code in the Editor
    Then Nothing happens to the page and no error message is displayed

  @tag17
  Scenario: Python Editor page with valid data
    Given The user is on the editor page
    When The user writes the valid python code	 and click run button
    Then The user is able to see the output inside the console.

  @tag18
  Scenario: Python Editor page with invalid data
    Given The user is on the editor page
    When The user writes the invalid python code and click run button
    Then The user see error msg in alert window

  @tag19
  Scenario: Python Editor page with alert message
    Given The user is on the editor page with Alert error message
    When The user click the ok button in the alert window
    Then The user is on the same page having Editor and Run button

  @tag20
  Scenario: Types of Trees
    Given The user is on the ""Types of Trees"" page"
    When The user clicks ""Tree Traversals"" link"
    Then The user should be redirected to ""Tree Traversals"" page."

  @tag21
  Scenario: Tree Traversals
    Given The user is on the ""Tree Traversals"" page"
    When The user clicks ""Try Here"" button"
    Then The user should be redirected to a page having Editor and run button

  @tag22
  Scenario: Python Editor page without data
    Given The user is on the Python Editor
    When The user clicks the Run Button without entering the code in the Editor
    Then Nothing happens to the page and no error message is displayed

  @tag23
  Scenario: Python Editor page with valid data
    Given The user is on the editor page
    When The user writes the valid python code and click run button
    Then The user is able to see the output inside the console.

  @tag24
  Scenario: Python Editor page with invalid data
    Given The user is on the editor page
    When The user writes the invalid python code and click run button
    Then The user see error msg in alert window

  @tag25
  Scenario: Python Editor page with alert message
    Given The user is on the editor page with Alert error message
    When The user click the ok button in the alert window
    Then The user is on the same page having Editor and Run button

  @tag26
  Scenario: Tree Traversals
    Given The user is on the ""Tree Traversals"" page"
    When The user clicks ""Traversals-Illustration"" link"
    Then The user should be redirected to ""Traversals-Illustration"" page."s

  @tag27
  Scenario: Traversals-Illustration
    Given The user is on the ""Traversals-Illustration"" page"
    When The user clicks ""Try Here"" button"
    Then The user should be redirected to a page having Editor and run button

  @tag28
  Scenario: Python Editor page without data
    Given The user is on the Python Editor
    When The user clicks the Run Button without entring the code in the Editor
    Then Nothing happens to the page and no error message is displayed

  @tag29
  Scenario: Python Editor page with valid data
    Given The user is on the editor page
    When The user writes the valid python code	click run button
    Then The user is able to see the output inside the console.

  @tag30
  Scenario: Python Editor page with invalid data
    Given The user is on the editor page
    When The user writes the invalid python code and click run button
    Then The user see error msg in alert window

  @tag31
  Scenario: Python Editor page with alert message
    Given The user is on the editor page with Alert error message
    When The user click the ok button in the alert window
    Then The user is on the same page having Editor and Run button

  @tag32
  Scenario: Traversals-Illustration
    Given The user is on the ""Traversals-Illustration"" page"
    When The user clicks ""Binary Trees"" link"
    Then The user should be redirected to ""Binary Trees"" page."

  @tag33
  Scenario: Binary Trees
    Given The user is on the ""Binary Trees"" page"
    When The user clicks ""Try Here"" button"
    Then The user should be redirected to a page having Editor and run button

  @tag34
  Scenario: Python Editor page without data
    Given The user is on the Python Editor
    When The user clicks the Run Button without entering the code in the Editor
    Then Nothing happens to the page and no error message is displayed

  @tag35
  Scenario: Python Editor page with valid data
    Given The user is on the editor page
    When The user writes the valid python code and click run button
    Then The user is able to see the output inside the console.

  @tag36
  Scenario: Python Editor page with invalid data
    Given The user is on the editor page
    When The user writes the invalid python code and click run button
    Then The user see error msg in alert window

  @tag37
  Scenario: Python Editor page with alert message
    Given The user is on the editor page with Alert error message
    When The user click the ok button in the alert window
    Then The user is on the same page having Editor and Run button

  @tag38
  Scenario: Binary Trees
    Given The user is on the ""Binary Trees"" page"
    When The user clicks ""Types of Binary Trees"" link"
    Then The user should be redirected to ""Types of Binary Trees"" page."

  @tag39
  Scenario: Types of Binary Trees
    Given The user is on the ""Types of Binary Trees"" page"
    When The user clicks ""Try Here"" button"
    Then The user should be redirected to a page having Editor and run button

  @tag40
  Scenario: Python Editor page without data
    Given The user is on the Python Editor
    When The user clicks the Run Button without entering the code in the Editor
    Then Nothing happens to the page and no error message is displayed

  @tag41
  Scenario: Python Editor page with valid data
    Given The user is on the editor page
    When The user writes the valid python code	click run button
    Then The user is able to see the output inside the console.

  @tag42
  Scenario: Python Editor page with invalid data
    Given The user is on the editor page
    When The user writes the invalid python code and click run button
    Then The user see error msg in alert window

  @tag43
  Scenario: Python Editor page with alert message
    Given The user is on the editor page with Alert error message
    When The user click the ok button in the alert window
    Then The user is on the same page having Editor and Run button

  @tag44
  Scenario: Types of Binary Trees
    Given The user is on the ""Types of Binary Trees"" page"
    When The user clicks ""Implementation in Python Trees"" link"
    Then The user should be redirected to ""Implementation in Python"" page."

  @tag45
  Scenario: Implementation in Python
    Given The user is on the ""Implementation in Python"" page"
    When The user clicks ""Try Here"" button"
    Then The user should be redirected to a page having Editor and run button

  @tag46
  Scenario: Python Editor page without data
    Given The user is on the Python Editor
    When The user clicks the Run Button without entering the code in the Editor
    Then Nothing happens to the page and no error message is displayed

  @tag47
  Scenario: Python Editor page with valid data
    Given The user is on the editor page
    When The user writes the valid python code and click run button
    Then The user is able to see the output inside the console.

  @tag48
  Scenario: Python Editor page with invalid data
    Given The user is on the editor page
    When The user writes the invalid python code and click run button
    Then The user see error msg in alert window

  @tag49
  Scenario: Python Editor page with alert message
    Given The user is on the editor page with Alert error message
    When The user click the ok button in the alert window
    Then The user is on the same page having Editor and Run button

  @tag50
  Scenario: Implementation in Python
    Given The user is on the ""Implementation in Python"" page"
    When The user clicks ""Binary Tree Traversals"" link"
    Then The user should be redirected to ""Binary Tree Traversals"" page."

  @tag51
  Scenario: Binary Tree Traversals
    Given The user is on the ""Binary Tree Traversals"" page"
    When The user clicks ""Try Here"" button"
    Then The user should be redirected to a page having Editor and run button

  @tag52
  Scenario: Python Editor page without data
    Given The user is on the Python Editor
    When The user clicks the Run Button without entering the code in the Editor
    Then Nothing happens to the page and no error message is displayed

  @tag53
  Scenario: Python Editor page with valid data
    Given The user is on the editor page
    When The user writes the valid python code and click run button
    Then The user is able to see the output inside the console.

  @tag54
  Scenario: Python Editor page with invalid data
    Given The user is on the editor page
    When The user writes the invalid python code and click run button
    Then The user see error msg in alert window

  @tag55
  Scenario: Python Editor page with alert message
    Given The user is on the editor page with Alert error message
    When The user click the ok button in the alert window
    Then The user is on the same page having Editor and Run button

  @tag56
  Scenario: Binary Tree Traversals
    Given The user is on the ""Binary Tree Traversals"" page"
    When The user clicks ""Implementation of Binary Trees"" link"
    Then The user should be redirected to ""Implementation of Binary Trees"" page."

  @tag57
  Scenario: Implementation of Binary Trees
    Given The user is on the ""Implementation of Binary Trees"" page"
    When The user clicks ""Try Here"" button"
    Then The user should be redirected to a page having Editor and run button

  @tag58
  Scenario: Python Editor page without data
    Given The user is on the Python Editor
    When The user clicks the Run Button without entering the code in the Editor
    Then Nothing happens to the page and no error message is displayed

  @tag59
  Scenario: Python Editor page with valid data
    Given The user is on the editor page
    When The user writes the valid python code	and click run button
    Then The user is able to see the output inside the console.

  @tag60
  Scenario: Python Editor page with invalid data
    Given The user is on the editor page
    When The user writes the invalid python code and click run button
    Then The user see error msg in alert window

  @tag61
  Scenario: Python Editor page with alert message
    Given The user is on the editor page with Alert error message
    When The user click the ok button in the alert window
    Then The user is on the same page having Editor and Run button

  @tag62
  Scenario: Implementation of Binary Trees
    Given The user is on the ""Implementation of Binary Trees"" page"
    When The user clicks ""Applications of Binary trees"" link"
    Then The user should be redirected to ""Applications of Binary trees"" page."

  @tag63
  Scenario: Applications of Binary trees
    Given The user is on the ""Applications of Binary trees"" page"
    When The user clicks ""Try Here"" button"
    Then The user should be redirected to a page having Editor and run button

  @tag64
  Scenario: Python Editor page without data
    Given The user is on the Python Editor
    When The user clicks the Run Button without entering the code in the Editor
    Then Nothing happens to the page and no error message is displayed

  @tag65
  Scenario: Python Editor page with valid data
    Given The user is on the editor page
    When The user writes the valid python code	click run button
    Then The user is able to see the output inside the console.

  @tag66
  Scenario: Python Editor page with invalid data
    Given The user is on the editor page
    When The user writes the invalid python code	click run button
    Then The user see error msg in alert window

  @tag67
  Scenario: Python Editor page with alert message
    Given The user is on the editor page with Alert error message
    When The user click the ok button in the alert window
    Then The user is on the same page having Editor and Run button

  @tag68
  Scenario: Applications of Binary trees
    Given The user is on the ""Applications of Binary trees"" page"
    When The user clicks ""Binary Search Trees"" link"
    Then The user should be redirected to ""Binary Search Trees"" page."

  @tag69
  Scenario: Binary Search Trees
    Given The user is on the ""Binary Search Trees"" page"
    When The user clicks ""Try Here"" button"
    Then The user should be redirected to a page having Editor and run button

  @tag70
  Scenario: Python Editor page without data
    Given The user is on the Python Editor
    When The user clicks the Run Button without entering the code in the Editor
    Then Nothing happens to the page and no error message is displayed

  @tag71
  Scenario: Python Editor page with valid data
    Given The user is on the editor page
    When The user writes the valid python code	click run button
    Then The user is able to see the output inside the console.

  @tag72
  Scenario: Python Editor page with invalid data
    Given The user is on the editor page
    When The user writes the invalid python code and click run button
    Then The user see error msg in alert window

  @tag73
  Scenario: Python Editor page with alert message
    Given The user is on the editor page with Alert error message
    When The user click the ok button in the alert window
    Then The user is on the same page having Editor and Run button

  @tag74
  Scenario: Binary Search Trees
    Given The user is on the ""Binary Search Trees"" page"
    When The user clicks ""Implementation Of BST"" link"
    Then The user should be redirected to ""Implementation Of BST"" page."

  @tag75
  Scenario: Implementation Of BST
    Given The user is on the ""Implementation Of BST"" page"
    When The user clicks ""Try Here"" button"
    Then The user should be redirected to a page having Editor and run button

  @tag76
  Scenario: Python Editor page without data
    Given The user is on the Python Editor
    When The user clicks the Run Button without entering the code in the Editor
    Then Nothing happens to the page and no error message is displayed

  @tag77
  Scenario: Python Editor page with valid data
    Given The user is on the editor page
    When The user writes the valid python code	click run button
    Then The user is able to see the output inside the console.

  @tag78
  Scenario: Python Editor page with invalid data
    Given The user is on the editor page
    When The user writes the invalid python code and click run button
    Then The user see error msg in alert window

  @tag79
  Scenario: Python Editor page with alert message
    Given The user is on the editor page with Alert error message
    When The user click the ok button in the alert window
    Then The user is on the same page having Editor and Run button

  @tag80
  Scenario: Implementation Of BST
    Given The user is on the ""Implementation Of BST"" page"
    When The user clicks ""Practice Questions"" link"
    Then The user should be redirected to ""Practice Questions"" page."
