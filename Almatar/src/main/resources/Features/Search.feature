Feature: User search
  Scenario: Verify that user can search about hotels
    Given Open URL
    When Enter country that searched hotels in " Barcelona"
    And Enter date
    And Enter number of adults "3" and children "2"
    And Click on apply
    And Click on search button
    And Set five stars and maximum price
    Then Number of hotels shown in search page