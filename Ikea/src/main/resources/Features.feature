Feature: product page
  @happy
  Scenario: Verify that user can add product to cart successfully
    Given Open URL
    When Click on sign up button
    And Click on create new  account
    And Enter  valid data in all field
    And Click on create
    And Navigate back to home page
    And Click on sofa
    And Filter result from high to low
    And Add "3" product to cart
    And Move second element to wish list
    And Remove third product from cart
    And Click on checkout button
    And Enter valid data in all field in checkout page
    Then System register successfully