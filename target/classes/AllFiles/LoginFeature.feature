Feature: Login Feature
  Scenario: User logs in with valid credentials

  As a user with an existing account, I aim to log in to the application using my correct credentials to access its features. 
  when I am on the login page, and I input my valid email address "huss1@gmail.com" along with the password "12345678", 
  then proceed to click on the Submit button,
  Definitino of done: the expected outcome is to successfully log in to the application.

    Given I am on the login page
    When I enter valid "huss1@gmail.com" and "12345678"
    And I press Submit
    Then I should be logged in to the application

  Scenario: User logs in with invalid credentials

  As a registered user, I desire notification if I input incorrect credentials to rectify any errors. 
  While on the login page, if I enter an invalid email such as "hussein@gmail.com" and leave the password field blank, 
  then proceed to click Submit, 
  Definition of done: the expected outcome should be an error message indicating that the password field cannot be empty.

    Given I am on the login page
    When I enter invalid "hussein@gmail.com" and ""
    And I press Submit
    Then I should see an error saying password field cannot be left empty

  Scenario: User clicks on Signup button

    As a new user, I want to be able to navigate to the signup page from the login page so that I can create a new account.
    given I am on the login page, when I click on the Signup button, 
    Definition of done: I should be redirected to the signup page.

    Given I am on the login page
    When I click on the Signup button
    Then I should be redirected to the signup page
