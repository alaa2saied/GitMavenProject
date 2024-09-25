Feature: User Register
  Scenario: Verify that user can register successfully with valid data
    Given Open URL
    When Click on sign up button
    And Enter first and last name
    And Enter phone number
    And Enter email address
    And Enter password
    And Click on create an account
    Then User register successfully

  Scenario: Verify that user can not register with invalid name and email
    Given Open URL
    When Click on create an account
    And Ener invalid "<name>" and "<email>"
    And Enter valid data in other field
    And Click on create an account
    Then System should prevent user from registration
    | name     |     | email                |
    |  133     |     | mohamed              |
    |  mo@     |     | ff@example.com       |
    |  omar    |     | ss@example           |

  Scenario: Verify that user can search about product in home page
    Given Open URL
    When click on search box
    And Enter name of product "slipper"
    And click on search button
    Then System should show product successfully
    
Scenario: Verify that user can filter products to women products
  Given Open URL
  When click on women category
  And click on tops
  Then System should show tops product

  Scenario: Verify that user can add product to wish list
    Given Open URL
    When Open bag page in women category
    And Click on wish button of one product
    And Open wish list
    Then System should add product to wish list

Scenario: Verify that user can open facebook page
  Given Open URL
  When Click on facebook icon
  Then System should open facebook page in website




