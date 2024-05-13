Feature: SignUp Features
  Scenario: Valid SignUp

    As a new user, I should be able to create an account to access the application's features.
    when I provide my first name, last name, email address, and password on the SignUp page and click submit,
    Definition of done: the system should create a new account for me and redirect me to the home page.

    Given the user is in the SignUp page
    When the user enters "firstname", "lastname", "emaifl1246@email.com", "password"
    And the user clicks on the submit button
    Then the system should create a new account for the user and redirect them to the home page.

  Scenario: Invalid SignUp - Missing firstname

    As a new user, I should be informed if I forget to enter my first name during sign up.
    when I leave the first name field blank and submit the form,
    Definition of done: the system should display an error message indicating the missing first name.

    Given the user is in the SignUp page
    When the user enters "", "lastname", "hussein54@hadidy.com", "password"
    And the user clicks on the submit button
    Then the system should display an error message missing firstname field.

  Scenario: Invalid SignUp - Missing email

    As a new user, I should be informed if I forget to enter my email during sign up. 
    when I leave the email field blank and submit the form
    Definition of done: the system should display an error message indicating the missing email.

    Given the user is in the SignUp page
    When the user enters "firstname", "lastname", "", "password"
    And the user clicks on the submit button
    Then the system should display an error message missing email field.

  Scenario: Invalid SignUp - Already Taken Email

    As a new user, I should be informed if the email I entered is already associated with an existing account. 
    when I provide an email that is already registered and submit the form, 
    Definition of done: the system should display an error message indicating that the email is already taken.

    Given the user is in the SignUp page
    When the user enters "firstname", "lastname", "hussein@hadidy.com", "password"
    And the user clicks on the submit button
    Then the system should display an error message of email already taken.
