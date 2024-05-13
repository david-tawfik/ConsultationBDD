Feature: Login Feature
  Scenario: User logs in with empty password
    Given I am on the login page
    When I enter invalid "hussein@gmail.com" and ""
    And I press Login
    Then I should see an error saying Epic sadface: Password is required

  Scenario: User logs in with empty username
    Given I am on the login page
    When I enter invalid "" and "12345678"
    And I press Login
    Then I should see an error saying Epic sadface: Username is required

  Scenario: User logs in with wrong username or password
    Given I am on the login page
    When I enter invalid "hussein@gmail.com" and "hello"
    And I press Login
    Then I should see an error saying Epic sadface: Username and password do not match any user in this service

  Scenario: User logs in with valid credentials
    Given I am on the login page
    When I enter valid "standard_user" and "secret_sauce"
    And I press Login
    Then I should be logged in to the application


  # Scenario: User logs in with problem_user username
  #   Given I am on the login page
  #   When I enter valid "problem_user" and "secret_sauce"
  #   And I press Login
  #   Then I should be logged in to the application

  # Scenario: User logs in with error_user username
  #   Given I am on the login page
  #   When I enter valid "error_user" and "secret_sauce"
  #   And I press Login
  #   Then I should be logged in to the application




