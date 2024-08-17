Feature:
  Scenario: Verify that user can register with valid data
    Given Open URL
    When Enter valid data in name as "gena" and email "gena@example.com"
    And Click on register button
    Then User can navigate to register page