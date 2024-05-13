Feature: Login Feature
  Scenario: User logs in with valid credentials
    Given I am on the login page
    When I enter valid "huss1@gmail.com" and "12345678"
    And I press Submit
    Then I should be logged in to the application

  Scenario: User logs in with invalid credentials
    Given I am on the login page
    When I enter invalid "hussein@gmail.com" and ""
    And I press Submit
    Then I should see an error saying password field cannot be left empty

    Scenario: User clicks on Signup button
    Given I am on the login page
    When I click on the Signup button
    Then I should be redirected to the signup page

