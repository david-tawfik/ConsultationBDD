Feature: SignUp Features
  Scenario: Valid SignUp
    Given the user is in the SignUp page
    When the user enters "firstname", "lastname", "emaifl1246@email.com", "password"
    And the user clicks on the submit button
    Then the system should create a new account for the user and redirect them to the home page.

    Scenario: Invalid SignUp - Missing firstname
    Given the user is in the SignUp page
    When the user enters "", "lastname", "hussein54@hadidy.com", "password"
    And the user clicks on the submit button
    Then the system should display an error message missing firstname field.

    Scenario: Invalid SignUp - Missing email
    Given the user is in the SignUp page
    When the user enters "firstname", "lastname", "", "password"
    And the user clicks on the submit button
    Then the system should display an error message missing email field.

    Scenario: Invalid SignUp - Already Taken Email
    Given the user is in the SignUp page
    When the user enters "firstname", "lastname", "hussein@hadidy.com", "password"
    And the user clicks on the submit button
    Then the system should display an error message of email already taken.
