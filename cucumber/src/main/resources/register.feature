Feature:User Registration
  @happy
  Scenario Outline: Verify that user can register with valid data
    Given Open URL
    When Enter valid data in "<Name>" and "<email>"
    And Click on register button
    Then User can navigate to register page
   Examples:
     | Name | email         |
     |ahmed |ahmed@examp.com|
     |mona  |mona@ll.com    |

  Scenario: Verify that user can choose destination of your travel
    Given Open URL Almatar
    When Enter going to
    And Enter check in and check out
    And Enter visitor and their age
    And Click on search hotels
    Then System should show numbers of hotel in this destination